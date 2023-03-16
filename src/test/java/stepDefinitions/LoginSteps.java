package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;
import utilities.PropManager;

import java.util.List;

/**
 * @author Ismail Koembe
 */
@Slf4j
public class LoginSteps {
    public HomePage homePage = new HomePage();
    public LoginPage login = new LoginPage();

    @Given("I navigate to login page")
    public void i_navigate_to_login_page() {
        String url = PropManager.getProperties(login.env, "loginUrl");
        homePage.driver.get(url);



    }
    @Given("I submit my email")
    public void i_submit_my_email() {
        login.email.sendKeys("ikprdus@scqa.me");


    }

    @And("I submit {string}")
    public void iSubmit(String email) {
        log.info("Provided email is {}", email);
        switch (email){
            case "tracker user":
                login.email.sendKeys(PropManager.getProperties(login.env, "trackerUser"));
                break;
            case "feed user":
                login.email.sendKeys(PropManager.getProperties(login.env, "feedUser"));
                break;

            case "invalid_user":
                login.email.sendKeys(PropManager.getProperties(login.env, "invalidUser"));
                break;
        }


    }

    @And("I login {string}")
    public void iLogin( String email) {


            log.info("Provided email is {}", email);
            switch (email){
                case "tracker user":
                    login.email.sendKeys(PropManager.getProperties(login.env, "trackerUser"));
                    login.password.sendKeys("Qweasdzxc1!");
                    login.loginButton.click();
                    break;
                case "feed user":
                    login.email.sendKeys(PropManager.getProperties(login.env, "feedUser"));
                    login.password.sendKeys("Qweasdzxc1!");
                    login.loginButton.click();
                    break;

                case "invalid_user":
                    login.email.sendKeys(PropManager.getProperties(login.env, "invalidUser"));
                    login.password.sendKeys("Qweasdzxc1!");
                    login.loginButton.click();
                    break;
        }




    }


    @Then("I navigate home page")
    public void i_navigate_home_page() {
        Assert.assertTrue(homePage.homeButton.isDisplayed(), "Home button should be visible");

    }


}
