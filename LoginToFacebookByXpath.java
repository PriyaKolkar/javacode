package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToFacebookByXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement Email= driver.findElement(By.xpath("//input[@name='email']"));
		Email.sendKeys("prkolkar@gmail.com");
		WebElement Password= driver.findElement(By.xpath("//input[@name='pass']"));
		Password.sendKeys("esic4444");
		WebElement Login= driver.findElement(By.xpath("//button[@name='login']"));
		Login.click();
	}


	}


