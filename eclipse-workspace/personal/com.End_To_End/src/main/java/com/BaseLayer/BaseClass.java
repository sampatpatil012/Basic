package com.BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.UtilityLayer.PropertiesHelper;

public class BaseClass {
	// protected static WebDriver driver;

	private static ThreadLocal<WebDriver> td = new ThreadLocal<WebDriver>();

	public static WebDriver getDriver() {
		return td.get();
	}

	public static void initialisation() throws Exception {

		String browsername = PropertiesHelper.getProperties("BrowserName");

		if (browsername.equalsIgnoreCase("chrome")) {
//			driver = new ChromeDriver();
//			td.set(getDriver());
			td.set(new ChromeDriver());
		} else if (browsername.equalsIgnoreCase("IE")) {
			// driver = new InternetExplorerDriver();
			td.set(new InternetExplorerDriver());
		} else if (browsername.equalsIgnoreCase("headless")) {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--headless");
			// driver = new ChromeDriver(opt);
			td.set(new ChromeDriver(opt));
		} else if (browsername.equalsIgnoreCase("incognito")) {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--incognito");
			// driver = new ChromeDriver(opt);
			td.set(new ChromeDriver(opt));
		} else {
			System.out.println("Please check the correct browser");
		}
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

	}

	public static void getURL() throws Exception {
		String url = PropertiesHelper.getProperties("UrlName");
		getDriver().get(url);
		// getDriver().get("https://www.goibibo.com/");
	}

	public static void tearDown() throws InterruptedException {
		if (getDriver() != null) {
			//Thread.sleep(5000);
			//getDriver().close();
			getDriver().quit();
		}
	}
}
