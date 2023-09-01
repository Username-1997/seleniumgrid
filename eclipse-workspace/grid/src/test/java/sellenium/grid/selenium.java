package sellenium.grid;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
public class selenium {

	private WebDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        // Define the Hub URL where your Selenium Grid Hub is running
        URL hubURL = new URL("http://54.80.188.40:4444/wd/hub");

        // Create ChromeOptions with desired settings
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized"); // Optional: Start Chrome maximized

        // Create a WebDriver instance using the Hub URL and ChromeOptions
        driver = new RemoteWebDriver(hubURL, chromeOptions);
    }

    @Test
    public void testGrid() {
        // Navigate to a website and perform some actions
        driver.get("https://www.facebook.com/");
        System.out.println("Title of the page: " + driver.getTitle());

        // Add your test assertions and actions here
    }

    @AfterTest
    public void tearDown() {
        // Close the WebDriver session
        if (driver != null) {
            driver.quit();
        }
    }
	
	
	
   }
