package stepDefinations;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObjects.HomePage;

import java.awt.*;

public class HomePageSteps {

    TestContext testContext;
    HomePage homePage;

    public HomePageSteps(TestContext context){
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
    }

    @Given("^user is on home page$")
    public void user_is_on_Home_Page(){
        homePage.navigateToHomePage();
    }

    @When("^he search for \"([^\"]*)\"$")
    public void he_search_for(String product)  {
        homePage.perform_Search(product);
    }
}
