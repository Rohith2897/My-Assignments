package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		WebElement usrnme =	driver.findElement(By.xpath("//input[@id='username']"));
		
		WebElement pswd =	driver.findElement(By.xpath("//input[@id='password']"));
		
		WebElement loginbutton = driver.findElement(By.className("decorativeSubmit"));
		
	//	WebElement loginbutton1 = driver.findElement(By.xpath("//*[@id=\"login\"]/p[3]/input"));
	
		usrnme.sendKeys("Demosalesmanager");
		pswd.sendKeys("crmsfa");
		loginbutton.click();
	//	Thread.sleep(3000);
		
		
		
		
		
	//	WebElement logoutbutton = driver.findElement(By.xpath("//*[@id=\"logout\"]/input"));
	//	logoutbutton.click();
	//	loginbutton1.click();
		
		
	}

}
