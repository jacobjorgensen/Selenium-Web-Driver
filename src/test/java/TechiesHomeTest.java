import junit.framework.TestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TechiesHomeTest extends TestCase {

    private WebDriver chromeDriver;

    /**
     * This method points to the chromedriver.exe file,
     * instantiates a new WebDriver object then opens the home page
     * for the site.
     */
    public void startHomePage()
    {
        System.setProperty("webdriver.chrome.driver", "files/chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.get("http://techies.greenrivertech.net/");
    }

    /**
     * This method texts the showing text for the
     * About link.
     */
    public void testAboutLinkText()
    {
        startHomePage();
        assertEquals("About", chromeDriver.findElement(By.id("about-link")).getText());
    }

    /**
     * This method tests the showing text fro the
     * Contact link.
     *
     * Note - This method is intended to fail because the id being searched
     * for doesn't exist
     */
    public void testContactLinkText()
    {
        startHomePage();
        assertEquals("Contact", chromeDriver.findElement(By.id("contact-link")).getText());
    }
}