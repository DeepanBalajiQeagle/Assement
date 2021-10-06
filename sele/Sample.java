package org.qeagle.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {


public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://acme-test.uipath.com/login");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
	driver.findElement(By.xpath("//label[@for='password']/following::input")).sendKeys("leaf@12");
	driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
	String title = driver.getTitle();
	System.out.println(title);
	WebElement ele1 = driver.findElement(By.xpath("//div[@class='main-container']/h1"));
	String text = ele1.getText();
	System.out.println(text);
	driver.findElement(By.xpath("//a[text()='Log Out']"));
	driver.close();
	
	
}
}
