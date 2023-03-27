package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import pages.RatPage;

/**
 * @author Ismail Koembe
 */
public class RatImplementation {
    public static RatPage ratPage = new RatPage();
    public static HomePage home = new HomePage();

    @And("I wait {string} sec")
    public void iWaitSec(String duration) {

        try {
            Thread.sleep(Long.parseLong(duration));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @And("I click Real Age Test button")
    public void iClickRealAgeTestButton() {
        System.out.println("I tried to click element");
        ratPage.waitAndClick(home.takeRatButton);

    }

    @When("I take Real Age Test")
    public void iTakeRealAgeTest() {
        Assert.assertEquals(ratPage.driver.getCurrentUrl(), "https://you.sharecare.com/you/real-age-test",
                "I can not see RAT que");
        ratPage.takeRealAgeTest();

    }

    @Then("I should be able to see my result")
    public void iShouldBeAbleToSeeMyResult() {
    }
}
