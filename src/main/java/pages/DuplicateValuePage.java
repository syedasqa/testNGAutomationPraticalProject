package pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DuplicateValuePage extends BasePage {
	
	
	public DuplicateValuePage(WebDriver driver){ 
		this.driver = driver;
	}

	public void duplicateCategory() {

		Random rnd = new Random();
		int num = rnd.nextInt(9999);
		String categoryName = "TestNG practical" + num;
		driver.findElement(By.name("categorydata")).sendKeys(categoryName);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("input[name='submit'][value='Add category']")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.name("categorydata")).sendKeys(categoryName);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("input[name='submit'][value='Add category']")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		Assert.assertTrue(checkTextExist("The category you want to add already exists: "),
				"Duplicate error message Not Found!!");

	}

}
