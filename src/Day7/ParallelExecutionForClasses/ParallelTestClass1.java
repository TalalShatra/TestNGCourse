package Day7.ParallelExecutionForClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTestClass1 {

    @Test
    public void navigateGoogle() {

        System.setProperty("webdriver.chrome.driver", "C:\\Talal\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        Assert.assertTrue(driver.getCurrentUrl().contains("google"));

        driver.quit();



    }
}
