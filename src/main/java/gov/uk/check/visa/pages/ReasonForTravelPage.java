package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;


import java.util.logging.LogManager;

import static gov.uk.check.visa.driverfactory.ManageDriver.driver;

public class ReasonForTravelPage extends Utility {

    private static final Logger log = (Logger) LogManager.getLogManager().getLogger(ReasonForTravelPage.class.getName());
    public ReasonForTravelPage() {
        PageFactory.initElements(driver,this);
    }

    //next step button
    public void clickNextStepButton(){
        log.info("Next step button is pressed :");
    }

    // reason for visit list
     @FindBy(xpath = "//div[@class='govuk-radios']")
    WebElement visitReasonRadio;

    public void selectReasonForVisit(String reason) {
        log.info("Reason for visit dropdown :" + visitReasonRadio.toString());
        selectReasonForVisit(reason);
    }


}
