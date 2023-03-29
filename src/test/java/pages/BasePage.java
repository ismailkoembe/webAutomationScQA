package pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import stepDefinitions.Hook;
import org.openqa.selenium.JavascriptExecutor;

/**
 * @author Ismail Koembe
 */

@Slf4j
public abstract class BasePage extends Hook {

    @FindBy(xpath = "//span[contains(text(),'Accept')]")
    public WebElement cookiesAccept;

    public void waitAndClick(WebElement element){
        long start = System.currentTimeMillis();
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        log.info("Clicked in {}ms", System.currentTimeMillis() - start);

    }

    public void handleCookiesBanner(){

        try{
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", cookiesAccept);
        }catch (Exception e){
            log.info("Cookies doesn't appear");
        }


    }

    public void waitUntilPresenceOfRadioButtonAndClick(){
        long start = System.currentTimeMillis();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[type = 'radio']"))).click();
        log.info("Waited and clicked in {}ms for radio button", System.currentTimeMillis() - start);
    }

}
