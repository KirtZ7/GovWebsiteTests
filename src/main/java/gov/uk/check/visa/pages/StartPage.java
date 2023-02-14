package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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
    @FindBy(xpath = "//div[@class='govuk-button-group']/button")
    WebElement acceptAddCookies;

    public void acceptAddCookiesButton(){

        clickOnElement(acceptAddCookies);

    }

    //////////////////////////////////////////////////////////////////////////////////////
    // Select Nationality Page

    //country Drop down box
    @FindBy(xpath = "//select[@id='response']")
    WebElement countryDropdown;

    //Press Continue
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;


    public void chooseCountryDropdown(String Country){
        selectByVisibleTextFromDropDown(countryDropdown, Country);
    }


    public void pressContinueButton(){
        clickOnElement(continueButton);
    }

    //////////////////////////////////////////////////////////////////////////////////////
    //Reason for travel page

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
        clickOnElement(visitReasonWork);

    }
    @FindBy(xpath = "//input[@id='response-2']")
    WebElement visitReasonStudy;

    public void selectReasonForVisitStudy() {
        clickOnElement(visitReasonStudy);

    }
    @FindBy(xpath = "//input[@id='response-3']")
    WebElement visitReasonTransit;

    public void selectReasonForTransit() {
        clickOnElement(visitReasonTransit);

    }
    @FindBy(xpath = "//input[@id='response-4']")
    WebElement visitReasonJoinPartner;

    public void selectReasonForVisitJoinPartner() {
        clickOnElement(visitReasonJoinPartner);

    }

    @FindBy(xpath = "//input[@id='response-5']")
    WebElement visitReasonGetMarried;

    public void  selectVisitReasonGetMarried (){
        clickOnElement(visitReasonGetMarried);
    }


    @FindBy(xpath = "//input[@id='response-6']")
    WebElement visitReasonStayWithChild;

    public void  selectVisitReasonStayWithChild (){
        clickOnElement(visitReasonStayWithChild);
    }
    @FindBy(xpath = "//input[@id='response-7']")
    WebElement visitReasonMedical;

    public void  selectVisitReasonMedical (){
        clickOnElement(visitReasonMedical);
    }
    @FindBy(xpath = "//input[@id='response-8']")
    WebElement visitReasonDiplomat;

    public void  selectVisitReasonDiplomat (){
        //log.info("Reason for visit radio :"+ visitReasonDiplomat.toString());
        clickOnElement(visitReasonDiplomat);
    }

    ////////////////////////////////////////////////////////////////////////////
    //Duration of stay page



    //less than six months
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement sixMonthsMore;

    public void selectSixMonthsMore(){
        clickOnElement(sixMonthsMore);

    }

    // more than six months
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement sixMonthsLess;

    public void selectSixMonthsLess(){
        //log.info("Length of stay button is clicked "+sixMonthsLess.toString());
        clickOnElement(sixMonthsLess);

    }


    //////////////////////////////////////////////////////////////////////////////////////
    //Work type page
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

    //////////////////////////////////////////////////////////////////////////////////////
    //results page

    //results for australia
    @FindBy(xpath = "//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")
    WebElement resultMessageAus;

    @FindBy(xpath = "//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")
    WebElement resultMessageChile;

    @FindBy(xpath = "//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")
    WebElement resultMessageColombia;


    public void confirmResultMessageAustralia(){
        String actualMessage = getTextFromElement(resultMessageAus);
        String expectedMessage = "You will not need a visa to come to the UK";
        Assert.assertEquals(actualMessage,expectedMessage);

    }

    //results for Chile
    public void confirmResultMessageChile(){
        String actualMessage = getTextFromElement(resultMessageChile);
        String expectedMessage = "You need a visa to work in health and care";
        Assert.assertEquals(actualMessage,expectedMessage);

    }

    //result for colombia
    public void confirmResultsMessageColombia(){
        String actualMessage = getTextFromElement(resultMessageColombia);
        String expectedMessage = "You may need a visa";
        Assert.assertEquals(actualMessage,expectedMessage);
    }

}
