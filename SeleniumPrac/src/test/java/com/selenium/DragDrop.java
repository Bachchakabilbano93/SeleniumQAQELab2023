package com.selenium;

import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {

		String URL = "https://jqueryui.com/droppable/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		System.out.println(driver.getTitle());

		Thread.sleep(2000);

		//		driver.switchTo().frame(0);
		//		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		//		src

		//		WebElement src = driver.findElement(By.id("draggable"));

		//		tgt

		//		WebElement tgt = driver.findElement(By.id("droppable"));

		Actions actions = new Actions(driver);
		//		actions.dragAndDrop(src, tgt).perform();

		//		actions.clickAndHold(src).moveToElement(tgt).release().perform();

		String pWH = driver.getWindowHandle();
		System.out.println("Parent WH");
		System.out.println(pWH);

		//		driver.switchTo().parentFrame();
		WebElement weDragable = driver.findElement(By.linkText("Draggable"));
		//		actions.moveToElement(weDragable).sendKeys(Keys.SHIFT).click().perform();
		actions.moveToElement(weDragable).keyDown(Keys.SHIFT).click().keyUp(Keys.SHIFT).perform();
		//		actions.moveToElement(weDragable).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).perform();

		Set<String> WHS = driver.getWindowHandles();
		System.out.println("All WH");
		for (String cWH : WHS) {
			//			System.out.println(cWH);
			if (!cWH.equals(pWH) ) {
				driver.switchTo().window(cWH);
				break;

			}
		}

		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();

		driver.switchTo().window(pWH);
		System.out.println(driver.getTitle());



	}

}
