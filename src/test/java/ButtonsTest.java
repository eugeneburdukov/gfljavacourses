import io.qameta.allure.Allure;
import org.gfljavacourses.tests.BaseTests;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;

public class ButtonsTest extends BaseTests {

    @Test
    public void testClickButtons() {
        homePage.chooseHomePageMenu("Elements");
        buttonsPage.chooseElementsMenu("Buttons");
        buttonsPage.clickClickMeButton();
        waitTime();
        buttonsPage.doubleClickMeButton();
        waitTime();
        buttonsPage.rightClickButton();

        Assert.assertEquals(methods.getTitleName(), "Buttons");
        Assert.assertEquals(buttonsPage.responseClickMe(), "You have done a dynamic click");
        Assert.assertEquals(buttonsPage.doubleClickResponse(), "You have done a double click");
        Assert.assertEquals(buttonsPage.getRightClickResponse(), "You have done a right click");
        Allure.addAttachment("Screenshot from grid - chrome", new ByteArrayInputStream(((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.BYTES)));
    }
}


