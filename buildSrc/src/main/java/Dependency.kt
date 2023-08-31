import javax.inject.Inject

object Dependency {
    object GradlePlugins {
        const val ANDROID_APPLICATION = "com.android.application"
        const val ANDROID_LIBRARY = "com.android.library"
        const val KOTLIN_ANDROID = "org.jetbrains.kotlin.android"
        const val GOOGLE_PLUGIN = "com.google.gms:google-services:${Versions.GRADLE_GOOGLE}"
        const val GRADLE_KTLINT = "org.jlleitschuh.gradle.ktlint"
    }

    object AndroidX {
        const val PAGING = "androidx.paging:paging-runtime:${Versions.PAGING}"
        const val PREFERENCE_KTX = "androidx.preference:preference-ktx:${Versions.PREFERENCE_KTX}"
        const val CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"
        const val APP_COMPAT = "androidx.appcompat:appcompat:${Versions.APP_COMPAT}"
        const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT}"
        const val ACTIVITY_KTX = "androidx.activity:activity-ktx:${Versions.ACTIVITY_KTX}"
        const val NAVIGATION_FRAGMENT = "androidx.navigation:navigation-fragment-ktx:${Versions.NAVIGATION}"
        const val NAVIGATION_UI_KTX = "androidx.navigation:navigation-ui-ktx:${Versions.NAVIGATION}"
        const val SWIPE_REFRESH_LAYOUT = "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.SWIPE_REFRESH_LAYOUT}"
        const val ROOM_RUNTIME = "androidx.room:room-runtime:${Versions.ROOM}"
        const val ROOM_KTX = "androidx.room:room-ktx:${Versions.ROOM}"
        const val ROOM_COMPILER = "androidx.room:room-compiler:${Versions.ROOM}"
    }

    object Compose {
        const val ACTIVITY_COMPOSE = "androidx.activity:activity-compose:${Versions.ACTIVITY_COMPOSE}"
        const val COMPOSE = "androidx.compose.ui:ui:${Versions.COMPOSE}"
        const val COMPOSE_TOOLING_PREVIEW = "androidx.compose.ui:ui-tooling-preview:${Versions.COMPOSE}"
        const val MATERIAL = "androidx.compose.material:material:${Versions.COMPOSE_MATERIAL}"
        const val MATERIAL3 = "androidx.compose.material3:material3:${Versions.COMPOSE_MATERIAL3}"
        const val COMPOSE_TOOLING = "androidx.compose.ui:ui-tooling:${Versions.COMPOSE}"
        const val COMPOSE_MANIFEST = "androidx.compose.ui:ui-test-manifest:${Versions.COMPOSE}"
        const val COMPOSE_LIVEDATA = "androidx.compose.runtime:runtime-livedata:${Versions.COMPOSE}"
        const val COMPOSE_NAV = "androidx.navigation:navigation-compose:${Versions.COMPOSE_NAV}"
        const val COMPOSE_ICON = "androidx.compose.material:material-icons-extended:${Versions.COMPOSE}"
        const val COMPOSE_PAGER = "com.google.accompanist:accompanist-pager:${Versions.COMPOSE_PAGER}"
        const val PAGER_INDICATORS = "com.google.accompanist:accompanist-pager-indicators:${Versions.COMPOSE_PAGER}"
    }

    object ComposeTest {
        const val COMPOSE_JUNIT = "androidx.compose.ui:ui-test-junit4:${Versions.COMPOSE}"
    }

    object Libraries {
        const val GAUTH =  "com.github.GSM-MSG:GAuth-Signin-Android:${Versions.GAUTH}"
        const val CODE_SCANNER = "com.github.yuriy-budiyev:code-scanner:${Versions.CODE_SCANNER}"
        const val TEDPERMMISION = "io.github.ParkSangGwon:tedpermission-normal:${Versions.TED_PERMISSION}"
        const val CIRCLE_IMAGEVIEW = "de.hdodenhof:circleimageview:${Versions.CIRCLE_IMAGE_VIEW}"
        const val ZXING = "com.journeyapps:zxing-android-embedded:${Versions.ZXING}"
        const val SWIPE_REFRESH = "com.google.accompanist:accompanist-swiperefresh:${Versions.SWIPE_REFRESH}"
    }

    object Hilt {
        const val HILT_ANDROID_GRADLE = "com.google.dagger:hilt-android-gradle-plugin:${Versions.HILT}"
        const val HILT_ANDROID = "com.google.dagger:hilt-android:${Versions.HILT}"
        const val HILT_ANDROID_COMPILER = "com.google.dagger:hilt-android-compiler:${Versions.HILT}"
    }

    object Retrofit {
        const val RETROFIT_KT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
        const val RETROFIT_GSON_CONVERTER = "com.squareup.retrofit2:converter-gson:${Versions.GSON}"
        const val OKHTTP = "com.squareup.okhttp3:okhttp:${Versions.OKHTTP}"
        const val OKHTTP_LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:${Versions.OKHTTP}"
    }

    object LifeCycle {
        const val LIFECYCLE = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFECYCLE}"
        const val LIFECYCLE_LIVEDATA = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.LIFECYCLE}"
        const val LIFECYCLE_RUNTIME = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFECYCLE_RUNTIME}"
        const val LIFECYCLE_VIEWMODEL_KTX = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE}"
    }


    object Google {
        const val FIREBASE_BOM = "com.google.firebase:firebase-bom:${Versions.FIREBASE_BOM}"
        const val FIREBASE_ANALYTICS = "com.google.firebase:firebase-analytics-ktx"
    }

    object Test {
        const val JUNIT = "junit:junit:${Versions.JUNIT}"
    }

    object AndroidTest {
        const val TEST_JUNIT = "androidx.test.ext:junit:${Versions.TEST_UNIT}"
        const val ESPRESSO = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO}"
        const val ANDROID_JUNIT = "androidx.test.ext:junit:${Versions.ANDROID_JUNIT}"
    }

    object UnitTest {
        const val MOCKITO = "org.mockito:mockito-core:${Versions.MOCKITO}"
    }

    object Coil {
        const val COIL_COMPOSE = "com.github.skydoves:landscapist-coil:${Versions.COIL_COMPOSE}"
        const val COIL_VIEW = "io.coil-kt:coil:${Versions.COIL_VIEW}"
    }

    object JavaX {
        const val INJECT = "javax.inject:javax.inject:${Versions.INJECT}"
    }

    object Kotlin {
        const val COROUTINES_CORE =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.KOTLINX_COROUTINES}"
    }
}