# msc-ais-weather-backend

- java version: Java 11

-- For Javalin App 
- run with ./gradlew run

-- For lib
- ./gradlew publishToMavenLocal
- then add it as a dependency to your project

dependencies {
    implementation("msc.ais.weather:weather-lib:1.0.1")
}
