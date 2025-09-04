pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
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