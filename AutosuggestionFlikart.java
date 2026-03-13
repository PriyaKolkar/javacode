package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestionFlikart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver= new ChromeDriver();
driver.get("https://www.flipkart.com/");
Thread.sleep(2000);
//WebElement close=driver.findElement(By.xpath("//span[@calss='b3wTlE']"));
//close.click();
WebElement searchbox=driver.findElement(By.name("q"));
searchbox.sendKeys("mobile");
Thread.sleep(2000);
List<WebElement> list=driver.findElements(By.xpath("//form/ui/li"));
Thread.sleep(2000);
list.get(5).click();



	}

}
