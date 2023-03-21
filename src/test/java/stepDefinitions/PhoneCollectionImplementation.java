package stepDefinitions;

import io.cucumber.java.en.And;
import pages.PhoneCollectionPage;

/**
 * @author Ismail Koembe
 */
public class PhoneCollectionImplementation {
    public PhoneCollectionPage phoneCollectionPage = new PhoneCollectionPage();

    @And("I skip phone collection")
    public void iSkipPhoneCollection() {
        phoneCollectionPage.waitAndClick(phoneCollectionPage.skip);
    }
}
