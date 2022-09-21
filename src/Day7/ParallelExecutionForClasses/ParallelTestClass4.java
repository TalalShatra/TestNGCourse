package Day7.ParallelExecutionForClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTestClass4 {
    @Test
    public void test2() {

        String expectedURL = "https://techno.study/sdet";

        System.setProperty("webdriver.chrome.driver", "C:\\Talal\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://techno.study/");

        driver.manage().window().maximize();

        WebElement sdetCourseButton = driver.findElement(By.xpath("//a[text()='SDET course']"));
        sdetCourseButton.click();

        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals(actualURL, expectedURL);

        driver.quit();
    }
}
