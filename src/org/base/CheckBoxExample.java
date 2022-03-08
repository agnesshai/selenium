package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");

		WebElement cB1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input"));
		cB1.click();

		WebElement cB2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[3]/input"));
		cB2.click();
		
		//confirm whether it is selected
		WebElement cB3 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input"));
		if(cB3.isSelected()==true) {
			System.out.println("Selenium is checked");
		}
		else {
			System.out.println("Selenium is not checked");
		}
		//Deselect the selected
		WebElement cb4 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input"));
		WebElement cb5 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));
		if(cb4.isSelected()==true) {
			cb4.click();
		}
		else if(cb5.isSelected()==true) {
			cb5.click();
		}
		else {
			System.out.println("nothing is selected");
		}
		
		//select all the checkboxes
		WebElement c1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[1]/input"));
		c1.click();
		WebElement c2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[2]/input"));
		c2.click();
		WebElement c3 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[3]/input"));
		c3.click();
		WebElement c4 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[4]/input"));
		c4.click();
		WebElement c5 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[5]/input"));
		c5.click();
		
	}

}
