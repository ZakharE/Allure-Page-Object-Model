import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class ResendPage extends PageObject {

    private WebElement veryInterestingButton;
    private WebElement justLookingButton;
    private WebElement membersFirstButton;
    private WebElement membersSecondButton;
    private WebElement membersThirdButton;
    private WebElement membersFourthButton;
    private WebElement membersFithButton;
    private WebElement managingYesButton;
    private WebElement managingNoButton;
    private WebElement submitAnswersButton;
    private WebElement resendEmailButton;
    private WebElement twitterLogoButton;


    public ResendPage(WebDriver driver) {
        super(driver);
        veryInterestingButton = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[1]/label[1]/button"));
        justLookingButton = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[1]/label[2]/button"));
        membersFirstButton = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[2]/label[1]/button"));
        membersSecondButton = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[2]/label[2]/button"));
        membersThirdButton = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[2]/label[3]/button"));
        membersFourthButton = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[2]/label[4]/button"));
        membersFithButton = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[2]/label[5]/button"));
        managingYesButton = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[3]/label[1]/button"));
        managingNoButton = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[3]/label[2]/button"));
        submitAnswersButton = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/button"));
        resendEmailButton = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[1]/p[3]/button"));
        twitterLogoButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[1]/div/ul/li[1]"));
    }

    public void veryInterestingButtonClick() {
        veryInterestingButton.click();
    }

    public void justLookingButtonClick() {
        justLookingButton.click();
    }

    public void membersFirstButtonClick() {
        membersFirstButton.click();
    }

    public void membersSecondButtonClick() {
        membersSecondButton.click();
    }

    public void membersThirdButtonClick() {
        membersThirdButton.click();
    }

    public void membersFourthButtonClick() {
        membersFourthButton.click();
    }

    public void membersFithButtonClick() {
        membersFithButton.click();
    }

    public void managingYesButtonClick() {
        managingYesButton.click();
    }

    public void managingNoButtonClick() {
        managingNoButton.click();
    }

    public void submitAnswersButtonClick() {
        submitAnswersButton.submit();
    }

    public void resendEmailButtonClick() {
        resendEmailButton.click();
    }

    public void twitterLogoButtonClick() {
        twitterLogoButton.click();
    }



    public void pushRandomAnswers() {
        firstQuestionRandomFill();
        secondQuestionRandomFill();
        thirdQuestionRandomFill();
    }

    private void firstQuestionRandomFill() {
        Random r = new Random();
        int valueRange = Integer.MAX_VALUE;
        int result = r.nextInt(valueRange) % 2;

        switch (result) {
            case 0:
                veryInterestingButtonClick();
                break;
            case 1:
                justLookingButtonClick();
                break;
        }
    }

    private void secondQuestionRandomFill() {
        Random r = new Random();
        int valueRange = Integer.MAX_VALUE;
        int result = r.nextInt(valueRange) % 5;

        switch (result) {
            case 0:
                membersFirstButtonClick();
                break;
            case 1:
                membersSecondButtonClick();
                break;
            case 2:
                membersThirdButtonClick();
                break;
            case 3:
                membersFourthButtonClick();
                break;
            case 4:
                membersFithButtonClick();
                break;
        }
    }

    private void thirdQuestionRandomFill() {
        Random r = new Random();
        int valueRange = Integer.MAX_VALUE;
        int result = r.nextInt(valueRange) % 2;

        switch (result) {
            case 0:
                managingYesButtonClick();
                break;
            case 1:
                managingNoButtonClick();
                break;
        }
    }
}
