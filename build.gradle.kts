// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.ktlint) apply false
    alias(libs.plugins.kover) apply false
}

// Helper task: validates Android SDK environment to avoid CI failures when SDK is not preinstalled or path is unwritable
// Usage: ./gradlew doctorAndroidSdk
// - Fails early with a clear message if required components are missing
// - Does not attempt to auto-download (honors android.sdkDownload=false)
tasks.register("doctorAndroidSdk") {
    group = "verification"
    description = "Validates Android SDK location and required components"
    doLast {
        val envRoot = System.getenv("ANDROID_SDK_ROOT") ?: System.getenv("ANDROID_HOME")
        val localProps = rootProject.file("local.properties")
        val sdkDirFromLocal =
            if (localProps.exists()) {
                val props = java.util.Properties()
                localProps.inputStream().use { ins -> props.load(ins) }
                props.getProperty("sdk.dir")
            } else {
                null
            }
        val rootPath = envRoot ?: sdkDirFromLocal
        require(!rootPath.isNullOrBlank()) {
            "ANDROID_SDK_ROOT/ANDROID_HOME not set and no sdk.dir in local.properties. Set a writable SDK path or add sdk.dir."
        }
        val sdk = File(rootPath)
        require(sdk.exists() && sdk.isDirectory && sdk.canWrite()) {
            "SDK directory '$rootPath' is not a writable directory. Point ANDROID_SDK_ROOT to a writable location."
        }
        // Check minimal components: Build-Tools 35 and Platform android-36 (as per AGP/compileSdk)
        val buildTools35 = java.io.File(sdk, "build-tools/35.0.0").exists()
        val platform36 = java.io.File(sdk, "platforms/android-36").exists()
        require(buildTools35) { "Missing Build-Tools 35.0.0. Install via sdkmanager 'build-tools;35.0.0'." }
        require(platform36) { "Missing Platform android-36. Install via sdkmanager 'platforms;android-36'." }
        println("[doctorAndroidSdk] OK: SDK path '$rootPath' with Build-Tools 35.0.0 and Platform android-36 present.")
    }
}
// CI-only: fail fast with clear diagnostics before Android plugin tries to access SDK
if (System.getenv("CI") == "true") {
    subprojects {
        afterEvaluate {
            tasks.matching { it.name == "preBuild" }.configureEach {
                dependsOn(rootProject.tasks.named("doctorAndroidSdk"))
            }
        }
    }
}
