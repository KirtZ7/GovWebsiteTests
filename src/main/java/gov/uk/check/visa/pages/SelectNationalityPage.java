package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.logging.LogManager;
import java.util.logging.Logger;

import static gov.uk.check.visa.driverfactory.ManageDriver.driver;

public class SelectNationalityPage extends Utility {

    private static final Logger log = LogManager.getLogManager().getLogger(SelectNationalityPage.class.getName());

    public SelectNationalityPage(){
        PageFactory.initElements(driver,this);
    }

    // Continue button
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;

    public void clickOnContinueButton(){
        log.info("Continue button is pressed: "+ continueButton.toString());
        clickOnElement(continueButton);
    }

    // Country dropdown select
    @FindBy(xpath ="//button[contains(text(),'Continue')]")
    WebElement countryDropDown;

    public void selectCountryDropDown(String country){
        log.info("Dropdown has been selected :" + countryDropDown.toString());
        clickOnElement(countryDropDown);
        selectByVisibleTextFromDropDown(countryDropDown,country);
    }





}
