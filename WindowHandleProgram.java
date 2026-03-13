package Selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleProgram {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
WebElement search=	driver.findElement(By.id("twotabsearchtextbox"));
search.sendKeys("shoe" +Keys.ENTER);
Thread.sleep(2000);

List<WebElement> list=driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
list.get(1).click();
Thread.sleep(2000);


Set<String> id= driver.getWindowHandles();
System.out.println(id);
Iterator<String> s=id.iterator();
String ParendId=s.next();
String ChildId=s.next();

driver.switchTo().window(ChildId);
WebElement addTocart=	driver.findElement(By.id("add-to-cart-button"));
addTocart.click();

}
}
