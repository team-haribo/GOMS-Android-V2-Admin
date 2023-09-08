plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
}

android {
    namespace = "com.goms.design_system"
    compileSdk = Versions.COMPILE_SDK_VERSION

    defaultConfig {
        minSdk = Versions.MIN_SDK_VERSION
        targetSdk = Versions.TARGET_SDK_VERSION

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = Versions.JAVA_VERSION
        targetCompatibility = Versions.JAVA_VERSION
    }
    kotlinOptions {
        jvmTarget = Versions.JAVA_VERSION.toString()
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.COMPOSE
    }
}

dependencies {

    implementation(Dependency.AndroidX.CORE_KTX)
    implementation(Dependency.AndroidX.LIFECYCLE_RUNTIME)
    implementation(Dependency.Compose.ACTIVITY_COMPOSE)
    implementation(Dependency.Compose.COMPOSE)
    implementation(Dependency.Compose.MATERIAL)
    implementation(Dependency.Compose.COMPOSE_PREVIEW)
    implementation(Dependency.Compose.MATERIAL3)
    testImplementation(Dependency.UnitTest.JUNIT)
    androidTestImplementation(Dependency.AndroidTest.ANDROID_JUNIT)
    androidTestImplementation(Dependency.AndroidTest.ESPRESSO_CORE)
    androidTestImplementation(Dependency.UnitTest.COMPOSE_JUNIT)
    debugImplementation(Dependency.UnitTest.COMPOSE_MANIFEST)
    implementation(Dependency.Lottie.LOTTIE)

    implementation(Dependency.Google.HILT_ANDROID)
    kapt(Dependency.Google.HILT_ANDROID_COMPILER)
}