package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionGoogle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		WebElement search=driver.findElement(By.tagName("textarea"));
		search.sendKeys("Modi");
		Thread.sleep(2000);
List<WebElement>list=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
int count=list.size();
System.out.println(count);
list.get(2).click()	;
	
	}

}
