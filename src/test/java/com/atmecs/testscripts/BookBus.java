package com.atmecs.testscripts;

import org.testng.annotations.Test;
import com.atmecs.pages.PageActions;

public class BookBus extends SearchForBus {
	@Test(priority = 2)
	public void selecting_Bus() throws Exception {
		/*
		 * Selecting bustype, no.of passengers Selecting one bus as per requirements
		 */
		PageActions.clickOnElement(driver, properties.getProperty("loc.bttn.AC"));
		PageActions.clickOnElement(driver, properties.getProperty("loc.bttn.sleeper"));
		PageActions.clickOnElement(driver, properties.getProperty("loc.select.BusName"));
		PageActions.clickOnElement(driver, properties.getProperty("loc.select.firstSeat"));
		PageActions.clickOnElement(driver, properties.getProperty("loc.select.secondSeat"));
		PageActions.clickOnElement(driver, properties.getProperty("loc.select.thirdSeat"));
		PageActions.clickOnElement(driver, properties.getProperty("loc.select.bordingPoint"));
		PageActions.clickOnElement(driver, properties.getProperty("loc.select.dropingPoint"));
		PageActions.clickOnElement(driver, properties.getProperty("loc.click.continuePayment"));
	}
}
