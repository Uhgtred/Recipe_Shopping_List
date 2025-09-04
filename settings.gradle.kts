pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "Recipe_Shopping_List"
include(":app")
include(":androidApp")
include(":desktopApp")
include(":shared")
// Optional
include(":webApp")
include(":iosApp")