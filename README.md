# Spring Boot

https://www.udemy.com/spring-boot-getting-started  
https://github.com/cfaddict/spring-boot-intro

## 1. Introduction
* Stay Connected
    * [twitter.com/springCentral](twitter.com/springCentral)
    * [Youtube: spring.io/video](spring.io/video)
    * [Questions: spring.io/questions](spring.io/questions)
    * [JIRA: jira.spring.io](jira.spring.io)
* Spring Boot
    * Setup & configuration is hard.
    * XML.
    * Microservices.
    * Spring Developers are in demand.  
* What is Spring Boot?   
    * Getting Started w/ Spring easy
    * Spring Boot is an opinionated: decide for you, p.e. it uses Tomcat for a web application server.
    * Spring Boot CLI: a command line tool that can be used if you want to quickly prototype.
    * Entry Point: main method that start application.
    * Started POMs.
    * Production Ready.
* Spring Documentation
    * Spring Boot Docs - http://docs.spring.io/spring-boot/docs/current/ref...
    * Spring Boot API - http://docs.spring.io/spring-boot/docs/current/api...
    * Spring IO Platform - http://spring.io/projects
    * Getting Started Guides - http://spring.io/guides
   
## 2. Development Environment
### Using Spring CLI
https://docs.spring.io/spring-boot/docs/current/reference/html/cli-using-the-cli.html  
* Install Spring CLI
* Install Groovy
* Run Groovy script
* Set Spring CLI to PATH.
> setx path "%path%;C:\Users\aodi\tools\spring-2.1.4.RELEASE\bin"
* Create Groovy script:
```groovy
@RestController
class ThisWillActuallyRun {
	@RequestMapping("/")
	String home() {
		"Hello World!"
	}
}
```
* Run Groovy script.
> spring run app.groovy

## 3. Hello, Spring Boot
* Spring CLI add **add some code** to our original Groovy application code.
```groovy
//@Grab("spring-boot-starter-web")
//import org.springframework.web.bind.annotation.RestController
// + a bunch of other imports
@RestController
//@EnableAutoConfiguration
class ThisWillActuallyRun {
	@RequestMapping("/")
	String home() {
		"Hello World!"
	}
    //public static void main (String[] args) {
    //  StringApplication.run(HelloWorld.class, args);  	    
    //}	
}
```

* Initialize Spring Boot project:
* Go https://start.spring.io/, select dependencies, packing, java version, Group and Artifact.
* Import project in Intellij.
* Create your own controller:
```java
package com.adiaz.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("")
    public String home() {
        return "buenas!!";
    }
}
```

### Maven
* Maven users can inherit from the spring-boot-started-parent project to obtain sensible defaults.
* A Dependency Management section, allowing you to omit <version> tags for common dependencies, inherited from the spring-boot-dependencies POM (you can override these if you need to).
```xml
<!-- Inherit defaults from Spring Boot -->
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>1.2.6.RELEASE</version>
</parent>

```
* Declare your dependencies (no version neeeded)
* IDE Code Assist:
```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-started-web</artifactId>
    </dependency>
</dependencies>
```
* Spring Boot includes a **Maven plugin** that can package the project as an executable jar. 
Add the plugin in your **<plugins>** section if you want to use it:
* If you use the Spring Boot starter parent pom, you only need to add the plugin, there is no need for to configure 
it unless you want to change the settings defined in the parent.
````xml
<build>
    <plugins>
        <plugin>
            <groupId>org.springframwork.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
        </plugin>
    </plugins>
</build>
````
* Add Spring Security dependency:
````xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>    
</dependency>
````

### Gradle
**Spring Boot Applications with a little Gradle Love**
* Starter POMs: gradle users can directly import "starter POMs" in their dependencies section. 
Unlike Maven, there is no "super parent" to import to share come configuration.
````gradle
buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        compile ("org.springframwork.boot:spring-boot-starter-web:1.2.6.RELEASE")
    }
}
apply plugin: 'java'
apply plugin: 'spring-boot'
repositories {
    jcenter()
}
dependencies {
    compile ("org.springframwork.boot:spring-boot-starter-web")
    testCompile("org.springframework.boot:spring-boot-starter-test")
}
````
### Starter POMs
https://docs.spring.io/spring-boot/docs/current/reference/html/using-boot-build-systems.html#using-boot-starter
* Set of convenient dependency descriptors.
* Avoid copy / paste
* **spring-boot-starter-***
* Create your own
* So what starter POM is available

### Executable JARs
* Sometimes called "fat jars"
* Executable JARs and Java
* Spring CLI - spring jar command.
    > c:/> spring jar my_jar.jar app.groovy  
    c:/> java -jar my_jar.jar
* Maven using spring-boot-maven-plugin
    * mvn package
    * /target/myproject-0.0.1-SNAPSHOT.jar
* Gradle using spring-boot plugin
    * gradle build
    * /build/libs/myproject-0.0.1-SNAPSHOT.jar 

### DevTools & Live Reload
**spring-boot-devtools**

 

