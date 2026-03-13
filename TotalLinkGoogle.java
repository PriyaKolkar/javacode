package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinkGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver= new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
List<WebElement> totalLink=driver.findElements(By.tagName("a"));
int count= totalLink.size();
System.out.println(" total links present in the page--->"     +count);
driver.close();
	}

}
