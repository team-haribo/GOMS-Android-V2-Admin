plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("dagger.hilt.android.plugin")
    kotlin("kapt")
}

android {
    namespace = "com.example.goms_android_v2_admin"
    compileSdk = Versions.COMPILE_SDK_VERSION

    defaultConfig {
        applicationId = "com.example.goms_android_v2_admin"
        minSdk = Versions.MIN_SDK_VERSION
        targetSdk = Versions.TARGET_SDK_VERSION
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        viewBinding = true
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.COMPOSE
    }
    packagingOptions {
        resources {
            excludes.add("/META-INF/AL2.0")
            excludes.add("/META-INF/LGPL2.1")
        }
    }
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":di"))

    implementation(Dependency.AndroidX.APP_COMPAT)
    implementation(Dependency.AndroidX.CORE_KTX)
    implementation(Dependency.AndroidX.FRAGMENT_KTX)
    implementation(Dependency.AndroidX.CONSTRAINT_LAYOUT)
    implementation(Dependency.AndroidX.LIFECYCLE_VIEWMODEL_KTX)
    implementation(Dependency.AndroidX.LIFECYCLE_RUNTIME)
    implementation(Dependency.AndroidX.RECYCLER_VIEW)
    implementation(Dependency.AndroidX.VIEWPAGER_2)

    implementation(Dependency.Compose.ACTIVITY_COMPOSE)
    implementation(Dependency.Compose.COMPOSE)
    implementation(Dependency.Compose.VIEW_BINDING)
    implementation(Dependency.Compose.COMPOSE_PREVIEW)
    implementation(Dependency.Compose.MATERIAL)
    implementation(Dependency.Compose.COMPOSE_HILT_NAV)
    implementation(Dependency.Compose.MATERIAL3)

    implementation(Dependency.Google.GMS_PLAY_SERVICE_AUTH)

    implementation(Dependency.GAuth.GAUTH)
    implementation(Dependency.AndroidX.ROOM_KTX)
    kapt(Dependency.AndroidX.ROOM_COMPILER)

    implementation(Dependency.Kotlin.COROUTINES_CORE)
    implementation(Dependency.Kotlin.COROUTINES_ANDROID)

    implementation(Dependency.Google.MATERIAL)
    implementation(Dependency.Google.HILT_ANDROID)
    kapt(Dependency.Google.HILT_ANDROID_COMPILER)

    implementation(Dependency.Libraries.RETROFIT)
    implementation(Dependency.Libraries.RETROFIT_CONVERTER_GSON)
    implementation(Dependency.Libraries.OKHTTP)
    implementation(Dependency.Libraries.OKHTTP_LOGGING_INTERCEPTOR)
    implementation(Dependency.Libraries.MOSHI)
    kapt(Dependency.Libraries.MOSHI_COMPILER)

    testImplementation(Dependency.UnitTest.JUNIT)
    testImplementation(Dependency.UnitTest.MOCKITO_KOTLIN)

    androidTestImplementation(Dependency.AndroidTest.ANDROID_JUNIT)
    androidTestImplementation(Dependency.AndroidTest.ESPRESSO_CORE)

    implementation(Dependency.BottomNav.NAV_FRAGMENT)
    implementation(Dependency.BottomNav.NAV_UI)

    implementation(Dependency.Rx.RX_BINDING)
    implementation(Dependency.Rx.RX_JAVA)
    implementation(Dependency.Rx.RX_ANDROID)

    implementation(Dependency.ImageLoad.GLIDE)
    implementation(Dependency.ImageLoad.COIL)

    implementation(Dependency.Libraries.SHIMMER)

    implementation(Dependency.Lottie.LOTTIE)
}