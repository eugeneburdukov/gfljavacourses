package org.gfljavacourses;

import org.gfljavacourses.methods.Methods;
import org.gfljavacourses.pages.elements.ButtonsPage;
import org.gfljavacourses.utils.Browser;
import org.gfljavacourses.utils.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.Locale;

public class BaseTests {

    public WebDriver driver;
    public WebDriverWait wait;

    public static final String URL = "https://demoqa.com/";
    public static final String URL1 = "https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_loader5";

    DriverFactory browsers = new DriverFactory();

    public HomePage homePage;
    public ButtonsPage buttonsPage;
    public RadioButtonPage radioButtonPage;
    public CheckBoxPage checkBoxPage;
    public LinksPage linksPage;
    public BrowserWindowPage browserWindowPage;
    public BookStorePage bookStorePage;
    public BrokenLinks brokenLinks;
    public UploadAndDownloadPage uploadAndDownloadPage;
    public DynamicPropertiesPage dynamicPropertiesPage;
    public PracticeFormPage practiceFormPage;
    public TextBoxPage textBoxPage;
    public WebTablesPage webTablesPage;
    public AlertsPage alertsPage;
    public FramesPage framesPage;
    public NestedFramesPage nestedFramesPage;
    public ModalDialogsPage modalDialogsPage;
    public SortablePage sortablePage;
    public AccordianPage accordianPage;
    public AutoCompletePage autoCompletePage;
    public DatePickerPage datePickerPage;
    public SliderPage sliderPage;
    public ProgressBarPage progressBarPage;
    public TabsPage tabsPage;
    public ToolTipsPage toolTipsPage;
    public MenuPage menuPage;
    public SelectMenuPage selectMenuPage;
    public LoginPage loginPage;
    public ProfilePage profilePage;
    public SelectablePage selectablePage;
    public ResizablePage resizablePage;
    public DroppablePage droppablePage;
    public DraggablePage draggablePage;
    public Methods methods;
    public LoaderPage loaderPage;

    public Faker ukFaker;
    public Faker faker;
    Actions actions;

    public void waitTime() {
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
    }

    @BeforeMethod
    public void setup() {
        driver = browsers.openWithSwitch("chrome");
        driver.navigate().to(URL);

        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 20);
        actions = new Actions(driver);
        ukFaker = new Faker(new Locale("en-GB"));
        faker = new Faker();

        homePage = new HomePage(driver, wait, actions);
        buttonsPage = new ButtonsPage(driver, wait, actions);
        radioButtonPage = new RadioButtonPage(driver, wait, actions);
        checkBoxPage = new CheckBoxPage(driver, wait, actions);
        linksPage = new LinksPage(driver, wait, actions);
        browserWindowPage = new BrowserWindowPage(driver, wait, actions);
        bookStorePage = new BookStorePage(driver, wait, actions);
        brokenLinks = new BrokenLinks(driver, wait, actions);
        uploadAndDownloadPage = new UploadAndDownloadPage(driver, wait, actions);
        dynamicPropertiesPage = new DynamicPropertiesPage(driver, wait, actions);
        practiceFormPage = new PracticeFormPage(driver, wait, actions);
        textBoxPage = new TextBoxPage(driver, wait, actions);
        webTablesPage = new WebTablesPage(driver, wait, actions);
        alertsPage = new AlertsPage(driver, wait, actions);
        framesPage = new FramesPage(driver, wait, actions);
        nestedFramesPage = new NestedFramesPage(driver, wait, actions);
        modalDialogsPage = new ModalDialogsPage(driver, wait, actions);
        sortablePage = new SortablePage(driver, wait, actions);
        accordianPage = new AccordianPage(driver, wait, actions);
        autoCompletePage = new AutoCompletePage(driver, wait, actions);
        datePickerPage = new DatePickerPage(driver, wait, actions);
        sliderPage = new SliderPage(driver, wait, actions);
        progressBarPage = new ProgressBarPage(driver, wait, actions);
        tabsPage = new TabsPage(driver, wait, actions);
        toolTipsPage = new ToolTipsPage(driver, wait, actions);
        menuPage = new MenuPage(driver, wait, actions);
        selectMenuPage = new SelectMenuPage(driver, wait, actions);
        loginPage = new LoginPage(driver, wait, actions);
        profilePage = new ProfilePage(driver, wait, actions);
        selectablePage = new SelectablePage(driver, wait, actions);
        resizablePage = new ResizablePage(driver, wait, actions);
        droppablePage = new DroppablePage(driver, wait, actions);
        draggablePage = new DraggablePage(driver, wait, actions);
        methods = new Methods(driver, wait, actions);
        loaderPage = new LoaderPage(driver, wait, actions);
        buttonsPage.clickXAd();
        waitTime();
    }

    @AfterMethod
    public void tear_down() {
        waitTime();
        driver.quit();
    }
}



