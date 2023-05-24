plugins {
    id("org.jetbrains.kotlin.jvm") version "1.8.10"
    id("org.jetbrains.intellij") version "1.13.3"
}

repositories {
    mavenCentral()
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "17"
}

tasks.withType<org.gradle.api.tasks.compile.JavaCompile> {
    sourceCompatibility = "17"
    targetCompatibility = "17"
}

intellij {
    version.set("2022.2")
}

tasks {
    buildSearchableOptions {
        enabled = false
    }
}
