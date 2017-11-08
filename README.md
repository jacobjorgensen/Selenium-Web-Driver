# Selenium-Web-Driver
This is a guilde to implementing a Selenium WebDriver for use in the Chrome browser

PLEASE NOTE - This implementation is in Java, as a Maven project, using the Intellij IDE. 

Once a new Java project has been created, the next step is to include the libraries needed. 
In the pom.xml file the following block needs to be added: 
```
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
```
For more information about what needs to be included in the pom.xml file for your sepecific 
implementation follow the following link: http://docs.seleniumhq.org/download/maven.jsp
Additionally, for a full list of Selenium dependancies available for use with Maven visit: https://mvnrepository.com/search?q=selenium

For use with Google Chrome you will need to download the ChromeDriver.exe file which can be found at: https://sites.google.com/a/chromium.org/chromedriver/downloads

I recommend dropping the chromedriver.exe file into a files directory in the Java project as can be seen in the file structure. 
From there you need to point to the file when the program launches. 
This can be done with the following code segment: 
```
    System.setProperty("webdriver.chrome.driver", "files/chromedriver.exe");
```

From this point you can instantiate a new WebDriver object and get started with your own implementation! 

For this example, there is a working test and a failing test. 
The passing test checks for a specifc id attribute on the webpage. The passing test checks the link text on the About link. 
The failing test checks for the link text on the Contact link. This test of course fails because the id "contact-link" does not exist. 
Whats interesting to note with this test failue, the print out from Selenium lets you know that it couldn't find the id attribute. 
This is a small but powerful example of how Selenium can be leveraged to help make suggest bug fixes. 
