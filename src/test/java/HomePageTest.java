import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest {

    @Test // All the tests are public void
    public void validHomeTest_OpenHomePage() {
        HomePage homePage = new HomePage(getDriver());
        homePage
                .goToHomePage()
                .checkForGoToHomePage();
    }
}
