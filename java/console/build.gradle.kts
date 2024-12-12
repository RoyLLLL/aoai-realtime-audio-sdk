/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn more about Gradle by exploring our Samples at https://docs.gradle.org/8.11.1/samples
 */

plugins {
    java
    application
}

repositories {
    mavenCentral()
    maven {
        url = uri("https://pkgs.dev.azure.com/azure-sdk/public/_packaging/azure-sdk-for-java/maven/v1")
        name = "azure-sdk-for-java"
    }
}

dependencies {
    implementation("com.azure:azure-ai-openai-realtime:1.0.0-alpha.20241205.3")
}

application {
    mainClass.set("Main")
}