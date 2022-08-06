package Day2;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;
import java.util.Random;

public class TestNG_Assertions {

    @Test
    public void assertEquals() {
        String expected = "Hello";
        String actual = "Hello";
        // will pass
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void assertEquals2() {
        String expected = "Hello";
        String actual = "hello";
        // will fail
        Assert.assertEquals(actual, expected,"Actual should be equal to Expected result");
    }
    @Test
    public void assertNotEquals() {
        String expected = "Hello";
        String actual = "Hi";
        // will pass
        Assert.assertNotEquals(actual, expected);
    }
    @Test
    public void assertEquals3() {
        String[] expected = {"Twenty", "Hello"};
        String[] actual = {"Hello", "Twenty"};
        // will fail
        Assert.assertEquals(actual, expected,"Actual should be equal to Expected result");
    }
    @Test
    public void assertEqualsNoOrder() {
        String[] expected = {"Twenty", "Hello"};
        String[] actual = {"Hello", "Twenty"};
        // will pass
        Assert.assertEqualsNoOrder(actual, expected);
    }
    @Test
    public void assertSame() {
        String[] expected = {"TechnoStudy"};
        String[] actual = {"TechnoStudy"};
        // different objects >>>>>> the test will fail
        Assert.assertSame(actual, expected);
    }
    @Test
    public void assertSame2() {
        String[] expected = {"TechnoStudy"};
        String[] actual = expected;
        // same object >>>>>> the test will pass
        Assert.assertSame(actual, expected);
    }
    @Test
    public void assertNotSame() {
        String[] expected = {"TechnoStudy"};
        String[] actual = {"TechnoStudy"};
        // will pass
        Assert.assertNotSame(actual, expected);
    }
    @Test
    public void assertNull() {
        String nullString = null;
        // will pass
        Assert.assertNull(nullString);
    }
    @Test
    public void assertNotNull() {
        String str = "Hey";  // also "" will pass
        // will pass
        Assert.assertNotNull(str);
    }
    public boolean isDataAvailable() {

        Random rnd = new Random();
        return rnd.nextBoolean();
    }
    @Test
    public void assertTrue() {

        boolean actual = isDataAvailable();
        // if actual is true will pass
        Assert.assertTrue(actual);
    }
    @Test
    public void assertFalse() {

        boolean actual = isDataAvailable();
        // if actual is false will pass
        Assert.assertFalse(actual);
    }
    @Test
    public void assertFail() {

        if (isDataAvailable()) {
            System.out.println("Move to next step!");
        } else {
            Assert.fail("Data is not available!");
        }
    }
    @Test
    public void assertFail2() {

        try {
            // try to find element
        } catch (NoSuchElementException exception) {
            Assert.fail("Test failed! Selenium cannot find the element!");
        }
    }
}
