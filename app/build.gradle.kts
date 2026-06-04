plugins {
    id("com.android.application")
}

android {
    namespace = "com.mrn.parsi.keyboard"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.mrn.parsi.keyboard"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}
