import junit.framework.TestCase;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TechiesHomeTest extends TestCase {

    private WebDriver chromeDriver;
    @Before
    public void start()
    {
        System.setProperty("webdriver.chrome.driver", "files/chromedriver.exe");
        //Start
        chromeDriver = new ChromeDriver();

        chromeDriver.get("http://techies.greenrivertech.net/");
    }

    public void testSiteConnection()
    {
        start();

        //compare title
        assertEquals("About", chromeDriver.findElement(By.id("about-link")).getText());
    }
}