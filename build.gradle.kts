// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {

    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath(Dependency.Hilt.HILT_ANDROID_GRADLE)
        classpath(Dependency.GradlePlugins.GOOGLE_PLUGIN)
    }
}

plugins {
    id(Dependency.GradlePlugins.ANDROID_APPLICATION) version Versions.ANDROID apply false
    id(Dependency.GradlePlugins.ANDROID_LIBRARY) version Versions.ANDROID apply false
    id(Dependency.GradlePlugins.KOTLIN_ANDROID) version Versions.ANDROID_KOTLIN apply false
    id(Dependency.GradlePlugins.GRADLE_KTLINT) version Versions.GRADLE_KTLINT
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
