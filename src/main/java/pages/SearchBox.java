package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.xml.stream.Location;

public class SearchBox extends BasePage{

    By searchBoxLocator = By.xpath("//input[@placeholder='Ürün, Marka Arayın']");
    By submitButtonLocator = By.xpath("//button[@class='o-header__search--btn bmi-search']");


    public SearchBox(WebDriver driver) {
        super(driver);
    }


    public void type(String text) {
        type(searchBoxLocator , text);
    }
    public void click(By locator) {
        click(locator);
    }

    public void remove() {
        sendKey(Keys.CONTROL + "a");
        sendKey(Keys.DELETE);
    }
    public  void enter(){
        sendKey(Keys.ENTER);
    }

    public  void sendKey(CharSequence... key){
        sendKeys(searchBoxLocator,key);
    }
}
