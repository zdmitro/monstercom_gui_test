package pages;

import data.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class UploadResumePage extends BasePage {

    public UploadResumePage(WebDriver driver) {
        super(driver);
    }

    private By uploadFromMyComputerBtn = By.id("btnUploadFromMyComputer");


    public UploadResumePage goToUploadResumePage() {
        getDriver().get(Data.UPLOAD_RESUME_URL);
        return this;
    }

    public UploadResumePage clickUploadFromMyComputerBtn() {
        click(this.uploadFromMyComputerBtn);
        return this;
    }

    public UploadResumePage runUploadResume_exe() throws IOException {
        Runtime.getRuntime().exec("C:\\AutoIT\\FileUpload.exe");
        //getDriver().findElement(By.xpath("//*[@id=\"btnUploadFromMyComputer\"]")).sendKeys("C:\\Users\\Owner\\Documents\\QA\\User Stories.docx");
        return this;
    }

//    public LoginPage goToLoginPage() {
//        getDriver().get(Data.URL);
//        click(this.loginButton);
//        return new LoginPage(getDriver());
//    }

}
