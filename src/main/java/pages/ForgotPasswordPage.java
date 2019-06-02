package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage extends BasePage {

    private By header = By.xpath("//*[@id='ForgotPassword']/div/h1");
    private By paragraphWithInstructions = By.xpath("//*[@id='ForgotPassword']/div/p");
    private By paragraphGetHelpLink = By.xpath("//*[@id='ForgotPassword']/div/p/a");
    private By emailLabel = By.xpath("//*[@id='ForgotPassword']/div/div[1]/div/div/label");
    private By emailField = By.xpath("//*[@id='EmailAddress']");
    private By sendResendInstructionsBtn = By.xpath("//*[@id='ForgotPassword']/div/div[2]/div/button");


    public By getParagraphGetHelpLink() {
        return paragraphGetHelpLink;
    }

    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
    }
}
