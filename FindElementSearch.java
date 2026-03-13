package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		WebElement button=driver.findElement(By.className("a-button-text"));
		button.click();
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("kurta");
		WebElement searchbutton= driver.findElement(By.id("nav-search-submit-button"));
		searchbutton.click();
	
		
	}

}
