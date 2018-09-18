package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import java.util.List;

public class FinalSearchResultPage {

    public FinalSearchResultPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

      @FindBy(how=How.XPATH, using = "//h1[@class='blog-title entry-title']/a")
      private WebElement titleMessage;


    public String verifysearchpage() {
       return titleMessage.getText();
    }

}