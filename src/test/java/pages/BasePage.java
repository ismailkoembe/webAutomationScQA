package pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import stepDefinitions.Hook;

/**
 * @author Ismail Koembe
 */

@Slf4j
public abstract class BasePage extends Hook {

    public void waitAndClick(WebElement element){
        long start = System.currentTimeMillis();
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        log.info("Clicked in {}ms", System.currentTimeMillis() - start);

    }

}
