package org.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		List<WebElement> selectableList = driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		
		System.out.println(selectableList.size());
		Actions action = new Actions(driver);
		
		action.keyDown(Keys.CONTROL).click(selectableList.get(0)).
		click(selectableList.get(2)).click(selectableList.get(5)).build().perform();
		
	}
}
