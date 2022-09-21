package Day7.ParallelExecutionForTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegressionTest {

    @Test
    public void navigateFacebook() {

        System.setProperty("webdriver.chrome.driver", "C:\\Talal\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));

        driver.quit();



    }
}
