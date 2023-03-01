package org.gfljavacourses.methods;

import org.apache.commons.lang3.ArrayUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;

import java.util.List;

public class CustomMethods {
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;
    By title = By.className("main-header");

    public CustomMethods(WebDriver driver, WebDriverWait wait, Actions actions) {
        this.driver = driver;
        this.wait = wait;
        this.actions = actions;
    }

    public WebElement element(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void click(By locator) {
        element(locator).click();
    }

    public String getText(By locator) {
        return element(locator).getText();
    }

    public String getTitleName() {
        return getText(title);
    }

    public void sendKeys(By locator, String string) {
        element(locator).sendKeys(string);
    }

    public Select select(WebElement element) {
        return new Select(element);
    }

    public void getOptions(By locator) {
        List<WebElement> option = select(element(locator)).getOptions();
        System.out.println("The options you can choose to select are: ");
        for (WebElement options : option)
            System.out.println(options.getText());
    }

    public void javaExecutorClick(By locator) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element(locator));
    }

    public int arrayListToInt(String[] items, String list) {
        return ArrayUtils.indexOf(items, list);
    }

    public void javaExecutorScrollIntoView(By locator) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView()", element(locator));
    }

    public List<WebElement> elements(By locator) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    public void clickActionsWithIndex(By locator, int i) {
        actions.click(elements(locator).get(i)).build().perform();
    }

    public void clickWithIndex(By locator, int index) {
        elements(locator).get(index).click();
    }

    public void rightClick(By locator) {
        actions.contextClick(element(locator)).build().perform();
    }

    public void doubleClick(By locator) {
        actions.doubleClick(element(locator)).build().perform();
    }
}


