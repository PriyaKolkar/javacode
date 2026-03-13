package Selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserGet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  ChromeDriver driver= new ChromeDriver();
  driver.get("https://www.amazon.in/");
  Thread.sleep(3000);
  String title= driver.getTitle();
  System.out.println(" Title is  ======>"    +title);
  String url= driver.getCurrentUrl();
  System.out.println(" URL---->"     +url);
  String WH=driver.getWindowHandle();
  System.out.println("WH--->"   +WH);
  Set<String> WH1 =driver.getWindowHandles();
  System.out.println("WH1--->"   +WH1);
  driver.close();
	}

}
