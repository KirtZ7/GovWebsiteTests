package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import static gov.uk.check.visa.driverfactory.ManageDriver.driver;


public class FamilyImmigrationStatusPage extends Utility {

    private static final Logger log = org.apache.log4j.LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());

    public FamilyImmigrationStatusPage(){
        PageFactory.initElements(driver,this);
    }

    //next Step Button

    public void selectImmigrationStatus(String status){

    }

}
