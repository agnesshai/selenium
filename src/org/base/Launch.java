package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch {
	public static void main(String[] args) {
		// Configure the browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		// InterfaceName objRef = new ClassName();
		WebDriver driver = new ChromeDriver();
		//WebDriver wd = new FirefoxDriver();
		
		// To launch the browser
		driver.get("https://www.google.co.in/");
		
	}
}
