package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AssertionTask {
    WebDriver driver;
    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Talal\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://demoqa.com/buttons");
        }
    @Test
    public void testClick() {

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String expected = "You have done a dynamic click";

        WebElement clickButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
        clickButton.click();

        WebElement clickButtonMessage = driver.findElement(By.id("dynamicClickMessage"));
        String actual = clickButtonMessage.getText();

        Assert.assertEquals(actual, expected);
        }
    @Test
    public void testDoubleClick() {

        String expected = "You have done a double click";

        WebElement doubleclickButton = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleclickButton).perform();

        WebElement doubleClickButtonMessage = driver.findElement(By.id("doubleClickMessage"));
        String actual = doubleClickButtonMessage.getText();

        Assert.assertEquals(actual, expected);
        }
    @Test
    public void rightClick() {

        String expected = "You have done a right click";

        WebElement rightClickButton = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
        Actions actions = new Actions(driver);
        actions.contextClick(rightClickButton).perform();

        WebElement rightClickButtonMessage = driver.findElement(By.id("rightClickMessage"));
        String actual = rightClickButtonMessage.getText();

        Assert.assertEquals(actual, expected);
        }
    @AfterClass
    public void afterClass() {
        driver.quit();
        }
}
