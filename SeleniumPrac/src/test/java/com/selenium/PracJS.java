package com.selenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracJS {

	public static void main(String[] args) throws InterruptedException {

		String URL = "https://www.tripodeal.com/flights";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,300);");
		Thread.sleep(2000);
		js.executeScript("scroll(0,-300);");
		Thread.sleep(2000);
		js.executeScript("scroll(0,300);");






	}




}


