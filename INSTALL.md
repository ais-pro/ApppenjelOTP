# ApppenjelOTP INSTALLATION

## gradle
### Add it in your root build.gradle at the end of repositories:
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
### Add the dependency

	dependencies {
	        implementation 'com.github.ais-pro:ApppenjelOTP:Tag'
	}
  
  
  
## maven
<code>
  <repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
  </code>
  
  
### Add the dependency
<code>
  <dependency>
	    <groupId>com.github.ais-pro</groupId>
	    <artifactId>ApppenjelOTP</artifactId>
	    <version>Tag</version>
	</dependency>
  </code>
  


## sbt
  ### Add it in your build.sbt at the end of resolvers:
    resolvers += "jitpack" at "https://jitpack.io"
  
### Add the dependency
  <code>
  libraryDependencies += "com.github.ais-pro" % "ApppenjelOTP" % "Tag"	
  </code>
  
## leiningen
### Add it in your project.clj at the end of repositories:
  <code>
   :repositories [["jitpack" "https://jitpack.io"]]
  </code>
###  Add the dependency
  <code>
:dependencies [[com.github.ais-pro/ApppenjelOTP "Tag"]]	
  </code>

  


  
