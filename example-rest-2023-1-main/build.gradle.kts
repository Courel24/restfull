plugins {
	java
	id("org.springframework.boot") version "2.7.8"
	id("io.spring.dependency-management") version "1.0.15.RELEASE"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	compileOnly ("org.projectlombok:lombok:1.18.24")
	implementation ("com.ibm.db2.jcc:db2jcc:db2jcc4")
	annotationProcessor("org.projectlombok:lombok:1.18.24")
	implementation("jakarta.persistence:jakarta.persistence-api:3.1.0")
	implementation("org.springframework.data:spring-data-jpa:3.0.4")

}

tasks.withType<Test> {
	useJUnitPlatform()
}
