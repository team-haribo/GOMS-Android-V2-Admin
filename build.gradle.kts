// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {

    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath(Dependency.GradlePlugin.GRADLE_ANDROID)
        classpath(Dependency.GradlePlugin.GRADLE_KOTLIN)
        classpath(Dependency.GradlePlugin.GRADLE_HILT)
        classpath(Dependency.Google.GMS_GOOGLE_SERVICE)
    }
}

plugins {
    id(Dependency.GradlePlugin.GRADLE_KTLINT) version Versions.KTLINT_PLUGIN
    id(Dependency.GradlePlugin.ANDROID_APPLICATION) version Versions.GRADLE_ANDROID apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
