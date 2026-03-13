package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		WebElement search=driver.findElement(By.className("gLFyf"));
		search.sendKeys("India");
		
	}

}
