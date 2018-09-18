package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.FinalSearchResultPage;
import pageObjects.SearchResult;
import pageObjects.HomePage;

public class PageObjectManager {

    private WebDriver driver;
    private HomePage homepage;
    private SearchResult searchresult;
    private FinalSearchResultPage finalSearchResultPage;

    public PageObjectManager(WebDriver driver){
        this.driver=driver;
    }

    public HomePage getHomePage(){
        return (homepage==null)? homepage=new HomePage(driver): homepage;
        }

    public SearchResult getSearchresultpage(){
        return  (searchresult==null)? searchresult=new SearchResult(driver): searchresult;
    }

    public FinalSearchResultPage getFinalSearchResultPage(){
        return  (finalSearchResultPage==null)? finalSearchResultPage=new FinalSearchResultPage(driver): finalSearchResultPage;
    }

}
