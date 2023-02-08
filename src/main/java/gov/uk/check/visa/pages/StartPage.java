package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class StartPage extends Utility {
    private static final Logger log = LogManager.getLogManager().getLogger(StartPage.class.getName());

    public StartPage(){
        PageFactory.initElements(driver,this);
    }

    //Start Now Button
    @FindBy(xpath = "//a[@class=\"gem-c-button govuk-button govuk-button--start\"]")
    WebElement startNowButton;

    public void pressStartNowButton(){
        log.info("Start now button is pressed :" + startNowButton.toString());
        clickOnElement(startNowButton);
    }

    //Accept cookies
    @FindBy(xpath = "//button[@class='gem-c-button govuk-button']")
    WebElement acceptAddCookies;

    public void acceptAddCookiesButton(){
        log.info("Accept additional cookies button is pressed :" +acceptAddCookies.toString());
        clickOnElement(acceptAddCookies);
    }

}
