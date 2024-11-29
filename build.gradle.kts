plugins {
    kotlin("jvm") version "2.0.0"
    id ("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "me.baggi"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.github.Pequla:RconCore:v1.2")
}

tasks.jar {
    manifest.attributes["Main-Class"] = "me.baggi.rcon.App"
}
kotlin {
    jvmToolchain(8)
}