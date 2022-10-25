# oblig3-leap-year

Made a new repository and added previous code from oblig 2.
When making an action it let me choose from a couple "pre-built" templates - I chose the one for Java with maven since that's what I've used. I changed the JDK version to 17 (was 11) since it would crash otherwise. Added nvm install to get dependencies and mvn test to run my leap year tests. Had some trouble getting it to work (thought I would have to specify the name of the tests - turns out you only need to write mvn test).  

I got mvn -B package -file pom.xml from the action template it gave me - it seems to run my tests too? Not sure if it essentially does the same as nvm test, but going through the logs it seems as if they are ran twice when I push to the master branch so I would assume so. 
