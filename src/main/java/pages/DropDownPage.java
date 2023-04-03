package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownPage {

	WebDriver driver;
	public DropDownPage(WebDriver driver) {
		this.driver = driver;
	}

	public void dropDownTest() {
		
		String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		for (int i = 0; i < 12; i = i + 1) {
			Assert.assertEquals(
					driver.findElement(By.xpath("//*[@id=\"extra\"]/select[3]/option[" + (i + 2) + "]")).getText(),
					months[i], months[i] + " Not Found!");
			System.out.println(driver.findElement(By.xpath("//*[@id=\"extra\"]/select[3]/option[" + (i + 2) + "]")).getText());
		}
	}
}
