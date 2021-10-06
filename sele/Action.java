package org.qeagle.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action {
	
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	WebElement find1 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	new Actions(driver).doubleClick(find1).perform();
	WebElement find2 = driver.findElement(By.xpath("(//div[@class='xtXmba'])[5]"));
	new Actions(driver).moveToElement(find2).perform();
	
	
	WebElement drag = driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
    WebElement dest = driver.findElement(By.xpath("//input[@type='text']"));
	new Actions(driver).dragAndDrop(drag, dest);
}
}
