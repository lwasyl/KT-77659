plugins {
  id("com.android.application") version "8.10.0" apply false
  id("com.android.library") version "8.10.0" apply false
  kotlin("android") version "2.2.0-RC" apply false
  kotlin("jvm") version "2.2.0-RC" apply false
  id("dev.zacsweers.anvil") version "0.4.1" apply false
  id("com.google.devtools.ksp") version "2.2.0-RC-2.0.1"
}

repositories {
  google()
  mavenCentral()
}
