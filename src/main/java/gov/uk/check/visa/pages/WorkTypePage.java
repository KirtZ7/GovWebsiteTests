package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.LogManager;
import java.util.logging.Logger;

import static gov.uk.check.visa.driverfactory.ManageDriver.driver;

public class WorkTypePage extends Utility {

    private static final Logger log = LogManager.getLogManager().getLogger(WorkTypePage.class.getName());

    public WorkTypePage(){
        PageFactory.initElements(driver,this);
    }

    //next step button


    //select Job type list

    //method
     public void selectJobType(String Job){


     }
}
