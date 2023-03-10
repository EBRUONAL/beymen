package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {

    SearchBox searchBox ;

    By cartCountLocator = By.className("o-header__userInfo--count");
    By cartContainerLocator = By.xpath(("//span[@class='o-header__userInfo—text’]"));
    By acceptCookiesLocator = By.xpath("//button[@id='onetrust-accept-btn-handler']");
    By genderWomanButtonLocator = By.xpath("//button[@id='genderWomanButton']");


    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox(){
        return this.searchBox;
    }

    public boolean isProductCountUp() {
        return getCartCount() > 0 ;
    }

    public void goToCart() {
        click(cartContainerLocator);
    }

    private int getCartCount(){
        String count = find(cartCountLocator).getText();
        return Integer.parseInt(count);
    }

    public void acceptCookies(){
        if (isDisplayed(acceptCookiesLocator)){
            click(acceptCookiesLocator);
        }
    }
    public void genderWomanButton(){
        if (isDisplayed(genderWomanButtonLocator)){
            click(genderWomanButtonLocator);
        }
    }


}
