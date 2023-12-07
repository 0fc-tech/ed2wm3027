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
    }
}

rootProject.name = "Demonstrations"
include(":app")
include(":mod2demoihm")
include(":mod3kotlin")
include(":enishop")
include(":mod4viewdatabinding")
include(":mod5navcomponent")
include(":mod5menu")
include(":mod6intent")
include(":mod7lifecycle")
