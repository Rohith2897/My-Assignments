package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement createnewaccount = driver.findElement(By.linkText("Create New Account"));
		
		createnewaccount.click();
		
		Thread.sleep(3000);
		
		WebElement daydropdown = driver.findElement(By.id("day"));
		
		Select day = new Select(daydropdown);
		day.selectByValue("5");
		
		WebElement monthdropdown = driver.findElement(By.id("month"));
		
		Select month = new Select(monthdropdown);
		month.selectByVisibleText("Jan");
		
		WebElement yeardropdown = driver.findElement(By.id("year"));
		
		Select year = new Select(yeardropdown);
		year.selectByIndex(22);
		
		
	}

}
