package day17042025;

import org.testng.annotations.*;

public class TestNGExample {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite - Global Setup");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test - Test Level Setup");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class - Class Level Setup");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method - Before each Test");
    }

    @Test
    public void testMethod() {
        System.out.println("Test Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method - After each Test");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class - After all Tests in Class");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test - After all Tests in <test>");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite - Final Cleanup");
    }
}
