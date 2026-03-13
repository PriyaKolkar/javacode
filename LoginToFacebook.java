package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToFacebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver= new ChromeDriver();
driver.get("https://www.facebook.com/");
Thread.sleep(3000);
WebElement Email= driver.findElement(By.id("email"));
Email.sendKeys("prkolkar@gmail.com");
WebElement Password= driver.findElement(By.name("pass"));
Password.sendKeys("esic4444");
WebElement Login= driver.findElement(By.name("login"));
Login.click();
		


	}

}
