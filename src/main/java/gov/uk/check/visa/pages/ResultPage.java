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

    @FindBy(xpath = "//h1[@class='govuk-fieldset__heading gem-c-radio__heading-text']")
    WebElement resultMessage;

    public String getResultMessage (){
        log.info("Results message :" + resultMessage.toString());
        getTextFromElement(resultMessage);
        return getTextFromElement(resultMessage);
    }

    public void confirmResultMessage(String expectedMessage){
        log.info("Confirmed Results message :" +resultMessage.toString());
        String actualMessage = "What are you coming to the UK to do?";
        Assert.assertEquals(actualMessage,expectedMessage);

    }


}
