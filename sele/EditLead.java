package org.qeagle.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
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
		driver.findElement(By.xpath("(//input[@name=\"lastName\"])[3]")).sendKeys("Balaji");
		driver.findElement(By.xpath("(//button[@class=\"x-btn-text\"])[7]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		String title1 = driver.getTitle();
		System.err.println("The Present Title of the Page:" + title1);
		driver.findElement(By.linkText("Edit")).click();
		WebElement ele1 = driver.findElement(By.id("updateLeadForm_companyName"));
		ele1.clear();
		ele1.sendKeys("HCL Organiszation");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text);
		driver.close();
	}
}
