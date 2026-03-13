package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		List<WebElement> totalLink=driver.findElements(By.tagName("a"));
		int count= totalLink.size();
		System.out.println(count);
		for(int i=0;i<totalLink.size();i++) {
        WebElement	first=	totalLink.get(i);
        //String LinkText=first.getDomAttribute("href");
        String text=first.getText();
        //System.out.println(LinkText);
        System.out.println(text);
       
	}

}}
