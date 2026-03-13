package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://netbanking.hdfcbank.com/netbanking/");
driver.manage().window().maximize();
WebElement frame1=driver.findElement(By.name("login_page"));
driver.switchTo().frame(frame1);
WebElement login=driver.findElement(By.name("fldLoginUserId"));
login.sendKeys("priya");
Thread.sleep(2000);
WebElement button=driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
button.click();
	}

}
