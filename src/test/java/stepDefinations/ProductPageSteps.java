package stepDefinations;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.ProductListingPage;

public class ProductPageSteps {
    TestContext testContext;
    ProductListingPage productListingPage;

    public ProductPageSteps(TestContext context){
        testContext = context;
        productListingPage = testContext.getPageObjectManager().getProductlistingpage();
    }

    @When("^chose to bye the first item$")
    public void choose_to_buy_the_first_item()  {
        productListingPage.select_Product(1);
        productListingPage.clickOn_AddToCart();
    }
}
