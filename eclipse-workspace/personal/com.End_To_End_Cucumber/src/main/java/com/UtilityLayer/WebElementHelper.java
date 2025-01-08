package com.UtilityLayer;

import org.openqa.selenium.WebElement;

import com.BaseLayer.BaseClass;

public class WebElementHelper extends BaseClass {

	public static void click(WebElement wb) {
		WaitsHelper.visibilityOf(wb).click();
	}

	public static void sendKeys(WebElement wb, String value) {
		WaitsHelper.visibilityOf(wb).sendKeys(value);
	}

	public static String getText(WebElement wb) {
		return WaitsHelper.visibilityOf(wb).getText();

	}

	public static String getAttribute(WebElement wb) {
		return WaitsHelper.visibilityOf(wb).getAttribute("value");
	}
	
}
