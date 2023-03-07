package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.LoginPage;

/**
 * @author Ismail Koembe
 */
public class LoginSteps {
    public HomePage homePage = new HomePage();
    public LoginPage login = new LoginPage();

    @Given("I navigate to login page")
    public void i_navigate_to_login_page() {
        homePage.driver.get("https://you.sharecare.com");



    }
    @Given("I submit my email")
    public void i_submit_my_email() {
        login.email.sendKeys("ikprdus@scqa.me");


    }
    @Given("I submit my password")
    public void i_submit_my_password() {
        login.password.sendKeys("Qweasdzxc1!");


    }
    @Given("I click login button")
    public void i_click_login_button() {
        login.loginButton.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @Then("I navigate home page")
    public void i_navigate_home_page() {

    }
}
