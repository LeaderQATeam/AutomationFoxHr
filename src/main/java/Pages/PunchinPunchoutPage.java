package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PunchinPunchoutPage {

    private WebDriverWait wait;
    JavascriptExecutor js;


    public PunchinPunchoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 60);
        // actions = new Actions(driver);
        js = (JavascriptExecutor) driver;

    }

    @FindBy(xpath = "//button[contains(text(),\"Accept\")]")
    private WebElement acceptCookies;

    @FindBy(xpath = "/html/body/app-root/app-content/div/div/app-home/div[2]/div[2]/app-virtual-attendance/div/div[2]/div/div[1]/div[1]/button")
    public WebElement punchinButton;

    @FindBy(xpath = "/html/body/app-root/app-content/div/div/app-home/div[2]/div[2]/app-virtual-attendance/div/div[2]/div/div[1]/div[2]/button")
    public WebElement punchoutButton;




    public void clickPunchin()

    {
        wait.until(ExpectedConditions.visibilityOf(punchinButton));
        js.executeScript("arguments[0].click()", punchinButton);
    }
    public void clickPunchout()
    {  wait.until(ExpectedConditions.visibilityOf(punchoutButton));
        js.executeScript("arguments[0].click()", punchoutButton);


    }

}








