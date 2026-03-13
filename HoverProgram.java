package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
		Thread.sleep(3000);
	WebElement hover=	driver.findElement(By.xpath("//div[@id='nav-link-accountList']"));
	Actions a1= new Actions(driver);
	a1.moveToElement(hover).perform();
	Thread.sleep(2000);
	
	WebElement Sign =driver.findElement(By.xpath("//a[@class='nav-action-signin-button']/span[text()='Sign in']"));
	Sign.click();
	
	}

}
