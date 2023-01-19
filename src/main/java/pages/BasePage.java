package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



import java.util.List;

public class BasePage {

    WebDriver driver ;

    public BasePage(WebDriver driver){
        this.driver = driver ;
    }

    public WebElement find(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> findAll(By locator){
        return driver.findElements(locator);
    }

    public void click(By locator){
        find(locator).click();
    }

    public void type(By locator , String text){
        find(locator).sendKeys(text);
    }

    public void typeEnter(By locator){
        find(locator).sendKeys(Keys.ENTER);
    }


    public Boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }

    public void sendKeys(By locator,CharSequence... var1){
        find(locator).sendKeys(var1);
    }


    public static void threadSleep(int minutes){
        try {
            Thread.sleep(minutes);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
/*ortak metotları BasePage de topladım, kod tekrarının önüne geçmek için,
Diğer oluşturduğum pageleri extend yapıp, bu sayfaya bağladım.
Homepage -ana sayfa için
searcbox -arama alanı için
productspage- ürünü arattıktan sonra çıkan sonuçlar sayfası için
productsdetailpage -ürün seçimi yapıldıktan sonra açılan sayfa için
cartpage- sepetim butonu seçildikten sonra açılan sayfa için oluşturuldu.
her sayfa için kullanacağım metotları ilgili sayfada tanımladım.

 */