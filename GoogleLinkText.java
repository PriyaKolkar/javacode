package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		String title= driver.getTitle();
		System.out.println(title);
		WebElement LinkText= driver.findElement(By.linkText("About"));
		//LinkText.click();
		LinkText.sendKeys(Keys.ENTER);
		
		
	}

}
