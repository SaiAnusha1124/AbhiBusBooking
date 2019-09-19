package com.atmecs.testscripts;

import org.openqa.selenium.Keys;
import com.atmecs.utils.ExcelRead;

public class TravellerDetails extends BookBus
{
	String[][] userdata = ExcelRead.getData(".\\src\\test\\resources\\testdata\\inputs-yatrabusbooking.xlsx");
	String phoneNo = userdata[1][2].replace(".", "").replace("E9", "");

	try
	{
		Thread.sleep(6000);
	}
	catch(
	InterruptedException e)
	{
		e.printStackTrace();
	}

	ValidateTime.validatingstartingTime();
	ValidateTime.validatingendingTime();
	ValidateBusDetails.validatingBordingPoint();
	ValidateBusDetails.validatingBordingPointAddress();
	PageActions.clickOnElement(driver,properties.getProperty("clickEmailAddress"));PageActions.sendKeys(driver,properties.getProperty("clickEmailAddress"),userdata[1][1]);PageActions.sendKeys(Keys.ENTER);PageActions.clickOnElement(driver,properties.getProperty("enterPhoneNumber"));PageActions.sendKeys(driver,properties.getProperty("enterPhoneNumber"),phoneNo);PageActions.sendKeys(Keys.ENTER);og.info("Entered email and phoneno for corfirmation");PageActions.clickOnElement(driver,properties.getProperty("clickBookasGuest"));
}}
