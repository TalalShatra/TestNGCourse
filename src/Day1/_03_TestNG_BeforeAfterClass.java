package Day1;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class _03_TestNG_BeforeAfterClass {

    @BeforeClass  // will get executed only one time at the beginning
    public void beforeClass() {
        System.out.println("Before running all Tests");

    }

    @AfterClass  // will get executed only one time at the end
    public void afterClass() {
        System.out.println("After running all Tests");

    }

    @Test
    public void test1() {
        System.out.println("Test 1");

    }

    @Test
    public void test2() {

        System.out.println("Test 2");
    }

}
