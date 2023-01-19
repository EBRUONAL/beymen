import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import testlogger.TestResultLogger;

import static java.util.concurrent.TimeUnit.SECONDS;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestResultLogger.class)
public class BaseTest {

    WebDriver driver ;

    @BeforeAll
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.beymen.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, SECONDS);
    }
    
    @AfterAll
    public void tearDown(){
        driver.quit();
    }

}
/*
Tüm yazılan testler öncesinde ve sonrasında çalışacak temel testleri bu sayfada oluşturdum.
Yazılan test öncesinde çalışacak olanları before olarak , test sonrası çalışacak olanları
after olarak etiketledim.
yazdığım testlerde çalışma sırasını takip etmek için test ve order etiketlerini kullandım.

 */