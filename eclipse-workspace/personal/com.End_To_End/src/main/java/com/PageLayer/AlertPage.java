package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;
import com.UtilityLayer.AlertHelper;
import com.UtilityLayer.WebElementHelper;

public class AlertPage extends BaseClass {

	@FindBy(id = "alertbtn")
	private WebElement alertButton;

	@FindBy(id = "confirmbtn")
	private WebElement confirmButton;
	
	@FindBy(id="name")
	private WebElement textbox;

	public AlertPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void clickOnAlertButton() throws Exception {
		WebElementHelper.click(alertButton);
		Thread.sleep(2000);
	}

	public void clickOnAccept() {
		AlertHelper.accept();
	}

	public void clickOnConfirmButton() {
		WebElementHelper.click(confirmButton);
	}

	public String confirm_getText() {
		return AlertHelper.getText();
	}

	public void clickonDismissButton() throws InterruptedException {
		Thread.sleep(2000);
		AlertHelper.dismiss();
	}
	
	public void enterTextBox(String value) {
		WebElementHelper.sendKeys(textbox, value);
	}

}
