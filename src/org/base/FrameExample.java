package org.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		WebElement button1 = driver.findElement(By.id("Click"));
		button1.click();
		System.out.println(button1.getText());
		
		driver.switchTo().defaultContent();
		
		//nested frame
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement button2 = driver.findElement(By.id("Click1"));
		button2.click();
		String text = button2.getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		List<WebElement> mainFrames = driver.findElements(By.tagName("iframe"));
		System.out.println(mainFrames.size());
		
		driver.switchTo().frame(0);
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		
	}

}
