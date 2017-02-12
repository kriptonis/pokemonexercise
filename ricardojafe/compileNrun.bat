@ECHO OFF

REM Compile
javac src\main\java\pt\premium\recruitment\ricardojafe\Pokemon.java
REM Run!
java -cp src\main\java pt.premium.recruitment.ricardojafe.Pokemon

REM execute from where Maven builds
REM java -cp target\classes pt.premium.recruitment.ricardojafe.Pokemon