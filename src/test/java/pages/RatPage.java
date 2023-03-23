package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * @author Ismail Koembe
 */
public class RatPage extends BasePage{
    @FindBy (xpath = "//button[@class='mdc-ripple-upgraded mdc-button mdc-button--unelevated']//div[@class='mdc-button__ripple']")
    public WebElement next;
    @FindBy (xpath = "//span[normalize-space()='Pause']")
    public WebElement pause;
    @FindBy (css = "[type = 'radio']")
    public List<WebElement> radioButtons;
    @FindBy (xpath = "//select")
    public List<WebElement> dropDownList;
    @FindBy (css = "[type= 'checkbox']")
    public List<WebElement> checkBoxes;
    @FindBy (xpath = "//input")
    public List<WebElement> inputBoxList;



    public RatPage() {
        PageFactory.initElements(driver, this);
    }
}
