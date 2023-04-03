package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

	

public class BasePage {
	
	protected WebDriver driver;
	
	public boolean checkExactTextExist(String text) {
		try {			
			driver.findElement(By.xpath("//*[text()='" + text + "']"));
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	public  boolean checkTextExist(String text) {
		try {
			driver.findElement(By.xpath("//*[contains(text(),'" + text + "')]"));
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

}
