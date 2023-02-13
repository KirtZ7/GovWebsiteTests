package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;
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
    //By acceptAddCookies=By.xpath("//button[@class='gem-c-button govuk-button']");
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
    WebElement continueCountryButton;


    public void chooseCountryDropdown(String Country){
        selectByVisibleTextFromDropDown(countryDropdown, Country);
    }


    public void pressContinueButton(){
        clickOnElement(continueCountryButton);
    }

    //////////////////////////////////////////////////////////////////////////////////////
    //Reason for travel page

    //next step button
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueReasonButton;

    public void clickContinueButton(){
        //log.info("Next step button is pressed :");
        clickOnElement(continueReasonButton);
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

    ////////////////////////////////////////////////////////////////////////////
    //Duration of stay page



    //less than six months
    @FindBy(xpath = "//div[@class='govuk-radios']//div[1]")
    WebElement sixMonthsMore;

    public void selectSixMonthsMore(){
        log.info("Length of stay button is clicked "+sixMonthsMore.toString());
        clickOnElement(sixMonthsMore);

    }

    // more than six months
    @FindBy(xpath = "//div[@class='govuk-radios']//div[2]")
    WebElement sixMonthsLess;

    public void selectSixMonthsLess(){
        //log.info("Length of stay button is clicked "+sixMonthsLess.toString());
        clickOnElement(sixMonthsLess);

    }


    //continue button
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;
    public void clickNextStepButton(){
        //log.info("Next step button being pressed :" +nextStepButton.toString());
        clickOnElement(nextStepButton);
    }

    //////////////////////////////////////////////////////////////////////////////////////
    //results page

    //results for australia
    @FindBy(xpath = "//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")
    WebElement resultMessage;


    public void confirmResultMessageAustralia(){
        String actualMessage = getTextFromElement(resultMessage);
        String expectedMessage = "You will not need a visa to come to the UK";
        Assert.assertEquals(actualMessage,expectedMessage);

    }

    //results for Chile
    public void confirmResultMessageChile(){
        String actualMessage = getTextFromElement(resultMessage);
        String expectedMessage = "You need a visa to work in health and care";
        Assert.assertEquals(actualMessage,expectedMessage);

    }

    //result for colombia
    public void confirmResultsMessageColombia(){
        String actualMessage = getTextFromElement(resultMessage);
        String expectedMessage = "You may need a visa";
        Assert.assertEquals(actualMessage,expectedMessage);
    }

}
