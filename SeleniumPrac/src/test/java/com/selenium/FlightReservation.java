package com.selenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightReservation {

	public static void main(String[] args) throws InterruptedException {

		String URL = "https://www.tripodeal.com/flights";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,200);");
		Thread.sleep(2000);

		driver.findElement(By.id("returnDateRequiredYes")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("returnDateRequiredNo")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[contains(@class,'zmdi-close-circle')])[1]")).click();
		driver.findElement(By.id("origin")).click();
		driver.findElement(By.id("origin")).sendKeys("Pune");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='eac-container-origin']//li//div[contains(text(),'Pune')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("destination")).click();
		driver.findElement(By.id("destination")).sendKeys("Delhi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='eac-container-destination']//li//div[contains(text(),'Delhi')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("trip_start_date")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='picker__nav--next']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@aria-label='06/01/2023']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='zmdi zmdi-chevron-down zmdi-hc-2x arrowDwn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='zmdi zmdi-hc-2x zmdi-plus-circle'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='zmdi zmdi-hc-2x zmdi-plus-circle'])[2]")).click();
		Thread.sleep(2000);
		//		js.executeScript("scroll(200,250);");
		//		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='done']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='search']")).click();
		Thread.sleep(2000);





	}




}


