package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlTagname {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Me/Documents/learningHTML1.html");
WebElement username=driver.findElement(By.name("username"));
username.sendKeys("Priya");
//WebElement link=driver.findElement(By.tagName("a"));
//link.click();
WebElement hint=driver.findElement(By.xpath("/html/body/input[2]"));
hint.sendKeys("my first name");
WebElement password=driver.findElement(By.xpath("/html/body/input[3]"));
password.sendKeys("kolkar");
//WebElement male=driver.findElement(By.xpath("/html/body/input[4]"));
//male.click();
WebElement female=driver.findElement(By.xpath("/html/body/input[5]"));
female.click();

WebElement checkbox=driver.findElement(By.xpath("/html/body/input[6]"));
checkbox.click();
Thread.sleep(2000);
WebElement link=driver.findElement(By.tagName("a"));
link.click();





	}

}
