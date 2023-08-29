import javax.inject.Inject

object Dependency {
    object GradlePlugin {
        const val ANDROID_APPLICATION = "com.android.application"
        const val GRADLE_ANDROID = "com.android.tools.build:gradle:${Versions.GRADLE_ANDROID}"
        const val GRADLE_KOTLIN =
            "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.GRADLE_KOTLIN}"
        const val GRADLE_KTLINT = "org.jlleitschuh.gradle.ktlint"
    }

    object Hilt {
        const val HILT_ANDROID_GRADLE = "com.google.dagger:hilt-android-gradle-plugin:${Versions.HILT}"
        const val HILT_ANDROID = "com.google.dagger:hilt-android:${Versions.HILT}"
        const val HILT_ANDROID_COMPILER = "com.google.dagger:hilt-android-compiler:${Versions.HILT}"
    }

    object Kotlin {
        const val COROUTINES_CORE =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.KOTLINX_COROUTINES}"
        const val COROUTINES_ANDROID =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.KOTLINX_COROUTINES}"
    }

    object AndroidX {
        const val CONSTRAINT_LAYOUT =
            "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"
        const val KOTLIN_CORE = "androidx.core:core-ktx:${Versions.Kotlin}"
        const val CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"
        const val APP_COMPAT = "androidx.appcompat:appcompat:${Versions.APP_COMPAT}"

        const val ACTIVITY_KTX = "androidx.activity:activity-ktx:${Versions.ACTIVITY_KTX}"
        const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:${Versions.FRAGMENT_KTX}"

        const val RECYCLER_VIEW = "androidx.recyclerview:recyclerview:${Versions.RECYCLERVIEW}"

        const val LIFECYCLE_VIEWMODEL_KTX =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE_KTX}"
        const val LIFECYCLE_LIVEDATA_KTX =
            "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.LIFECYCLE_KTX}"
        const val LIFECYCLE_RUNTIME =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFECYCLE_KTX}"

        const val ROOM_RUNTIME = "androidx.room:room-runtime:${Versions.ROOM}"
        const val ROOM_KTX = "androidx.room:room-ktx:${Versions.ROOM}"
        const val ROOM_COMPILER = "androidx.room:room-compiler:${Versions.ROOM}"

        const val LEGACY_SUPPORT = "androidx.legacy:legacy-support-v4:${Versions.LEGACY}"

        const val PREFERENCE_KTX = "androidx.preference:preference-ktx:${Versions.PREFERENCE_KTX}"

        const val VIEWPAGER_2 = "androidx.viewpager2:viewpager2:${Versions.VIEWPAGER_2}"

        const val PAGING = "androidx.paging:paging-runtime:${Versions.PAGING}"
        const val PAGING_COMPOSE = "androidx.paging:paging-compose:${Versions.PAGING_COMPOSE}"
    }

    object Compose {
        const val ACTIVITY = "androidx.activity:activity-compose:${Versions.COMPOSE_ACTIVITY}"
        const val UI = "androidx.compose.ui:ui:${Versions.COMPOSE}"
        const val VIEW_BINDING = "androidx.compose.ui:ui-viewbinding:${Versions.COMPOSE}"
        const val PREVIEW = "androidx.compose.ui:ui-tooling-preview:${Versions.COMPOSE}"
        const val MATERIAL = "androidx.compose.material:material:${Versions.COMPOSE_MATERIAL}"
        const val MATERIAL3 = "androidx.compose.material3:material3:${Versions.COMPOSE_MATERIAL3}"
        const val COMPOSE_HILT_NAV = "androidx.hilt:hilt-navigation-compose:${Versions.HILT_NAV}"
        const val FOUNDATION = "androidx.compose.foundation:foundation:${Versions.COMPOSE}"
    }

    object Google {
        const val FIREBASE_ANALYTICS = "com.google.firebase:firebase-analytics-ktx"
        const val FIREBASE_BOM = "com.google.firebase:firebase-bom:${Versions.FIREBASE_BOM}"
        const val GMS_PLAY_SERVICE_AUTH =
            "com.google.android.gms:play-services-auth:${Versions.GMS_PLAY_SERVICE_AUTH}"
        const val GMS_GOOGLE_SERVICE =
            "com.google.gms:google-services:${Versions.GMS_GOOGLE_SERVICE}"
        const val HILT_ANDROID = "com.google.dagger:hilt-android:${Versions.HILT}"
        const val HILT_ANDROID_COMPILER = "com.google.dagger:hilt-android-compiler:${Versions.HILT}"
        const val MATERIAL = "com.google.android.material:material:${Versions.MATERIAL}"
        const val FIREBASE = "com.google.firebase:firebase-auth-ktx:${Versions.FIREBASE}"
        const val LIVEDATA = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.LIVEDATA}"
    }

    object GiuhubLogin {
        const val GITHUB_API = "com.github.scribejava:scribejava-apis:${Versions.GITHUB_API}"
        const val GITHUB_CORE = "com.github.scribejava:scribejava-core:${Versions.GITHUB_CORE}"
    }

    object Libraries {
        const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
        const val RETROFIT_CONVERTER_GSON =
            "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT}"
        const val OKHTTP = "com.squareup.okhttp3:okhttp:${Versions.OKHTTP}"
        const val OKHTTP_LOGGING_INTERCEPTOR =
            "com.squareup.okhttp3:logging-interceptor:${Versions.OKHTTP}"
        const val MOSHI = "com.squareup.moshi:moshi-kotlin:${Versions.MOSHI}"
        const val MOSHI_COMPILER = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.MOSHI}"
        const val SHIMMER = "com.facebook.shimmer:shimmer:${Versions.SHIMMER}"
    }

    object UnitTest {
        const val JUNIT = "junit:junit:${Versions.JUNIT}"
        const val MOCKITO_KOTLIN = "org.mockito.kotlin:mockito-kotlin:${Versions.MOCKITO_KOTLIN}"
        const val MOCKITO_INLINE = "org.mockito:mockito-inline:${Versions.MOCKITO_KOTLIN}"
    }


    object AndroidTest {
        const val ANDROID_JUNIT = "androidx.test.ext:junit:${Versions.ANDROID_JUNIT}"
        const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO_CORE}"
    }

    object BottomNav {
        const val NAV_FRAGMENT = "androidx.navigation:navigation-fragment-ktx:${Versions.NAV}"
        const val NAV_UI = "androidx.navigation:navigation-ui-ktx:${Versions.NAV}"
    }

    object Rx {
        const val RX_BINDING = "com.jakewharton.rxbinding4:rxbinding:${Versions.RX_BINDING}"
        const val RX_JAVA = "io.reactivex.rxjava3:rxjava:${Versions.RX_JAVA}"
        const val RX_ANDROID = "io.reactivex.rxjava3:rxandroid:${Versions.RX_ANDROID}"
    }

    object Coroutine {
        const val COROUTINE =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINE}"
    }

    object ImageLoad {
        const val GLIDE = "com.github.skydoves:landscapist-glide:${Versions.GLIDE_VERSION}"
        const val COIL = "io.coil-kt:coil:${Versions.COIL_VERSION}"
    }

    object Lottie {
        const val LOTTIE = "com.airbnb.android:lottie:${Versions.LOTTIE_VERSION}"
    }

    object JavaX {
        const val INJECT = "javax.inject:javax.inject:${Versions.INJECT}"
    }
}