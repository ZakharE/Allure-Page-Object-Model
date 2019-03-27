import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String url = "https://www.wrike.com";
        driver.get(url);


        MainPage mainPage = new MainPage(driver);
        mainPage.getStartedForFreeButtonClick();
        mainPage.enterEmail(UtilMethods.emailGeneration(6));
        ResendPage r = mainPage.submitEmail();
        r.pushRandomAnswers();
        r.submitAnswersButtonClick();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        boolean visible = r.driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/div")).isEnabled();
        driver.close();
        System.out.println(visible);
    }

}
