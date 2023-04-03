package pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddCategoryPage extends BasePage {

	public AddCategoryPage(WebDriver driver) {
		this.driver = driver;
	}

	public void addCategory() {
		Random rnd = new Random();
		int num = rnd.nextInt(9999);

		String categoryName = "TestNG practical" + num;
		driver.findElement(By.name("categorydata")).sendKeys(categoryName);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("input[name='submit'][value='Add category']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		Assert.assertTrue(checkExactTextExist(categoryName), "Category Not Found!!");
	}
}
