import org.testng.annotations.Test;
import pages.HomePage;

public class ForgotPasswordPageTest extends BaseTest {

    @Test
    public void validForgotPasswordTest_OpenForgotPasswordPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage
                .goToForgotPasswordPage();
    }
}
