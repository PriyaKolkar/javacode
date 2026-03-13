package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		WebElement CustomerLink=driver.findElement(By.linkText("Customer Service"));
		CustomerLink.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
	}

}
