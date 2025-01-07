package com.UtilityLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BaseLayer.BaseClass;

public class WaitsHelper extends BaseClass {

	public static WebElement visibilityOf(WebElement wb) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
		return wait.until(ExpectedConditions.visibilityOf(wb));
	}

	public static List<WebElement> visibilityOfAllElements(List<WebElement> lists) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
		return wait.until(ExpectedConditions.visibilityOfAllElements(lists));
	}
}
