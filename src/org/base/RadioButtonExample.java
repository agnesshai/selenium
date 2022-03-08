package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/radio.html");
	
	//selecting the radio button
	WebElement rB1 = driver.findElement(By.id("yes"));
	rB1.click();
	Thread.sleep(3000);
	
	//find the default selected radio button
	WebElement rbUnchecked = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[2]/input"));
	WebElement rbChecked = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[3]/input"));
	
	if(rbUnchecked.isSelected()==true) {
		System.out.println("Unchecked box is selected by default");
	}
	else if(rbChecked.isSelected()==true) {
		System.out.println("Checked box is selected by default");
	}
	else {
		System.out.println("Nothing is selected");
	}
	
	//selecting the age only if it is not checked
	WebElement ageBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[3]"));
if(ageBox.isSelected()==true) {
	
}
else {
	ageBox.click();
}
}
}
