import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected static WebDriver driver;
    protected static MainPage mainPage;
    protected static ResendPage resendPage;

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
        driver.quit();
    }
}
