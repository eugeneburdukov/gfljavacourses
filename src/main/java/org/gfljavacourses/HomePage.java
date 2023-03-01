package org.gfljavacourses;

import org.gfljavacourses.methods.CustomMethods;
import org.gfljavacourses.staticvariables.CustomStaticVariables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends CustomMethods {

    By clickHomePageItem = By.className("card-up");

    public HomePage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }

    public void chooseHomePageMenu(String homeMenu) {
        int indexOfElement = arrayListToInt(CustomStaticVariables.HOME_MENU_ITEMS, homeMenu);
        javaExecutorScrollIntoView(clickHomePageItem);
        clickWithIndex(clickHomePageItem, indexOfElement);
    }

}
