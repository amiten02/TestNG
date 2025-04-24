package com;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
// import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTests {

    @BeforeSuite
    public void setupSuite() {
        System.out.println("Setting up the suite");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterSuite
    public void teardownSuite() {
        System.out.println("Tearing down the suite");
    }

    @BeforeClass
    public void setupClass() {
        System.out.println("Setup before class");
    }

    @AfterClass
    public void teardownClass() {
        System.out.println("Teardown after class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod is executing.");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod is executing.");
    }

    @Test(groups = {"smoke"})
    public void loginWithValidCredentials() {
        System.out.println("Smoke Test: Valid login");
    }

    @Test(groups = {"regression"}, priority = 1)
    public void loginWithInvalidCredentials() {
        System.out.println("Regression Test: Invalid login");
    }

    @Test(priority = 0)
    public void testMethod() {
        System.out.println("Test Method");
        SoftAssert softAssert = new SoftAssert();

        Assert.assertEquals(5, 5, "First Assertion Failed: Values are not equal"); // Pass
        Assert.assertEquals(6, 6, "Second Assertion Failed: Values are not equal");

        System.out.println("Starting testSoftAssertions...");
        softAssert.assertEquals(5, 5, "First Assertion Failed: Values are not equal"); // Pass
        softAssert.assertEquals(6, 6, "Second Assertion Failed: Values are not equal");
    }

    // @Parameters({"username", "password"})
    // @Test(groups = {"smoke", "regression"})
    // public void loginTest(String username, String password) {
    // System.out.println("Username: " + username);
    // System.out.println("Password: " + password);
    // // Add your login logic here
    // }

    @DataProvider(name = "loginData")
    public Object[][] provideData() {
        return new Object[][] {{"user1", "pass1"}, {"user2", "pass2"}};
    }

    @Test(dataProvider = "loginData", groups = {"regression"})
    public void testLogin(String username, String password) {
        System.out.println("Testing login with " + username + " and " + password);
    }
}
