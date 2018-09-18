package stepDefinations;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pageObjects.FinalSearchResultPage;
import pageObjects.HomePage;

public class FinalSearchPage {

    TestContext testContext;
    FinalSearchResultPage finalSearchResultPage;

    public FinalSearchPage(TestContext context){
        testContext = context;
        finalSearchResultPage = testContext.getPageObjectManager().getFinalSearchResultPage();
    }

    @Then("^I should navigate to search result page$")
    public void i_should_navigate_to_search_result_page() throws Throwable {
        String exptectedtitlemessage= "25 Tourist Places In Delhi That Everyone Must Visit";
        String actuatlmessage = finalSearchResultPage.verifysearchpage();
        Assert.assertTrue("Not navigate to expected page", actuatlmessage.contains(exptectedtitlemessage));

    }
}
