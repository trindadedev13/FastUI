plugins {
  alias(libs.plugins.android.library)
  alias(libs.plugins.kotlin.android)
  `maven-publish`
}

group = "dev.trindadedev"
version = libs.versions.lib.version.get()

android {
  namespace = "dev.trindadedev.fastui"
  compileSdk = libs.versions.android.compileSdk.get().toInt()
  buildToolsVersion = libs.versions.android.buildToolsVersion.get()

  defaultConfig {
    minSdk = libs.versions.android.minSdk.get().toInt()
    consumerProguardFiles("consumer-rules.pro")
  }

  buildTypes {
    release {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
  }

  kotlin {
    jvmToolchain(17)
  }
}

afterEvaluate {
  publishing {
    publications {
      register("mavenRelease", MavenPublication::class) {
        groupId = "dev.trindadedev"
        artifactId = "fastui"
        version = libs.versions.lib.version.get()
        from(components["release"])
      }
    }
  }
}
