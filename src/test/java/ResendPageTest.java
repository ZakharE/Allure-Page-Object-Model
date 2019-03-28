import io.qameta.allure.Step;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class ResendPageTest extends BaseTest {


    @Step("Click \"Get started fo free\" and move to new new page")
//    public void fillQAFormWithRandomAnswers(){
    public String pressEmailButton() {

        mainPage.getStartedForFreeButtonClick();
        mainPage.enterEmail(UtilMethods.emailGeneration(6));
        resendPage = mainPage.submitEmail();
//        Assert.assertTrue(resendPage.driver.getTitle().equals("Thank you for choosing Wrike!"));
        return resendPage.driver.getTitle();
    }
     @Step("Fill Q&A section with random answers and check submission")
        public boolean  fillQAFormWithRandomAnswers(){
            resendPage.pushRandomAnswers();
            resendPage.submitAnswersButtonClick();
            WebElement waiter = (new WebDriverWait(resendPage.driver, 60))
                    .until(ExpectedConditions.visibilityOf(resendPage.driver.findElement(By.className("survey-success"))));
//            Assert.assertTrue(!resendPage.driver.findElement(By.className("survey-form")).isDisplayed());
            return !resendPage.driver.findElement(By.className("survey-form")).isDisplayed();
     }
    @Step("Press \"Resend Email\" and check submission")
    public boolean  pressResendEmailButton() {
        resendPage.resendEmailButtonClick();
       return resendPage.driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[1]/p[3]/button")).isDisplayed();
//        Assert.assertTrue(resendPage.driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[1]/p[3]/button")).isDisplayed());
//
    }
    @Step("Press \"Twiter\" button and check URL validity")
    public String pressTwitterButton() {
        String url;
        resendPage.twitterLogoButtonClick();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
//        Assert.assertEquals("https://twitter.com/wrike", (driver.getCurrentUrl()));

        url = driver.getCurrentUrl();
        driver.switchTo().window(tabs2.get(0));
        return url;
    }

    @Test
    public void finalTest() {
        Assert.assertTrue(pressEmailButton().equals("Thank you for choosing Wrike!"));
        Assert.assertTrue(fillQAFormWithRandomAnswers());
        Assert.assertTrue(pressResendEmailButton());
        Assert.assertEquals("https://twitter.com/wrike", pressTwitterButton());

    }

    }
