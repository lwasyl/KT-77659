import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  kotlin("jvm")
  id("com.google.devtools.ksp")
}

java {
  targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
  ksp("com.google.dagger:dagger-compiler:2.56.2")
}

tasks.withType<KotlinCompile>().configureEach {
  compilerOptions {
    jvmTarget = JvmTarget.JVM_17
    freeCompilerArgs.add("-Xwarning-level=DEPRECATION:disabled")
  }
}
