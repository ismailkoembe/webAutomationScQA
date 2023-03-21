package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Ismail Koembe
 */
public class PhoneCollectionPage extends BasePage{

    @FindBy(xpath = "//button[@class='mdc-ripple-upgraded mdc-button mdc-button--outlined']//div[@class='mdc-button__ripple']")
    public WebElement skip;


    public PhoneCollectionPage() {
        PageFactory.initElements(driver, this);
    }
}
