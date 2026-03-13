package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickGmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
WebElement gmail=		driver.findElement(By.xpath("//a[@class='gb_Z']"));
Actions a1= new Actions(driver);
a1.contextClick(gmail).perform();
		
	}

}
