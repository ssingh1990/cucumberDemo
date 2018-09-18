package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import java.util.List;

public class SearchResult {

    public SearchResult(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

  /*  @FindBy(how=How.XPATH, using = "//h2[text()='People also ask']")
    private WebElement TEXTMSGE;
*/
    @FindAll(@FindBy(how = How.XPATH, using = ".//*[@id='rso']/div[3]/div/div/div/div/h3/a"))
    private List<WebElement> linkList;

    public void clickOn_link(int num) {
        int size = linkList.size();
        System.out.println(size);
        linkList.get(num).click();
    }

}