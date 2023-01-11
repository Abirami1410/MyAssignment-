package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click on create new account button...Text based xpath
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		//Enter first name...using attribute based xpath
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Abirami");
		//Enter last name...using attribute based xpath
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Rajasekaran");
		//Enter mobile number....using attribute based xpath
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9597808458");
		//Enter new password
		driver.findElement(By.id("password_step_input")).sendKeys("Lordmuruga@108");
		//Enter Date of Birth
		//Drop down for date
		WebElement tool = driver.findElement(By.id("day"));
        Select drop=new Select(tool);
        drop.selectByValue("14");
        //drop down for month
        WebElement tool1 = driver.findElement(By.id("month"));
        Select drop1=new Select(tool1);
        drop1.selectByVisibleText("Oct");
        //drop down for year
        WebElement tool2 = driver.findElement(By.id("year"));
	    Select drop2=new Select(tool2);
	    drop2.selectByVisibleText("1993");
	    //Select the radio button female
	    driver.findElement(By.xpath("//label[text()='Female']")).click();
	
	}

}
