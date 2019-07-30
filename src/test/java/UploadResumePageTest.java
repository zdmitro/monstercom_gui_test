import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.UploadResumePage;

import java.io.IOException;

public class UploadResumePageTest extends BaseTest {

   @Test
    public void uploadFileFromMyCumputer() throws IOException {
       UploadResumePage uploadResumePage = new UploadResumePage(getDriver());
       uploadResumePage
               .goToUploadResumePage()
               .clickUploadFromMyComputerBtn()
               .runUploadResume_exe();
   }


}
