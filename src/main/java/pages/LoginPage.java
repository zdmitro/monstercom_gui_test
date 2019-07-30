package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

import static data.Data.LOGIN;
import static data.Data.PASSWORD;

public class LoginPage extends BasePage {

    private By headerPage = By.xpath("//*[@id='SignInform']/h1");
    //email address
    private By emailAddressFieldLabel = By.xpath("//*[@id='SignInform']/div/div[2]/label");
    private By emailAddressField = By.id("EmailAddress");

    //password
    private By passwordFieldLabel = By.xpath("//*[@id='SignInform']/div/div[3]/label");
    private By passwordField = By.id("Password");

    //Check Box Keep me logged in
    private By keepMeLoggedIn_CheckBox = By.id("PersistLogin");
    private By keepMeLoggedIn_Label = By.xpath("//*[@id='SignInform']/div/div[4]/label");

    private By forgotPasswordLink = By.xpath("//*[@id='SignInform']/div/div[4]/span/a");
    private By deviderOr = By.xpath("//*[@id='SignInform']/div/div[5]/span");
    private By signInBtn = By.id("btn-login");
    private By singInWithFacebookBtn = By.id("btn-facebook-signup");
    private By signInWithGoogleBtn = By.id("btn-google-signin");

    //Sing Up
    private By signUpLabel = By.xpath("//*[@id='SignInform']/div/h2");
    private By singUpBtn = By.id("btn-signup");

    //Error messages
    private By emailErrorMessage = By.id("EmailAddress-error");
    private By passwordErrorMessage = By.id("Password-error");
    private By unknownUserMessage = By.xpath("//*[@id='SignInform']/div/div[1]/div/strong");
    private By tooManyWrongAttemptsMessage = By.xpath("//*[@id='SignInform']/div/div[1]/div/ul/li");
    private By notAValidEmailAddressMessage = By.xpath("//*[@id='EmailAddress-error']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public By getForgotPasswordLink() {
        return forgotPasswordLink;
    }

    public LoginPage checkElementsDisplayed() {
        List<By> byList = Arrays.asList(
                this.headerPage,
                this.emailAddressFieldLabel,
                this.emailAddressField,
                this.passwordFieldLabel,
                this.passwordField,
                this.keepMeLoggedIn_CheckBox,
                this.keepMeLoggedIn_Label,
                this.forgotPasswordLink,
                this.deviderOr,
                this.signInBtn,
                this.singInWithFacebookBtn,
                this.signUpLabel,
                this.singUpBtn
        );
//        List<By> byList = new ArrayList<By>();
//        byList.add(this.emailAddressFieldLabel);
//        byList.add(this.emailAddressField);
//        byList.add(this.passwordFieldLabel);
//        byList.add(this.passwordField);
//        byList.add(this.keepMeLoggedIn_CheckBox);
//        byList.add(this.keepMeLoggedIn_Label);
//        byList.add(this.forgotPasswordLink);
//        byList.add(this.deviderOr);
//        byList.add(this.signInBtn);
//        byList.add(this.singInWithFacebookBtn);
//        byList.add(this.signInWithGoogleBtn);
//        byList.add(this.signUpLabel);
//        byList.add(this.singUpBtn);

        assertElementsDisplayed(byList);
        return this;
    }

    public LoginPage login(String login, String password) {
        writeText(this.emailAddressField, login);
        writeText(this.passwordField, password);
        click(this.signInBtn);
        return this;
    }

    public LoginPage checkForOpenAccountPage(String userName) {
        AccountPage accountPage = new AccountPage(getDriver());
        assertEquals(accountPage.getUserName(), userName);
        return this;
    }

    public LoginPage checkForEmailAndPasswordErrors() {
        assertEquals(this.emailErrorMessage, "Error: Email address is required.");
        assertEquals(this.passwordErrorMessage, "Error: Password is required.");
        return this;
    }

    public LoginPage checkForWarningMessage(String message) {
        assertEquals(this.unknownUserMessage, message);
        return this;
    }

    public LoginPage checkForTooManyLoginAttempts(String message) {

        assertEquals(this.tooManyWrongAttemptsMessage, message);
        return this;
    }

    public LoginPage loginMultipleTimes(String login, String password) {

        writeText(this.emailAddressField, login);
        writeText(this.passwordField, password);
        for (int i = 0; i < 5; i++) {
            click(this.signInBtn);
        }
        return this;
    }

    public LoginPage checkForInvalidEmailAddress(String message) {

        assertEquals(this.notAValidEmailAddressMessage, message);
        return this;
    }


}
