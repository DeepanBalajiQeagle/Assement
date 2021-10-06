package org.qeagle.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createlead {
	public static void select(WebElement text, int value) {
		Select sc = new Select(text);
		sc.selectByIndex(value);
	}

	public static void selecttext(WebElement text, String text1) {
		Select sc = new Select(text);
		sc.selectByVisibleText(text1);
	}

	public static void main(String[] args) {
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
		// To Create New Lead
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		// To Enter the details required for create new lead
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Qeagle Company");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Deepan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Balaji");
		WebElement sel1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		select(sel1, 2);
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("DeepanBalaji");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Sir");
		driver.findElement(By.name("annualRevenue")).sendKeys("25000");
		WebElement sel2 = driver.findElement(By.name("industryEnumId"));
		select(sel2, 3);
		WebElement sel3 = driver.findElement(By.name("ownershipEnumId"));
		select(sel3, 2);
		WebElement ele1 = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		ele1.clear();
		ele1.sendKeys("001");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9884316469");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("deepanbalaji@qeagle.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Arun");
		driver.findElement(By.name("generalAddress1")).sendKeys("No:4,Raman Street");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.name("generalPostalCode")).sendKeys("600023");
		WebElement ele2 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		selecttext(ele2, "India");
		driver.findElement(By.name("submitButton")).click();
		// To close the current Tab Opened
		driver.close();
	}
}
