package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.AddCategoryPage;
import util.BrowserFactory;

public class AddCategoryTest extends BrowserFactory{

	@Test
	public void addCategoryTest() throws InterruptedException {
		AddCategoryPage addCategoryPage = PageFactory.initElements(driver, AddCategoryPage.class);
		
		addCategoryPage.addCategory();

	}
}