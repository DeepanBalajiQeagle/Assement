package org.qeagle.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
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
		driver.findElement(By.xpath("(//span[@class=\"x-tab-strip-text \"])[2]")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("9884316469");
		driver.findElement(By.xpath("(//button[@class=\"x-btn-text\"])[7]")).click();
		// To Capture FirstLead of the Table
		Thread.sleep(2000);
		WebElement tx = driver.findElement(By.xpath("(//a[@class=\"linktext\"])[4]"));
		String text = tx.getText();
		System.out.println("The First lead of the Table:" + text);
		tx.click();
		// To Delete The lead
		Thread.sleep(2000);
		driver.findElement(By.linkText("Delete")).click();
		// To Check the Lead is Available
		Thread.sleep(3000);
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys(text);
		driver.findElement(By.xpath("(//button[@class=\"x-btn-text\"])[7]")).click();
		// To Check the Availability of the lead
		Thread.sleep(2000);
		WebElement ele3 = driver.findElement(By.xpath("//div[@class=\"x-paging-info\"]"));
		String Execepted = ele3.getText();
		String Actual = "No records to display";
		if (Actual.equals(Execepted)) {
			System.out.println("You landed on correct page:" + Execepted);
		} else {
			System.out.println("Its was Wrong page:" + Execepted);
		}
		driver.close();

	}
}
