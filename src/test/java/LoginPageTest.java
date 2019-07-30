import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import static data.Data.*;

public class LoginPageTest extends BaseTest{

    /**
     * This test checks for 11 elements on the page. (describe all elements)
     */
    @Test
    public void validLoginPage_OpenLoginPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage
                // 1. Go to Login Page
                .goToLoginPage()
                // 2. Check if 11 elements are present on the page
                .checkElementsDisplayed();
        // Expected result: elements are found on the page
    }

    @Test(priority = 1)
    public void validLoginPage_SuccessfullAuthorization() {
        HomePage homePage = new HomePage(getDriver());
        homePage
                .goToLoginPage()
                .login(LOGIN, PASSWORD)
                .checkForOpenAccountPage(USERNAME);
    }

    @Test(priority = 2)
    public void invalidLoginPage_EmptyFieldsAuthorization() {
        HomePage homePage = new HomePage(getDriver());
        homePage
                .goToLoginPage()
                .login("", "")
                .checkForEmailAndPasswordErrors();
    }


    @Test(priority = 3)
    public void invalidLoginPage_UnknownUserAuthorization() {
        HomePage homePage = new HomePage(getDriver());
        homePage
                .goToLoginPage()
                .login("unknownUser@test.test", "12345678")
                .checkForWarningMessage("Whoops, we noticed something incorrect...");
    }

    @Test(priority = 4)
    public void invalidLoginPage_TooManyAttempts() {
        HomePage homePage = new HomePage(getDriver());

        homePage
                .goToLoginPage()
                .loginMultipleTimes("zdmitrorover@gmail.com", "12345678")
                .checkForTooManyLoginAttempts("Too Many Wrong Attempts");
    }

    @Test(priority = 5)
    public void invalidLoginPage_InvalidEmailAddress() {
        HomePage homePage = new HomePage(getDriver());

        homePage
                .goToLoginPage()
                .login("aaa", "1234567")
                .checkForInvalidEmailAddress("The email address you entered does not represent a valid email address.");
    }

}
