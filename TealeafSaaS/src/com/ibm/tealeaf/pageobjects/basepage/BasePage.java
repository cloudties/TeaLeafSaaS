package com.ibm.tealeaf.pageobjects.basepage;

import org.openqa.selenium.WebDriver;

public class BasePage {
	protected WebDriver driver;
	public BasePage()
	{
		
	}
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
}
