import org.testng.annotations.Test;
import pages.HomePage;

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

}
