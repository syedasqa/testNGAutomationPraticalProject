package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.DuplicateValuePage;
import util.BrowserFactory;

public class DuplicateCategoryValueTest extends BrowserFactory{
	
	@Test

	public void duplicateCategoryValueTest() {
		DuplicateValuePage duplicateValuePage = PageFactory.initElements(driver, DuplicateValuePage.class );
		duplicateValuePage.duplicateCategory();
	}
}
