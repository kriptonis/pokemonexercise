# pokemonexercise
Exercise for Premium Minds contest about catching pokemon

Requirements
	Java JDK 8
	Maven (for maven tasks)

How to compile without Maven
javac src\main\java\pt\premium\recruitment\ricardojafe\Pokemon.java

How to test with Maven
mvn test

How to install artifact and Run main app with Maven:
mvn install

How to run without Maven
java -cp src\main\java pt.premium.recruitment.ricardojafe.Pokemon

How to run without Maven
mvn compile exec:java -Dexec.mainClass="pt.premium.recruitment.ricardojafe.pokemon"

How to package as runnable jar with Maven
mvn compile assembly:single

Compile and Run with the bat file (for Windows, without Maven):
compileNrun.bat