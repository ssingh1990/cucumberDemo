package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.ProductListingPage;

public class PageObjectManager {

    private WebDriver driver;
    private HomePage homepage;
    private ProductListingPage productlistingpage;
    private CartPage cartpage;
    private CheckoutPage checkoutpage;

    public PageObjectManager(WebDriver driver){
        this.driver=driver;
    }

    public HomePage getHomePage(){
        return (homepage==null)? homepage=new HomePage(driver): homepage;
        }

     public ProductListingPage getProductlistingpage(){
        return (productlistingpage==null)? productlistingpage= new ProductListingPage(driver): productlistingpage;
     }

     public CartPage getCartpage(){
         return (cartpage==null)? cartpage=new CartPage(driver): cartpage;
     }

     public CheckoutPage getCheckoutpage(){
         return (checkoutpage==null)? checkoutpage=new CheckoutPage(driver): checkoutpage;
     }


}
