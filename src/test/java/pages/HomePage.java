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


    public HomePage() {
        PageFactory.initElements(driver, this);
    }
}
