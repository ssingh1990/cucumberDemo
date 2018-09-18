package stepDefinations;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import managers.WebDriverManager;
import org.junit.Assert;
import pageObjects.HomePage;

import javax.lang.model.util.Elements;
import javax.xml.bind.Element;
import java.awt.*;

public class HomePageSteps {

    TestContext testContext;
    HomePage homePage;

    public HomePageSteps(TestContext context){
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
    }

    @Given("^user is on google home page$")
    public void user_is_on_Home_Page() throws InterruptedException {
        homePage.navigateToHomePage();
    }

    @When("^I search for \"([^\"]*)\" in search field$")
    public void he_search_for(String data) throws InterruptedException {
        homePage.perform_Search(data);
    }
}
