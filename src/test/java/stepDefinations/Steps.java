package stepDefinations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.ProductListingPage;
import dataProvider.ConfigFileReader;


public class Steps {
    WebDriver driver;
    HomePage homepage;
    ProductListingPage productlistingpage;
    CartPage cartpage;
    CheckoutPage checkoutpage;
    PageObjectManager pageObjectManager;
    WebDriverManager webDriverManager;

    @Given("^user is on home page$")
    public void user_is_on_Home_Page(){
        webDriverManager = new WebDriverManager();
        driver = webDriverManager.getDriver();
        /*System.setProperty("webdriver.chrome.driver", FileReaderManager.getInstance().getConfigReader().getDriverPath());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(),TimeUnit.SECONDS);*/
        pageObjectManager = new PageObjectManager(driver);
        homepage=pageObjectManager.getHomePage();
        homepage.navigateToHomePage();
    }

    @When("^he search for \"([^\"]*)\"$")
    public void he_search_for(String product)  {
        homepage.perform_Search(product);
    }

    @When("^chose to bye the first item$")
    public void choose_to_buy_the_first_item() {
        productlistingpage = pageObjectManager.getProductlistingpage();
        productlistingpage.select_Product(0);
        productlistingpage.clickOn_AddToCart();
    }

    @When("^move to checkout from mini cart$")
    public void moves_to_checkout_from_mini_cart(){
        cartpage = pageObjectManager.getCartpage();
        cartpage.clickOn_Cart();
        cartpage.clickOn_ContinueToCheckout();
    }

    @When("^enter the personal details on checkout page$")
    public void enter_personal_details_on_checkout_page() throws InterruptedException {
        checkoutpage = pageObjectManager.getCheckoutpage();
        checkoutpage.fill_PersonalDetails();
    }

    @When("^select some deleivry address$")
    public void select_same_delivery_address() throws InterruptedException{
        checkoutpage.check_ShipToDifferentAddress(false);
    }

    @When("^select payment method as \"([^\"]*)\"$")
    public void select_payment_method_as_payment(String arg1){
        checkoutpage.select_PaymentMethod("CheckPayment");
    }

    @When("^place order$")
    public void place_the_order() throws InterruptedException {
        checkoutpage.check_TermsAndCondition(true);
        checkoutpage.clickOn_PlaceOrder();

        driver.quit();
    }

}