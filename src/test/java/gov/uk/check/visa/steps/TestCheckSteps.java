package gov.uk.check.visa.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.uk.check.visa.pages.StartPage;

public class TestCheckSteps {
    @Given("^I am on the start page$")
    public void iAmOnTheStartPage() {
    }

    @When("^I click on the accept cookies button$")
    public void iClickOnTheAcceptCookiesButton() {
        new StartPage().acceptAddCookiesButton();
    }

    @And("^I press on the start now button$")
    public void iPressOnTheStartNowButton() {
        new StartPage().pressStartNowButton();
    }

    @And("^I choose Australia as my country$")
    public void iChooseAustraliaAsMyCountry() {
        new StartPage().chooseCountryDropdown("Australia");
    }

    @And("^I press on the continue button$")
    public void iPressOnTheContinueButton() {
        new StartPage().pressContinueButton();
    }

    @And("^I choose the reason for my visit as tourism$")
    public void iChooseTheReasonForMyVisitAsTourism() {
        new StartPage().selectReasonForVisitTourism();
    }

    @Then("^I confirm the results of my choices as an australian$")
    public void iConfirmTheResultsOfMyChoicesAsAnAustralian() {
        new StartPage().confirmResultMessageAustralia();
    }

    @And("^I choose Chile as my country$")
    public void iChooseChileAsMyCountry() {
        new StartPage().chooseCountryDropdown("Chile");
    }

    @And("^I choose the reason for my visit as Work$")
    public void iChooseTheReasonForMyVisitAsWork() {
        new StartPage().selectReasonForVisitWork();
    }

    @And("^I select to stay for six months or more$")
    public void iSelectToStayForSixMonthsOrMore() {
        new StartPage().selectSixMonthsMore();
    }

    @And("^I select my job type as health care$")
    public void iSelectMyJobTypeAsHealthCare() {
        new StartPage().selectJobTypeHealthCare();
    }

    @Then("^I confirm the results of my choices as a chiliean$")
    public void iConfirmTheResultsOfMyChoicesAsAChiliean() {
        new StartPage().confirmResultMessageChile();
    }

    @And("^I choose Colombia as my country$")
    public void iChooseColombiaAsMyCountry() {
        new StartPage().chooseCountryDropdown("Colombia");
    }

    @And("^I choose reason for my visit as join partner$")
    public void iChooseReasonForMyVisitAsJoinPartner() {
        new StartPage().selectReasonForVisitJoinPartner();
    }

    @Then("^i confirm the results of my choices as an colombian$")
    public void iConfirmTheResultsOfMyChoicesAsAnColombian() {
        new StartPage().confirmResultsMessageColombia();
    }
}
