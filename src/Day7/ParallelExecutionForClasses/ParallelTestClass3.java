package Day7.ParallelExecutionForClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTestClass3 {
    @Test
    public void test1() {

        String expectedURL = "https://techno.study/";

        System.setProperty("webdriver.chrome.driver", "C:\\Talal\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://techno.study/");

        String actualURL = driver.getCurrentUrl();

        // each test should have at least 1 Assertion (validation)
        Assert.assertEquals(actualURL, expectedURL);

        driver.quit();
    }
}
