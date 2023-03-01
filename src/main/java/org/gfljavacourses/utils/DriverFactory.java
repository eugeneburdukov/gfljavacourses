package org.gfljavacourses.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class DriverFactory {
    private static WebDriver driver;
    private static final String DRIVER_PATH = "src/main/resources/";
    public static WebDriver getDriver(Browser browser) {
        File file;
        switch (browser) {
            case CHROMEMAC:
                file = new File(DRIVER_PATH + "chromedriver");
                System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
                driver = new ChromeDriver();
                break;
            case CHROMEWINDOWS:
                file = new File(DRIVER_PATH + "chromedriver.exe");
                System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
                driver = new ChromeDriver();
                break;
            default:
        }
        driver.manage().window().maximize();
        return driver;
    }
}
