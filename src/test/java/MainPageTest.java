import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainPageTest extends BaseTest {

    @Test
    public void testScenario(){
        mainPage.getStartedForFreeButtonClick();
        mainPage.enterEmail(UtilMethods.emailGeneration(6));
        resendPage = mainPage.submitEmail();
        Assert.assertTrue(resendPage.driver.getTitle().equals("Thank you for choosing Wrike!"));
        resendPage.pushRandomAnswers();
        resendPage.submitAnswersButtonClick();
        WebElement myDynamicElement = (new WebDriverWait(driver, 60))
                .until(ExpectedConditions.visibilityOf(resendPage.driver.findElement(By.className("survey-success"))));
        Assert.assertTrue(!resendPage.driver.findElement(By.className("survey-form")).isDisplayed());
        resendPage.resendEmailButtonClick();
        Assert.assertTrue(resendPage.driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[1]/p[3]/button")).isDisplayed());
//        resendPage.twitterLogoButtonClick();
//        System.out.println(resendPage.driver.getCurrentUrl());
    }

}
