package stepdefinitions;


import com.juaracoding.pages.LoginPage;
import com.juaracoding.strategies.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class TestLogin {
    public static WebDriver driver;
    public LoginPage loginPage;

    @BeforeClass
    public void setUp() {
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        loginPage = new LoginPage();

    }

    @Test(priority = 1)
    public void tesUrl() {
        driver.get("https://shop.demoqa.com/my-account/");
        //step verify
        delay(6);
        Assert.assertEquals(loginPage.getLoginTitle(), "ToolsQA Demo Site");
    }

    @Test(priority = 2)
    public void tesValidLogin() {
        loginPage.login("Adminoooooooooo", "fhguiy8oiuioj");
        Assert.assertEquals(loginPage.getLoginTitle(), "ToolsQA Demo Site");
        System.out.println("Login Clear");
    }

    @Test(priority = 3)
    public void testAddToCart() {
        delay(1);
        loginPage.setCompanyColor("pink");
        loginPage.setCompanySize("37");
        loginPage.getSelectCart();
        Assert.assertEquals(loginPage.getTxtCart(), "PINK DROP SHOULDER OVERSIZED T SHIRT");
        System.out.println("the color and size of the shirt was successfully selected");

    }

    @AfterClass
    public void quitBrowser() {
        delay(3);
        DriverSingleton.closeObjectInstance();
    }

    static void delay(long detik) {
        try {
            Thread.sleep(detik + 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
    }
}

