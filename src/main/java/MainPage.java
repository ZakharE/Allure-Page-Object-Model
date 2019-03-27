import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class MainPage extends PageObject {
    private WebElement getStartedForFreeButton;

    private WebElement insertEmailBox;

    private WebElement submitEmailButton;

    public MainPage(WebDriver driver) {
        super(driver);
        getStartedForFreeButton = driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/div[2]/div/div/div[2]/div/form/button"));
        insertEmailBox = driver.findElement(By.xpath("//*[@id=\"modal-pro\"]/form/label[1]/input"));
        submitEmailButton = driver.findElement(By.xpath("//*[@id=\"modal-pro\"]/form/label[2]/button"));
    }

    public void getStartedForFreeButtonClick() {
        this.getStartedForFreeButton.click();
    }

    public void enterEmail(String email) {
        insertEmailBox.sendKeys(email);
    }

    public ResendPage submitEmail() {
        submitEmailButton.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        return new ResendPage(driver);
    }

}
