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

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;

    public void clickContinueButton(){
        //log.info("Next step button is pressed :");
        clickOnElement(continueButton);
    }

    // reason for visit list
     @FindBy(xpath = "//input[@id='response-0']")
    WebElement visitReasonTourism;

    public void selectReasonForVisitTourism() {
        //log.info("Reason for visit dropdown :" + visitReasonTourism.toString());
        clickOnElement(visitReasonTourism);

    }
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement visitReasonWork;

    public void selectReasonForVisitWork() {
        //log.info("Reason for visit dropdown :" + visitReasonWork.toString());
        clickOnElement(visitReasonWork);

    }
    @FindBy(xpath = "//input[@id='response-2']")
    WebElement visitReasonStudy;

    public void selectReasonForVisitStudy() {
        //log.info("Reason for visit dropdown :" + visitReasonStudy.toString());
        clickOnElement(visitReasonStudy);

    }
    @FindBy(xpath = "//input[@id='response-3']")
    WebElement visitReasonTransit;

    public void selectReasonForTransit() {
        //log.info("Reason for visit dropdown :" + visitReasonTransit.toString());
        clickOnElement(visitReasonTransit);

    }
    @FindBy(xpath = "//input[@id='response-4']")
    WebElement visitReasonJoinPartner;

    public void selectReasonForVisitJoinPartner() {
        //log.info("Reason for visit dropdown :" + visitReasonJoinPartner.toString());
        clickOnElement(visitReasonJoinPartner);

    }

    @FindBy(xpath = "//input[@id='response-5']")
    WebElement visitReasonGetMarried;

    public void  selectVisitReasonGetMarried (){
        //log.info("Reason for visit radio :"+ visitReasonGetMarried.toString());
        clickOnElement(visitReasonGetMarried);
    }


    @FindBy(xpath = "//input[@id='response-6']")
    WebElement visitReasonStayWithChild;

    public void  selectVisitReasonStayWithChild (){
        //log.info("Reason for visit radio :"+ visitReasonStayWithChild.toString());
        clickOnElement(visitReasonStayWithChild);
    }
    @FindBy(xpath = "//input[@id='response-7']")
    WebElement visitReasonMedical;

    public void  selectVisitReasonMedical (){
        //log.info("Reason for visit radio :"+ visitReasonMedical.toString());
        clickOnElement(visitReasonMedical);
    }
    @FindBy(xpath = "//input[@id='response-8']")
    WebElement visitReasonDiplomat;

    public void  selectVisitReasonDiplomat (){
        //log.info("Reason for visit radio :"+ visitReasonDiplomat.toString());
        clickOnElement(visitReasonDiplomat);
    }




}
