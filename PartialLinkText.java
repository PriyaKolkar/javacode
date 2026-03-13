package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		Thread.sleep(3000);
		WebElement CustomerLink=driver.findElement(By.partialLinkText("Customer"));
		CustomerLink.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//driver.close();
	}

}
