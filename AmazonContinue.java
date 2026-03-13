package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonContinue {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement button=driver.findElement(By.className("a-button-text"));
		button.click();
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("shoe");
		Thread.sleep(2000);
	List<WebElement> list=	driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	
	//tagname[@AN='AV']/child::childtagname
	//List<WebElement> list=    driver.findElements(By.xpath("//div[@class='left-pane-results-container']/child::div"));
	
	//tagname[@AN='AV']/child::childtagname[@'AN='AV']	
    //List<WebElement> list=	driver.findElements(By.xpath("//div[@class='left-pane-results-container']/child::div[@id='sac-suggestion-row-5']"));
		
	list.get(5).click();
	driver.close();
	}
}
