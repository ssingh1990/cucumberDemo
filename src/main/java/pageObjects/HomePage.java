package pageObjects;
import managers.FileReaderManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    // Create cunstructor to inatlized driver object and Page Facteory inatialztion

    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void perform_Search(String search) {
        driver.navigate().to(FileReaderManager.getInstance().getConfigReader().getApplicationUrl()+ "/?s=" + search + "&post_type=product");
    }

    public void navigateToHomePage(){
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
    }

}
