package pageObjects;
import managers.FileReaderManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    // Create cunstructor to inatlized driver object and Page Facteory inatialztion

    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.ID, using = "lst-ib")
    private WebElement serch_btn;

    @FindBy(how=How.ID, using = "hplogo")
    private WebElement logoicon;

    @FindBy(how=How.XPATH, using = "//input[@type='submit' and @value='Google Search']")
    private WebElement googlesearchbtn;

    public void perform_Search(String search) throws InterruptedException {
        serch_btn.sendKeys(search);
        googlesearchbtn.click();
        Thread.sleep(10000);

    }

    public void navigateToHomePage(){
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
    }

  }
