package org.qeagle.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpaths {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	//Partial attribute based xpath
	driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("demoSalesManager");
	//Collection based xpath
	driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
	//Partial attribute based xpath
	driver.findElement(By.xpath("//input[contains(@value,'Log')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
	
}
}
