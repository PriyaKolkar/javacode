package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	WebElement	dropdown= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	Select s1= new Select(dropdown);
	//s1.selectByIndex(2);
	//s1.selectByValue("search-alias=amazon-devices");
	//s1.selectByVisibleText("Amazon Devices");
	s1.selectByVisibleText("Amazon Fashion");
	}

}
