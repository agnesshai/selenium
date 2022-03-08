package org.base;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Window.html");
		
		String oldWindow = driver.getWindowHandle();
		
		WebElement firstButton = driver.findElement(By.xpath("//*[@id=\"home\"]"));
		firstButton.click();
		Set<String> allWindows = driver.getWindowHandles();
		
		for (String newWindows : allWindows) {
			driver.switchTo().window(newWindows);
		}
		WebElement editBox = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img"));
		editBox.click();
		Thread.sleep(3000);
		driver.close();
	driver.switchTo().window(oldWindow);
	
	
	//multiple windows
	WebElement multiWindow = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
	multiWindow.click();
	int size = driver.getWindowHandles().size();
	System.out.println("Number of opened windows :"+ size);
		
	
	//closing only the child windows
	WebElement closeChild = driver.findElement(By.id("color"));
	closeChild.click();
	Set<String> child = driver.getWindowHandles();
	for (String closingChild : child) {
		driver.switchTo().window(closingChild);
		if(!closingChild.equals(oldWindow)) {
			
			Thread.sleep(3000);
			driver.switchTo().window(closingChild);
			Thread.sleep(3000);
			driver.close();
		}
		
	}
	
	
	
	}
	
	

}
