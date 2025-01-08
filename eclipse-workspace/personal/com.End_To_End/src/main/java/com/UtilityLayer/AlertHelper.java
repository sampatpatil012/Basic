package com.UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BaseLayer.BaseClass;

public class AlertHelper extends BaseClass {

	public static Alert alertIsPresent() {
		return new WebDriverWait(getDriver(), Duration.ofSeconds(30)).until(ExpectedConditions.alertIsPresent());
	}

	public static void accept() {
		AlertHelper.alertIsPresent().accept();
	}

	public static void dismiss() {
		AlertHelper.alertIsPresent().dismiss();
	}

	public static String getText() {
		return AlertHelper.alertIsPresent().getText();
	}

	public static void sendKeys(String text) {
		AlertHelper.alertIsPresent().sendKeys(text);
	}


}
