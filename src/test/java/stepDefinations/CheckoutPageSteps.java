package stepDefinations;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import managers.FileReaderManager;
import pageObjects.CheckoutPage;
import testDataTypes.Customer;

public class CheckoutPageSteps {

    TestContext testContext;
    CheckoutPage checkoutPage;
    //Customer customer;
    public CheckoutPageSteps(TestContext context){
        testContext = context;
        checkoutPage = testContext.getPageObjectManager().getCheckoutpage();
    }

    @When("^enter \"([^\"]*)\" personal details on checkout page$")
    public void enter_personal_details_on_checkout_page(String cust) throws InterruptedException {
        Customer customer = FileReaderManager.getInstance().getJsonDataReader().getCustomerByName("sat");
        checkoutPage.fill_PersonalDetails(customer);
    }

    @When("^select some deleivry address$")
    public void select_same_delivery_address() throws InterruptedException{
        checkoutPage.check_ShipToDifferentAddress(false);
    }

    @When("^select payment method as \"([^\"]*)\"$")
    public void select_payment_method_as_payment(String arg1){
        checkoutPage.select_PaymentMethod("CheckPayment");
    }

    @When("^place order$")
    public void place_the_order() throws InterruptedException {
        checkoutPage.check_TermsAndCondition(true);
        checkoutPage.clickOn_PlaceOrder();

    }
}
