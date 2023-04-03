package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.DropDownPage;
import util.BrowserFactory;

public class DropdownTest extends BrowserFactory{
	
	
	@Test
	public void dropDownTest(){
		
		DropDownPage dropDownPage = PageFactory.initElements(driver, DropDownPage.class);
		dropDownPage.dropDownTest();
		
	}

}
