import org.jetbrains.compose.compose
import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.10"
    id("org.jetbrains.compose") version "1.0.1-rc2"

}

//group = "io.github.mobomega"
//version = "1.0"

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

dependencies {
    implementation(compose.desktop.currentOs)
    // https://mvnrepository.com/artifact/org.slf4j/slf4j-log4j12
    testImplementation("org.slf4j:slf4j-log4j12:1.7.36")
// https://mvnrepository.com/artifact/org.slf4j/slf4j-api
    implementation("org.slf4j:slf4j-api:1.7.36")

    implementation("org.reflections:reflections:0.10.2")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

compose.desktop {
    application {
        mainClass = "io.github.mobomega.elc.MainKt"
//        nativeDistributions {
//            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
//            packageName = "untitled"
//            packageVersion = "1.0.0"
//        }
    }
}