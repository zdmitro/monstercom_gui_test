import org.testng.annotations.Test;
import pages.HomePage;

public class GetHelpPageTest extends BaseTest {

    @Test
    public void validGetHelpTest_OpenGetHelpPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage
                .goToGetHelpPage();
    }

}
