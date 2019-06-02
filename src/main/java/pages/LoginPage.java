package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoginPage extends BasePage {

//    private By headerPage = By.xpath("//*[@id='SignInform']/h1");
    private By headerPage = By.xpath("//*[@id='SignInform/ah']");
    //email address
    private By emailAddressFieldLabel = By.xpath("//*[@id='SignInform']/div/div[2]/label");
//    private By emailAddressField = By.id("EmailAddress");
    private By emailAddressField = By.id("EmailAddress523");

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
//    private By signUpLabel = By.xpath("//*[@id='SignInform']/div/h2");
    private By signUpLabel = By.xpath("//*[@id='SignInform']/div/h1");
    private By singUpBtn = By.id("btn-signup");

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

    public LoginPage(WebDriver driver) {
        super(driver);

    }
}
