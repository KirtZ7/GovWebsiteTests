package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VisaConfirmationTest extends TestBase {

    StartPage startPage = new StartPage();

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        startPage = new StartPage();
    }
    @Test
    public void anAustralianComingToUKForTourism() {

        startPage.acceptAddCookiesButton();
        startPage.pressStartNowButton();
        startPage.chooseCountryDropdown("Australia");
        startPage.pressContinueButton();
        startPage.selectReasonForVisitTourism();
        startPage.pressContinueButton();
        startPage.confirmResultMessageAustralia();

    }

    @Test
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths(){

        startPage.acceptAddCookiesButton();
        startPage.pressStartNowButton();
        startPage.chooseCountryDropdown("Chile");
        startPage.pressContinueButton();
        startPage.selectReasonForVisitWork();
        startPage.pressContinueButton();
        startPage.selectSixMonthsMore();
        startPage.pressContinueButton();
        startPage.selectJobTypeHealthCare();
        startPage.pressContinueButton();
        startPage.confirmResultMessageChile();
    }

    @Test
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(){
        startPage.acceptAddCookiesButton();
        startPage.pressStartNowButton();
        startPage.chooseCountryDropdown("Colombia");
        startPage.pressContinueButton();
        startPage.selectReasonForVisitJoinPartner();
        startPage.pressContinueButton();
        startPage.confirmResultsMessageColombia();
    }



}
