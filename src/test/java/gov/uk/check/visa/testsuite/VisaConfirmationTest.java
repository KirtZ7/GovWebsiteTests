package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VisaConfirmationTest extends TestBase {

    DurationOfStayPage durationOfStayPage = new DurationOfStayPage();
    ReasonForTravelPage reasonForTravelPage = new ReasonForTravelPage();
    ResultPage resultPage = new ResultPage();
    SelectNationalityPage selectNationalityPage = new SelectNationalityPage();
    StartPage startPage = new StartPage();
    WorkTypePage workTypePage = new WorkTypePage();


    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        startPage = new StartPage();
    }
    @Test
    public void anAustralianComingToUKForTourism() throws InterruptedException {

        startPage.acceptAddCookiesButton();
        startPage.pressStartNowButton();
        startPage.chooseCountryDropdown("Australia");
        startPage.pressContinueButton();
        startPage.selectReasonForVisitTourism();
        startPage.clickContinueButton();
        startPage.confirmResultMessageAustralia();

    }

    @Test
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths(){

        startPage.acceptAddCookiesButton();
        startPage.pressStartNowButton();
        startPage.chooseCountryDropdown("Chile");
        startPage.pressContinueButton();
        startPage.selectReasonForVisitWork();
        startPage.clickContinueButton();
        startPage.selectSixMonthsMore();
        startPage.clickNextStepButton();
        workTypePage.selectJobTypeHealthCare();
        workTypePage.pressContinueButton();
        startPage.confirmResultMessageChile();
    }

    @Test
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(){
        startPage.acceptAddCookiesButton();
        startPage.pressStartNowButton();
        startPage.chooseCountryDropdown("Colombia");
        startPage.pressContinueButton();
        startPage.selectReasonForVisitJoinPartner();
        startPage.clickContinueButton();
        startPage.confirmResultsMessageColombia();
    }



}
