package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTests {
    public void MainTest() {
    }

    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        WebElement userInput = driver.findElement(By.id("user-name"));
        userInput.sendKeys("standard_user");

        WebElement passwardInputField = driver.findElement(By.id("password"));
        passwardInputField.sendKeys("secret_sauce");

        WebElement button = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/form/input[3]"));

        Assert.assertTrue(button.isDisplayed(), "Кнопка не отображается");
        Assert.assertTrue(button.isEnabled(), "Кнопка не доступна");

        button.click();
        driver.quit();
    }

    @Test
    public void description() {
        By logo = By.cssSelector(".login_logo");
        By username = By.cssSelector("#user-name");
        By password = By.cssSelector("#password");
        By button = By.cssSelector("#login-button");
        By picture = By.cssSelector(".bot_column");
        By epic_sadface = By.xpath("/html/body/div[2]/div[1]/div/div/form/h3");
        By accepted_Usernames  = By.xpath("/html/body/div[2]/div[2]/div/div[1]/h4");
        By Password_for_all_users = By.xpath("/html/body/div[2]/div[2]/div/div[2]/h4");

    }
}
