import org.gfljavacourses.tests.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTablesTest extends BaseTests {
    @Test
    public void webTablesTest(){
        homePage.chooseHomePageMenu("Elements");
        buttonsPage.chooseElementsMenu("Web Tables");
        Assert.assertEquals(methods.getTitleName(),"Web Tables");
        webTablesPage.clickAddButton();
        waitTime();
        Assert.assertEquals(webTablesPage.titleRegistrationForm(),"Registration Form");
        webTablesPage.enterFirstName("Evgeniy");
        webTablesPage.enterLastName("Burdukov");
        webTablesPage.enterEmail("evgeniyburdukov@mail.com");
        webTablesPage.enterAge("30");
        webTablesPage.enterSalary("2500");
        webTablesPage.enterDepartment("Project Manager");
        webTablesPage.clickSubmit();
        waitTime();
    }
}
