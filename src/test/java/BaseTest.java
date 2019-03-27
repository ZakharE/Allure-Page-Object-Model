import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public static WebDriver driver;
    public static MainPage mainPage;
    public static ResendPage resendPage;

    @BeforeClass
    public static void setUp () {
        driver = new ChromeDriver();
        String url = "https://www.wrike.com";
        driver.get(url);
        mainPage = new MainPage(driver);

    }

    @AfterClass
    public static void tearDown() {
//        driver.close();
    }
}
