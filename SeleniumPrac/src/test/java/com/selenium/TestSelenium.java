package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {

	public static void main(String[] args) {
		
		
		String URL = "https://www.rediff.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Rediffmail")).click();
		
		System.out.println(driver.getTitle());
		
//		driver.findElement(By.partialLinkText("REALTIME")).click();
		
//		List<WebElement> lstLinks = driver.findElements(By.tagName("a"));
//		System.out.println(lstLinks.size());
//		for (WebElement lnk : lstLinks) {
//			System.out.println(lnk.getText());
//			
//		}
//		driver.findElement(By.linkText("Rediffmail")).click();
//		driver.findElement(By.id("login1")).sendKeys("Abir.Bhattacharya");
//		driver.findElement(By.name("passwd")).sendKeys("abc123");
////		driver.findElement(By.name("proceed")).click();
//		driver.findElement(By.className("signinbtn")).click();
		
//		driver.close();
	}

}
