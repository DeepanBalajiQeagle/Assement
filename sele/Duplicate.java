package org.qeagle.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Duplicate {
public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	String title = driver.getTitle();
	System.out.println(title);
	// To Enter Login Details
	driver.findElement(By.id("username")).sendKeys("demoSalesManager");
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	String title2 = driver.getTitle();
	System.out.println("We Landed on the right page:" + title2);
	// To Click CRM Button
	driver.findElement(By.linkText("CRM/SFA")).click();
	String title3 = driver.getTitle();
	System.out.println("We Landed 2 site correctly:" + title3);
	// To Create Find Lead
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Email']")).click();
	driver.findElement(By.name("emailAddress")).sendKeys("deepanbalaji@qeagle.com");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	
}
}
