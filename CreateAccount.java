package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
public static void main(String[] args) {
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
	//Click on account button
	driver.findElement(By.linkText("Accounts")).click();
	//click on create account
	driver.findElement(By.linkText("Create Account")).click();
	//Enter account name using xpath locator using Attribute based xpath
	driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
	//Enter description using Attribute based xpath
	driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("Selenium Automation Tester");
	//Enter Local name field using Attribute based xpath
	driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Account");
	//Enter Site name field using Attribute based xpath
	driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Bank");
	//Enter AnnualRevenue using xpath 
	driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("300000");
	//Drop down for Industry
	WebElement tool = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
	Select drop=new Select(tool);
	drop.selectByValue("IND_SOFTWARE");
	//Drop down for Ownership
	WebElement tool1 = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
	Select drop1=new Select(tool1);
	drop1.selectByVisibleText("S-Corporation");
	//Drop down for source
	WebElement tool2 = driver.findElement(By.xpath("//select[@name='dataSourceId']"));
	Select drop2=new Select(tool2);
	drop2.selectByValue("LEAD_EMPLOYEE");
	//Drop down for Marketing campaign
	WebElement tool3 = driver.findElement(By.xpath("//select[@name='marketingCampaignId']"));
	Select drop3=new Select(tool3);
	drop3.selectByIndex(7);
	//Drop down for State/province
	WebElement tool4 = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
	Select drop4=new Select(tool4);
	drop4.selectByValue("TX");
	//Click on Account button
	driver.findElement(By.xpath("//input[@value='Create Account']")).click();
	//click on Create duplicate Account button using xpath
    driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();	
	
}
}
