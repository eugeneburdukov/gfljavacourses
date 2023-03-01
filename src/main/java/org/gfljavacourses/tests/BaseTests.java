package org.gfljavacourses.tests;

import org.gfljavacourses.HomePage;
import org.gfljavacourses.methods.CustomMethods;
import org.gfljavacourses.pages.elements.ButtonsPage;
import org.gfljavacourses.pages.elements.WebTablesPage;
import org.gfljavacourses.utils.Browser;
import org.gfljavacourses.utils.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTests {

    public WebDriver driver;
    public WebDriverWait wait;

    public static final String URL = "https://demoqa.com/";

    public HomePage homePage;
    public ButtonsPage buttonsPage;

    public WebTablesPage webTablesPage;
    public CustomMethods methods;
    Actions actions;

    public void waitTime() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }

    @BeforeMethod
    public void setup() {
        driver = DriverFactory.getDriver(Browser.CHROMEMAC);
        driver.navigate().to(URL);

        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        actions = new Actions(driver);

        homePage = new HomePage(driver, wait, actions);
        buttonsPage = new ButtonsPage(driver, wait, actions);
        webTablesPage = new WebTablesPage(driver, wait, actions);
        methods = new CustomMethods(driver, wait, actions);
        buttonsPage.clickXAd();
        waitTime();
    }

    @AfterMethod
    public void afterClass() {
        driver.quit();
    }
}



