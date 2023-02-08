package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.LogManager;
import java.util.logging.Logger;

import static gov.uk.check.visa.driverfactory.ManageDriver.driver;

public class WorkTypePage extends Utility {

    private static final Logger log = LogManager.getLogManager().getLogger(WorkTypePage.class.getName());

    public WorkTypePage(){
        PageFactory.initElements(driver,this);
    }

    //next step button
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;

    public void pressContinueButton (){
        log.info("Continue Button is pressed :"+ continueButton.toString());
        clickOnElement(continueButton);
    }

    //select Job type list
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement healthCare;

    public void selectJobTypeHealthCare (){
        clickOnElement(healthCare);
    }

    @FindBy(xpath = "//input[@id='response-1']")
    WebElement digitalTech;

    public void selectJobTypeDigitalTech (){
        clickOnElement(digitalTech);
    }

    @FindBy(xpath = "//input[@id='response-2']")
    WebElement academicOrResearcher;

    public void selectJobTypeAcademicOrResearcher (){
        clickOnElement(academicOrResearcher);
    }

    @FindBy(xpath = "//input[@id='response-3']")
    WebElement artOrCulture;

    public void selectJobTypeArtOrCulture (){
        clickOnElement(artOrCulture);
    }

    @FindBy(xpath = "//input[@id='response-4']")
    WebElement sportsPerson;

    public void selectJobTypeSportsPerson (){
        clickOnElement(sportsPerson);
    }

    @FindBy(xpath = "//input[@id='response-5']")
    WebElement religiousWorker;

    public void selectJobTypeReligiousWorker (){
        clickOnElement(religiousWorker);
    }

    @FindBy(xpath = "//input[@id='response-6']")
    WebElement startBusiness;

    public void selectJobTypeStartBusiness (){
        clickOnElement(startBusiness);
    }

    @FindBy(xpath = "//input[@id='response-7']")
    WebElement anotherTypeOfJob;

    public void selectJobTypeAnotherTypeOfJob (){
        clickOnElement(anotherTypeOfJob);
    }

}
