package pages;


import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

/**
 * @author Ismail Koembe
 */
@Slf4j
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
    public static Random rd = new Random();


    public RatPage() {
        PageFactory.initElements(driver, this);
    }

    public void takeRealAgeTest(){
        while (pause.getText().equals("Pause")){
            /**
             * In while loop we need to answer all question
             * Questions have radio button, input text, dropdown menu
             */

            if(radioButtons.size()>0){
                System.out.println("Answer with radio button");
                answerWithRadioButtons();
            }else if (dropDownList.size() >0){
                System.out.println("Answer with drop down");
                answerWithDropDownList();
            }else if(checkBoxes.size()>0){
                System.out.println("Answer with checkbox");
                answerWithCheckBoxes();
            }else if (inputBoxList.size()>0){
                System.out.println("Answer with inputbox");
            }


        }



    }

    public void answerWithDropDownList() {
        //TODO : Improve random integer

        for (int i = 0; i < dropDownList.size(); i++) {
            Select select = new Select(dropDownList.get(i));
            log.info("This dropdown has {} options", select.getOptions().size());
            int index = rd.nextInt(select.getOptions().size()-1)+1;
            select.selectByIndex(index);
            log.info("I selected {} options", index);
        }
        waitAndClick(next);

    }

    public void answerWithRadioButtons() {
        //TODO solve stale element exception
//        int attempts = 0;
//        int maxAttempts = 2;
//        while(attempts<maxAttempts){
            try {
                int size = radioButtons.size();
                int index = rd.nextInt(size);
                if(!radioButtons.get(index).isSelected()){
//                    radioButtons.get(index).click();
                    waitUntilPresenceOfRadioButtonAndClick();

                }
//                attempts++;
            }catch (Exception e){
                log.error("Selenium failed to click Radio Button");
            }
//        }
        waitAndClick(next);

    }

    public void answerWithCheckBoxes() {
        int attempts = 0;
        int maxAttempts = 2;
        while(attempts<maxAttempts){
            try {
                int size = checkBoxes.size();
                int index = rd.nextInt(size);
                if(!checkBoxes.get(index).isSelected()){
                    checkBoxes.get(index).click();
                }
                attempts++;
            }catch (Exception e){
                log.error("Selenium failed to click check box");
            }
        }
        waitAndClick(next);



    }
}
