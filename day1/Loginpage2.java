package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		WebElement usrnme = driver.findElement(By.id("username"));
		
		WebElement pswd = driver.findElement(By.id("password"));
		
		WebElement loginbutton = driver.findElement(By.id("Login"));
		
		usrnme.sendKeys("hari.radhakrishnan@qeagle.com");
		pswd.sendKeys("Testleaf$321");
		loginbutton.click();
	}

}
