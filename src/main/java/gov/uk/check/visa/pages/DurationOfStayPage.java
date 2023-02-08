package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static gov.uk.check.visa.driverfactory.ManageDriver.driver;

public class DurationOfStayPage extends Utility {

    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());

    public DurationOfStayPage(){
        PageFactory.initElements(driver,this);
    }

    //next step button

    //less than six months
    @FindBy(xpath = "//div[@class='govuk-radios']//div[1]")
    WebElement sixMonthsMore;

    // more than six months
    @FindBy(xpath = "//div[@class='govuk-radios']//div[2]")
    WebElement sixMonthsLess;

    public void selectSixMonthsMore(String moreOrLess){
        log.info("Length of stay button is clicked "+sixMonthsMore.toString());
        clickOnElement(sixMonthsMore);

    }

    public void selectSixMonthsLess(String moreOrLess){
        log.info("Length of stay button is clicked "+sixMonthsLess.toString());
        clickOnElement(sixMonthsLess);

    }

    public void clickNextStepButton(){

    }

}
