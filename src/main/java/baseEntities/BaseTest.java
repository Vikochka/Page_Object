package baseEntities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    private static String PATH_TO_DRIVER = "";
    public WebDriver driver;

    public BaseTest() {
    }

    @BeforeClass
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver_win32/chromedriver.exe");
        this.driver = new ChromeDriver();
    }

    @AfterClass
    public void afterTest() {
        this.driver.close();
    }
}

