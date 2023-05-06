plugins {
    id("java")
}

group = "com.github.sibkit"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

sourceSets {
    main {
        java {
            srcDir("src")
        }
    }
}

dependencies {
    implementation("com.github.sibkit:Juke:v.0.1")
    implementation("io.javalin:javalin:5.5.0")
    implementation("org.slf4j:slf4j-simple:2.0.7")
}