package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Operations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		System.out.println("Opened leafground");
		
		WebElement linkComponent = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[3]/a"));
		linkComponent.click();
		System.out.println("Opened link Component");
		
		WebElement goHomeLink = driver.findElement(By.linkText("Go to Home Page"));
		goHomeLink.click();
		System.out.println("Clicked link to go home");
		
		WebElement buttonSample = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a"));
		buttonSample.click();
		System.out.println("Opened button sample page");
		
		WebElement positionButton = driver.findElement(By.id("position"));
		Point location = positionButton.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println("Position :"+x+"\t"+y);
		
		WebElement colorButton = driver.findElement(By.id("color"));
		String cssValue = colorButton.getCssValue("background-color");
		System.out.println(cssValue);
		
		
		WebElement sizeButton = driver.findElement(By.id("size"));
		Dimension size = sizeButton.getSize();
		System.out.println(size);
		
		WebElement homeButton = driver.findElement(By.id("home"));
		homeButton.click();
		System.out.println("Clicked home button");
		
		WebElement editBoxSample = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a"));
		editBoxSample.click();
		System.out.println("Opened Edit box button");
		
		WebElement emailBox = driver.findElement(By.id("email"));
		emailBox.sendKeys("agnes@gmail.com");
		
		WebElement appendOPeration = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		appendOPeration.sendKeys("text");
		
		WebElement getValueBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input"));
	String attribute = getValueBox.getAttribute("value");
	System.out.println(attribute);
	
	WebElement clearBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
	clearBox.clear();
	
	WebElement disabledBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
	boolean disabled = disabledBox.isEnabled();
	if(disabled==false) {
		System.out.println("Disabled");
	}
	else {
		System.out.println("Enabled");
	}
		
	}

}
