package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VisaConfirmationTest extends TestBase {

    DurationOfStayPage durationOfStayPage = new DurationOfStayPage();
    FamilyImmigrationStatusPage familyImmigrationStatusPage = new FamilyImmigrationStatusPage();
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
        selectNationalityPage.selectCountry("Australia");
        selectNationalityPage.clickOnContinueButton();
        reasonForTravelPage.selectReasonForVisitTourism();
        reasonForTravelPage.clickContinueButton();
        resultPage.confirmResultMessageAustralia();

    }

    @Test
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths(){

        System.out.println(startPage);
        startPage.acceptAddCookiesButton();
        startPage.pressStartNowButton();
        selectNationalityPage.selectCountry("Chile");
        selectNationalityPage.clickOnContinueButton();
        reasonForTravelPage.selectReasonForVisitWork();
        reasonForTravelPage.clickContinueButton();
        durationOfStayPage.selectSixMonthsMore();
        durationOfStayPage.clickNextStepButton();
        workTypePage.selectJobTypeHealthCare();
        workTypePage.pressContinueButton();
        resultPage.confirmResultMessageChile();
    }

    @Test
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(){
        startPage.acceptAddCookiesButton();
        startPage.pressStartNowButton();
        selectNationalityPage.selectCountry("Colombia");
        selectNationalityPage.clickOnContinueButton();
        reasonForTravelPage.selectReasonForVisitJoinPartner();
        reasonForTravelPage.clickContinueButton();
    }



}
