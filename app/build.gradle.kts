import org.gradle.internal.execution.history.changes.ImplementationChanges

plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.example.md_topintetouno"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.md_topintetouno"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    annotationProcessor(libs.kaptRaizlabs)
    implementation(libs.desing)
    implementation(libs.suppportV4)
    implementation(libs.compactV7)
    implementation(libs.imBumptech)
    implementation(libs.recycrleView)
    implementation(libs.imRaizlabs)
    implementation(libs.im2Raizlabs)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}