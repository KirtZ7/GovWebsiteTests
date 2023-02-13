package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;
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
    @FindBy(xpath = "//article[@role='article']/section/a")
    WebElement startNowButton;

    public void pressStartNowButton(){
        clickOnElement(startNowButton);
    }

    //Accept cookies
    //By acceptAddCookies=By.xpath("//button[@class='gem-c-button govuk-button']");
    @FindBy(xpath = "//div[@class='govuk-button-group']/button")
    WebElement acceptAddCookies;

    public void acceptAddCookiesButton(){

        clickOnElement(acceptAddCookies);

    }

}
