package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver= new ChromeDriver();
driver.get("https://grotechminds.com/registeration-form/");
driver.manage().window().maximize();
WebElement fname=driver.findElement(By.id("firstName"));
fname.sendKeys("priya");
Thread.sleep(2000);

Actions a1= new Actions(driver);
a1.doubleClick(fname).perform();

fname.sendKeys(Keys.CONTROL+"c");
WebElement lname=driver.findElement(By.id("lastName"));
lname.sendKeys(Keys.CONTROL+"v");



	}

}
