package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Q4. Selenium: write the login test.
 *
 * Site: https://the-internet.herokuapp.com/login
 * Valid login:   username "tomsmith", password "SuperSecretPassword!"
 *                -> message "You logged into a secure area!" and URL ends with /secure
 * Invalid login: wrong password
 *                -> message "Your password is invalid!" and URL still ends with /login
 *
 * Hints: locators are By.id("username"), By.id("password"),
 *        By.cssSelector("button[type='submit']") and By.id("flash") for the message.
 *
 * Replace each Assert.fail(...) with your own steps and assertions, then run:
 *     mvn test -Dtest=LoginTest
 */
public class LoginTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        // Headless by default (needed in Codespaces). To watch the browser locally:
        //     mvn test -Dheadless=false
        if (!"false".equals(System.getProperty("headless"))) {
            options.addArguments("--headless=new", "--no-sandbox", "--disable-dev-shm-usage");
        }
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @Test
    public void validLoginShowsSecureArea() {
        // TODO: enter the valid username and password, click Login,
        //       wait for the message, and assert the text and the URL.
        Assert.fail("Not implemented yet");
    }

    @Test
    public void invalidPasswordShowsError() {
        // TODO: enter the valid username and a wrong password, click Login,
        //       wait for the message, and assert the text and the URL.
        Assert.fail("Not implemented yet");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
