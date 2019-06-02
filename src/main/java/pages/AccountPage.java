package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage {

    private By userPhoto = By.xpath("//*[@id='mobile-navbar-search']/ul/li/a/img");
    private By userName = By.xpath("//*[@id='mobile-navbar-search']/ul/li/a/span[3]");

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public By getUserPhoto() {
        return userPhoto;
    }

    public By getUserName() {
        return userName;
    }
}
