package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.TestBase;
import org.testng.annotations.Test;

public class VisaConfirmationTest extends TestBase {

    DurationOfStayPage durationOfStayPage;
    FamilyImmigrationStatusPage familyImmigrationStatusPage;
    ReasonForTravelPage reasonForTravelPage;
    ResultPage resultPage;
    SelectNationalityPage selectNationalityPage;
    StartPage startPage;
    WorkTypePage workTypePage;

    @Test
    public void anAustralianComingToUKForTourism() throws InterruptedException {

        Thread.sleep(10000);
        startPage.acceptAddCookiesButton();
        startPage.pressStartNowButton();
        selectNationalityPage.selectCountryDropDown("Australia");
        selectNationalityPage.clickOnContinueButton();
        reasonForTravelPage.selectReasonForVisitTourism();
        reasonForTravelPage.clickContinueButton();
        resultPage.confirmResultMessageAustralia();

    }

    @Test
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths(){
        startPage.acceptAddCookiesButton();
        startPage.pressStartNowButton();
        selectNationalityPage.selectCountryDropDown("Chile");
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
        selectNationalityPage.selectCountryDropDown("Colombia");
        selectNationalityPage.clickOnContinueButton();
        reasonForTravelPage.selectReasonForVisitJoinPartner();
        reasonForTravelPage.clickContinueButton();
    }



}
