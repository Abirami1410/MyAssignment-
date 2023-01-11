package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		//Enter first name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Abirami");
		//Click find leads button using text based xpath
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		
		//Click on first resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		//Verify the title page
		String title = driver.getTitle();
		System.out.println(title);
		//click Edit
		driver.findElement(By.linkText("Edit")).click();
		//Change the company name
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("CTS");
		//click update
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		//Confirm the changed name appears
		//To get the text in console as ...the company name changed to CTS
		WebElement text = driver.findElement(By.id("viewLead_companyName_sp"));
		String text1 = text.getText();
		System.out.println(text1);
		//Close the browser
        //driver.close();
	}

}
