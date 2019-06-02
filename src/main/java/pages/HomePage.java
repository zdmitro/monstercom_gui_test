package pages;

import data.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    private By header = By.xpath("//*[@id='ch-logo-wordmark']/span");
    private By loginButton = By.xpath("//*[@id='s-menu-d']/li[1]/a");
    private By signUpButton = By.xpath("//*[@id='s-menu-d']/li[2]/a");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage goToHomePage() {
        getDriver().get(Data.URL);
        return this;
    }

    public LoginPage goToLoginPage() {
        getDriver().get(Data.URL);
        click(this.loginButton);
        return new LoginPage(getDriver());
    }

    public ForgotPasswordPage goToForgotPasswordPage() {
        LoginPage loginPage = new LoginPage(getDriver());
        goToLoginPage();
        click(loginPage.getForgotPasswordLink());
        return new ForgotPasswordPage(getDriver());
    }

    public GetHelpPage goToGetHelpPage() {
        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(getDriver());
        goToForgotPasswordPage();
        click(forgotPasswordPage.getParagraphGetHelpLink());
        return new GetHelpPage(getDriver());
    }

    public HomePage checkForGoToHomePage() {
        assertEquals(this.header,"monster");
        return this;
    }


}
