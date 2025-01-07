package com.BaseLayer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class goibibo {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.goibibo.com/");

		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//p[@class=\"sc-jlwm9r-1 ewETUe\"]")).click();

		WebElement from = driver.findElement(By.xpath("//div[@class='sc-12foipm-22 kGtxGm']"));
		from.click();
		Actions act = new Actions(driver);
		act.sendKeys("Pune").perform();
		Thread.sleep(1000);
		act.keyDown(Keys.ENTER).build().perform();

		// for To textbox
		act.sendKeys("Mumbai").perform();
		Thread.sleep(1000);
		act.keyDown(Keys.ENTER).build().perform();

		driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();
//		List<WebElement> fromList = driver
//				.findElements(By.xpath("//ul[@id='autoSuggest-list']/descendant::span[@class='autoCompleteTitle ']"));

		// WebElement to = driver.findElement(By.xpath("//div[@class='sc-12foipm-2
		// cVOSjp fswFld ']"));
		// to.click();

		Thread.sleep(50000);
		WebElement source = driver.findElement(By.xpath("//div[@aria-valuenow='7433']"));
		WebElement dest = driver.findElement(By.xpath("//div[@aria-valuenow='9386']"));
		act.scrollToElement(source).perform();
		act.dragAndDrop(source, dest).perform();

	}

}
