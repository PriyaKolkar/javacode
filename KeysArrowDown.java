package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysArrowDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("kurta");
		Thread.sleep(3000);
		searchbox.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		searchbox.sendKeys(Keys.ARROW_DOWN);
		searchbox.sendKeys(Keys.ENTER);
		
	}

}
