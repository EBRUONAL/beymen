package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage {

    By shippingOptionLocator = By.id("productListTitle");
    By productNameLocator = new By.ByCssSelector("span.a-size-base-plus");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return isDisplayed(shippingOptionLocator);
    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();
    }

    private List<WebElement> getAllProducts(){
        return findAll(productNameLocator);
    }
}
