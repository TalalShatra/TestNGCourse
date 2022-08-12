package Day1;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class _03_TestNG_BeforeAfterClass {

    @BeforeClass  // will get executed only one time at the beginning
    // @BeforeClass: The annotated method will be run before the first test method in the current class is invoked.
    public void beforeClass() {
        System.out.println("Before running all Tests");
    }
    @AfterClass  // will get executed only one time at the end
    //@AfterClass: The annotated method will be run after all the test methods in the current class have been run.
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
