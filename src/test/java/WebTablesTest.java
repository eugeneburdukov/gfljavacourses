import io.qameta.allure.Allure;
import org.gfljavacourses.tests.BaseTests;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;

public class WebTablesTest extends BaseTests {
    @Test (testName = "Testing tables")
    public void webTablesTest() {
        homePage.chooseHomePageMenu("Elements");
        buttonsPage.chooseElementsMenu("Web Tables");
        Assert.assertEquals(methods.getTitleName(), "Web Tables");
        webTablesPage.clickAddButton();
        waitTime();
        Assert.assertEquals(webTablesPage.titleRegistrationForm(), "Registration Form");
        webTablesPage.enterFirstName("Evgeniy");
        webTablesPage.enterLastName("Burdukov");
        webTablesPage.enterEmail("evgeniyburdukov@mail.com");
        webTablesPage.enterAge("30");
        webTablesPage.enterSalary("2500");
        webTablesPage.enterDepartment("Project Manager");
        webTablesPage.clickSubmit();
        waitTime();
        Allure.addAttachment("Web Tables Test", new ByteArrayInputStream(((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.BYTES)));
    }
}
