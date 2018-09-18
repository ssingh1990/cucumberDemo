
package stepDefinations;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.SearchResult;

public class SearchResultPage {

    TestContext testContext;
    SearchResult searchresult;

    public SearchResultPage(TestContext context){
        testContext = context;
        searchresult=testContext.getPageObjectManager().getSearchresultpage();
        }


    @When("^I click on the link in google search result page$")
    public void i_click_on_the_nd_link_in_google_search_result_page() throws Throwable {
        searchresult.clickOn_link(1);
        Thread.sleep(5000);
       /* String MSG = searchresult.clickOn_link();
        Assert.assertTrue("not getting msg", MSG.contains("People also ask"))*/;
    }

}

