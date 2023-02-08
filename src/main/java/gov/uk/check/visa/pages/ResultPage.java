package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogManager().getLogger(ResultPage.class.getName());


    public ResultPage(){
        PageFactory.initElements(driver, this);
    }

    //results for australia
    @FindBy(xpath = "//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")
    WebElement resultMessage;


    public void confirmResultMessageAustralia(){
        log.info("Confirmed Results message :" +resultMessage.toString());
        String actualMessage = getTextFromElement(resultMessage);
        String expectedMessage = "You will not need a visa to come to the UK";
        Assert.assertEquals(actualMessage,expectedMessage);

    }

    //results for Chile
    public void confirmResultMessageChile(){
        log.info("Confirmed Results message :" +resultMessage.toString());
        String actualMessage = getTextFromElement(resultMessage);
        String expectedMessage = "You need a visa to work in health and care";
        Assert.assertEquals(actualMessage,expectedMessage);

    }

    //result for colombia
    public void confirmResultsMessageColombia(){
        log.info("Comfirmed results emssage: " + resultMessage.toString());
        String actualMessage = getTextFromElement(resultMessage);
        String expectedMessage = "You may need a visa";
        Assert.assertEquals(actualMessage,expectedMessage);
    }

}
