package org.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement dd1 = driver.findElement(By.id("dropdown1"));
		Select select = new Select(dd1);
		select.selectByIndex(2);
		Thread.sleep(3000);
		select.selectByValue("3");
		Thread.sleep(3000);
		select.selectByVisibleText("Loadrunner");
		Thread.sleep(3000);
		
		List<WebElement> options = select.getOptions();
		int size = options.size();
		System.out.println(size);
		
		WebElement dd2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		dd2.sendKeys("Selenium");
		Thread.sleep(3000);
		WebElement dd3 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select select2 = new Select (dd3);
		select2.selectByIndex(3);
		select2.selectByIndex(4);
	}

}
