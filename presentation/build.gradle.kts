plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("dagger.hilt.android.plugin")
    kotlin("kapt")
}

android {
    namespace = "com.example.goms_android_v2_admin"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.goms_android_v2_admin"
        minSdk = 26
        targetSdk = 33
        versionCode = 5
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
        kotlinCompilerExtensionVersion = "1.4.3"
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

    // gauth
    implementation(Dependency.Libraries.GAUTH)
    // code scanner
    implementation(Dependency.Libraries.CODE_SCANNER)
    // permission
    implementation(Dependency.Libraries.TEDPERMMISION)
    // circle image
    implementation(Dependency.Libraries.CIRCLE_IMAGEVIEW)
    // zxing
    implementation(Dependency.Libraries.ZXING)

    // lifecycle
    implementation(Dependency.LifeCycle.LIFECYCLE)
    implementation(Dependency.LifeCycle.LIFECYCLE_LIVEDATA)
    implementation(Dependency.LifeCycle.LIFECYCLE_RUNTIME)
    implementation(Dependency.LifeCycle.LIFECYCLE_VIEWMODEL_KTX)

    // hilt
    implementation(Dependency.Hilt.HILT_ANDROID)
    kapt(Dependency.Hilt.HILT_ANDROID_COMPILER)

    // coil
    implementation(Dependency.Coil.COIL_COMPOSE)
    implementation(Dependency.Coil.COIL_VIEW)

    // retrofit
    implementation(Dependency.Retrofit.RETROFIT_KT)
    implementation(Dependency.Retrofit.RETROFIT_GSON_CONVERTER)
    implementation(Dependency.Retrofit.OKHTTP)
    implementation(Dependency.Retrofit.OKHTTP_LOGGING_INTERCEPTOR)

    // compose
    implementation(Dependency.Compose.ACTIVITY_COMPOSE)
    implementation(Dependency.Compose.COMPOSE)
    implementation(Dependency.Compose.COMPOSE_TOOLING_PREVIEW)
    implementation(Dependency.Compose.COMPOSE_MATERIAL)
    implementation(Dependency.Compose.COMPOSE_LIVEDATA)
    implementation(Dependency.Compose.COMPOSE_NAV)
    implementation(Dependency.Compose.COMPOSE_ICON)
    implementation(Dependency.Compose.COMPOSE_PAGER)
    implementation(Dependency.Compose.PAGER_INDICATORS)
    debugImplementation(Dependency.Compose.COMPOSE_TOOLING)
    debugImplementation(Dependency.Compose.COMPOSE_MANIFEST)
    testImplementation(Dependency.ComposeTest.COMPOSE_JUNIT)

    // navigation
    implementation(Dependency.AndroidX.NAVIGATION_FRAGMENT)
    implementation(Dependency.AndroidX.NAVIGATION_UI_KTX)

    implementation(Dependency.AndroidX.KOTLIN_CORE)
    implementation(Dependency.AndroidX.APP_COMPAT)
    implementation(Dependency.AndroidX.ACTIVITY_KTX)
    implementation(Dependency.AndroidX.CONSTRAINT_LAYOUT)
    implementation(Dependency.Google.MATERIAL)
    testImplementation(Dependency.Test.JUNIT)
    androidTestImplementation(Dependency.AndroidTest.TEST_JUNIT)
    androidTestImplementation(Dependency.AndroidTest.ESPRESSO)

    implementation(Dependency.AndroidX.SWIPE_REFRESH_LAYOUT)
    implementation(Dependency.Libraries.SWIPE_REFRESH)

    implementation(platform(Dependency.Google.FIREBASE_BOM))
    implementation(Dependency.Google.FIREBASE_ANALYTICS)
}