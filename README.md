# Selenium-Web-Driver
This is a guilde to implementing a Selenium WebDriver for use in the Chrome browser

PLEASE NOTE - This implementation is in Java, as a Maven project, using the Intellij IDE. 

Once a new Java project has been created, the next step is to include the libraries needed. 
In the pom.xml file the following block needs to be added: 
    <dependencies>
        <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-chrome-driver -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-chrome-driver</artifactId>
            <version>3.7.0</version>
        </dependency>

        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>htmlunit-driver</artifactId>
            <version>2.27</version>
        </dependency>
    </dependencies>
    
For more information about what needs to be included in the pom.xml file for your sepecific 
implementation follow the following link: http://docs.seleniumhq.org/download/maven.jsp
Additionally, for a full list of Selenium dependancies available for use with Maven vist: https://mvnrepository.com/search?q=selenium
