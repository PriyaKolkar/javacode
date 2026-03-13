package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrrenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("shoe" +Keys.ENTER);
		Thread.sleep(2000);
	List<WebElement>a1=	driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
	a1.get(1).click();
	Thread.sleep(2000);
	//driver.close();
	
	Set<String> id=driver.getWindowHandles();
	System.out.println(id);
	Iterator<String> s=id.iterator();
	String parentid=s.next();
	String childid=s.next();
	driver.switchTo().window(childid);
	
WebElement addTocart=	driver.findElement(By.id("add-to-cart-button"));
	addTocart.click();
	TakesScreenshot ts=driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\Me\\eclipse-workspace\\Javacode\\screenshot\\one.png");
	FileHandler.copy(source, destination);
	}

}
