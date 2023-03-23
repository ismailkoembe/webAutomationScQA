package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Ismail Koembe
 */
public class HomePage extends BasePage {
    @FindBy(xpath = "//a[@aria-label='Home (active)']")
    public WebElement homeButton;

    @FindBy(xpath = "//a[@class='mdc-ripple-upgraded mdc-button mdc-button--dense mdc-button--unelevated']//div[@class='mdc-button__ripple']")
    public WebElement takeRatButton;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
}
