package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownLeafGround {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Lord the Url
		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node09hyg1tigvp9617sf3zunaz76k27448.node0");
		//find the element
		WebElement tool=driver.findElement(By.className("ui-selectonemenu"));
		//To Handle drop down
	    Select drop=new Select(tool);
	    drop.selectByVisibleText("Playwright");
	    tool.click();
	    //Select country using text based xpath
	    driver.findElement(By.xpath("//label[text()='Select Country']")).click();
	    driver.findElement(By.xpath("//li[text()='India']")).click();
	    
	    //Stale element reference exception
	    Thread.sleep(3000);
	    
	    //Selecting city for Brazil using text based xpath
	    driver.findElement(By.xpath("//label[text()='Select City']")).click();
	    driver.findElement(By.xpath("//li[text()='Chennai']")).click();
	    //Choose course
	    driver.findElement(By.xpath("//button[contains(@class,'ui-autocomplete-dropdown')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//li[text()='AWS']")).click();
        driver.findElement(By.xpath("//li[text()='Playwright']")).click();
	    //Choose language
	    driver.findElement(By.xpath("//label[text()='Select Language']")).click();
	    driver.findElement(By.xpath("//li[text()='Tamil']")).click();
	    
	    Thread.sleep(3000);
	    //Select two irrespective of the language chosen
	    driver.findElement(By.xpath("//label[text()='Select Values']")).click();
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//li[@data-label='மூன்று']")).click();
	    
	}

}
