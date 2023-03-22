package stepDefinitions;

import io.cucumber.java.en.And;
import lombok.extern.slf4j.Slf4j;
import pages.PhoneCollectionPage;

/**
 * @author Ismail Koembe
 */
@Slf4j
public class PhoneCollectionImplementation {
    public PhoneCollectionPage phoneCollectionPage = new PhoneCollectionPage();

    @And("I skip phone collection")
    public void iSkipPhoneCollection() {
        try {
            phoneCollectionPage.waitAndClick(phoneCollectionPage.skip);
        }catch (Exception e){
            log.info("Phone collection page didn't appear");
        }finally {
            log.info("Here is finally block");
        }

    }
}
