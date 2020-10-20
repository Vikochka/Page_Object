package basePage;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page extends BasePage {
    private static String ENDPOINT ="/index.html";
    private static By USERNAME_SELECTOR = By.id("user-name");
    private static By PASSWORD_SELECTOR = By.id("password");
    private static By LOGIN_BUTTON_SELECTOR = By.id("login-button");



    public Login_Page(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        this.openPage(BASE_URL + ENDPOINT);
    }

    public boolean isPageOpened() {
        return this.driver.findElement(LOGIN_BUTTON_SELECTOR).isDisplayed();
    }
}
