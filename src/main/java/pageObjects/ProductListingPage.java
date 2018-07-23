package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductListingPage {


    public ProductListingPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.CSS, using = "button.single_add_to_cart_button")
    private WebElement btn_AddToCart;

    @FindAll(@FindBy(how = How.XPATH, using = "//div[@class='noo-product-inner noo-product-inner2']"))
    private List<WebElement> prd_List;

    public void clickOn_AddToCart() {
        btn_AddToCart.click();

    }

    public void select_Product(int productNumber) {
        System.out.println(prd_List.size());
        prd_List.get(productNumber).click();
    }



}
