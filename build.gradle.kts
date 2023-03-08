import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.10"
}

group = "com.proyecto404"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.2")
    testImplementation("org.assertj:assertj-core:3.19.0")
}

tasks.withType<Test> { useJUnitPlatform() }
tasks.withType<KotlinCompile> { kotlinOptions.jvmTarget = "16" }
