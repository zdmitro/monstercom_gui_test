package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends BasePage {

    private By headerPage = By.xpath("//*[@id='SignUpForm']/fieldset/h1");

    private By alreadyHaveAMonsterAccount_Label = By.xpath("//*[@id='SignUpForm']/fieldset/h1");
    private By signInLink = By.xpath("//*[@id='SignUpForm']/fieldset/h2/a");

    private By continueWithFacebookBtn = By.id("btn-facebook-signup");
    private By signUpWithGoogleBtn = By.id("btn-google-signup");
    private By neverShareLabel = By.xpath("//*[@id='SignUpForm']/fieldset/span");
    private By deviderOr = By.xpath("//*[@id='SignUpForm']/fieldset/div[5]/span");

    private By emailAddressLabel = By.xpath("//*[@id='SignUpForm']/fieldset/div[6]/label");
    private By emailAddressField = By.xpath("EmailAddress");

    private By passwordLabel = By.xpath("//*[@id='divPassword']/label");
    private By passwordField = By.id("Password");
    private By passwordInstructionLabel = By.xpath("//*[@id='divPassword']/p");

    //?????
    private By emailMeUpdatesLabel = By.xpath("//*[@id='SignUpForm']/fieldset/div[8]/div/p");
    private By yesCheckBox = By.xpath("//*[@id='OptiInEmailCarrerRelated']");
    private By yesCheckBoxLabel = By.xpath("//*[@id='OptiInEmailCarrerRelatedLabel']");
    private By noCheckBox = By.xpath("//*[@id='OptiInEmailCarrerRelated']");

    private By emailJobPostingsMessage = By.xpath("//*[@id='SignUpForm']/fieldset/div[9]/div/p/text()");


    public SignUpPage(WebDriver driver) {
        super(driver);
    }
}
