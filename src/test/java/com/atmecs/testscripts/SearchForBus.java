package com.atmecs.testscripts;

import java.util.Properties;
import org.testng.annotations.Test;
import com.atmecs.constants.ConstantsFilePaths;
import com.atmecs.logReports.LogReports;
import com.atmecs.pages.PageActions;
import com.atmecs.testbase.TestBase;
import com.atmecs.utils.ReadLocators;

public class SearchForBus extends TestBase {
	LogReports log = new LogReports();
	Properties properties;
	// WebDriver driver;
	String xpath;
	String sendKeys;

	@Test(priority = 1)
	public void searching_Bus() throws Exception {
	
		properties = ReadLocators.loadProperty(ConstantsFilePaths.LOCATORS_FILE);
		PageActions.clickOnElement(driver, properties.getProperty("loc.click.leaveFrom"));
		Thread.sleep(3000);
		PageActions.sendKeys(driver, properties.getProperty("loc.click.leaveFrom"), "Hyderabad");
		Thread.sleep(3000);
		PageActions.performActionEnter(driver, properties.getProperty("loc.click.leaveFrom"));
		PageActions.clickOnElement(driver, properties.getProperty("loc.click.goingTo"));
		Thread.sleep(3000);
		PageActions.sendKeys(driver, properties.getProperty("loc.click.goingTo"), "Bangalore");
		Thread.sleep(3000);
		PageActions.performActionEnter(driver, properties.getProperty("loc.click.goingTo"));
		PageActions.clickOnElement(driver, properties.getProperty("loc.click.dateOfJourney"));
		PageActions.clickOnElement(driver, properties.getProperty("loc.select.date"));
		PageActions.clickOnElement(driver, properties.getProperty("loc.click.searchBuses"));
	}
}
