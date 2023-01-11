package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		//click Crm/sfa
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//click Lead
		driver.findElement(By.linkText("Leads")).click();
		//click find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//Click on phone using text based xpath
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//Enter phone number using attribute based xpath
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8667260459");
		//click find lead button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		
		//Capture lead ID of First Resulting lead using parent to child xpath
		WebElement text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String text1 = text.getText();
		System.out.println("Capture lead ID of First Resulting lead "+text1);
		//Click first resulting lead
		WebElement Element = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String leadId = Element.getText();
		Element.click();
		//click delete
		driver.findElement(By.linkText("Delete")).click();
		//click find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//Enter capture lead ID
		driver.findElement(By.name("id")).sendKeys(leadId);
		//Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Verify message"No records to display
		WebElement text2 = driver.findElement(By.xpath("//div[text()='No records to display']"));
		String text3 = text2.getText();
		//System.out.println("The captured lead ID is deleted "+text3);
			if(text3.contains("No records to display")) {
				System.out.println("the lead is deleted "+text3);
			}
			else {
				System.out.println("Failed to delete the lead");
			}
	}

}
