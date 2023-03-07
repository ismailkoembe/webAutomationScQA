package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Ismail Koembe
 */
public class LoginPage extends BasePage {
    @FindBy(id = "input.username")
    public WebElement email;

    @FindBy(id = "input.password")
    public WebElement password;

    @FindBy(xpath = "//button[@class ='mdc-ripple-upgraded mdc-button mdc-button--unelevated']")
    public WebElement loginButton;


    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
}
