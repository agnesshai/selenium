package org.base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		// alert box
		WebElement alertBox1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		alertBox1.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();

		// confirm box
		WebElement alertBox2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		alertBox2.click();
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(3000);
		alert1.dismiss();

		// prompt box
		WebElement promptBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		promptBox.click();
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(3000);
		alert2.sendKeys("Agnes");
		Thread.sleep(3000);
		alert2.accept();


		//dialog
		WebElement sweetBox = driver.findElement(By.xpath("//*[@id=\"btn\"]"));
		sweetBox.click();
		WebElement dialog = driver.switchTo().activeElement();
		WebElement okButton = dialog.findElement(By.xpath("/html/body/div[2]/div/div[2]/div"));
		Thread.sleep(3000);
		okButton.click();

		




	}

}
