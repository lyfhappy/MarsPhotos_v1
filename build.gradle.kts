// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
   // alias(libs.plugins.android.application) apply false
   // alias(libs.plugins.jetbrains.kotlin.android) apply false
    id("com.android.application") version "8.5.1" apply false
    id("com.android.library") version "8.5.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildFile)
}