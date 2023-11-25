package class_1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class irctc {

	public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver a=new FirefoxDriver();
	a.get("https://www.irctc.co.in/nget/train-search");
	a.manage().window().maximize();
//	TakesScreenshot baa = (TakesScreenshot)aa;
//	File Sourcea =baa.getScreenshotAs(OutputType.FILE);
//	FileHandler.copy(Sourcea, new File("C:\\Users\\HP\\eclipse-workspace\\automation\\irctc\\scr.png"));

//	WebElement driver = a.findElement(By.xpath("//input[@class='ng-tns-c57-8 ui-inputtext ui-widget "
//	+"ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"));
//	driver.sendKeys("DELHI - DLI");
//	driver.click();
	Thread.sleep(5000);
	WebElement findElement = a.findElement(By.xpath("//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"));
	findElement.sendKeys("DELHI - DLI (NEW DELHI)");
	findElement.click();
	Thread.sleep(3000);
	WebElement findElement1 = a.findElement(By.xpath("//input[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"));
	findElement1.sendKeys("CHENNAI EGMORE - MS (CHENNAI)");
	findElement.click();
	Thread.sleep(5000);
	a.findElement(By.xpath("//body/app-root[1]/app-home[1]/div[3]/div[1]/app-main-page[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-jp-input[1]/div[1]/form[1]/div[3]/div[1]/div[1]/p-dropdown[1]/div[1]/div[2]/span[1]")).click();
	a.findElement(By.xpath("//*[@id=\"journeyQuota\"]/div/div[4]/div/ul/p-dropdownitem[2]/li")).click();
	Thread.sleep(2000);
	a.findElement(By.xpath("//span[contains(text(),'All Classes')]")).click();
	a.findElement(By.xpath("//*[@id=\"journeyClass\"]/div/div[4]/div/ul/p-dropdownitem[3]/li")).click();
	Thread.sleep(2000);
	a.findElement(By.xpath("//*[@id=\"jDate\"]/span/input")).click();
	a.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[2]/table/tbody/tr[4]/td[4]/a")).click();
	Thread.sleep(2000);
	a.findElement(By.xpath("//label[contains(text(),'Flexible With Date')]")).click();
	a.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
	
//	WebElement drop= a.findElement(By.xpath("(//p-dropdownitem[@class='ng-tns-c65-12 ng-star-inserted']//li)[2]"));
//	Select drag=new Select(drop);
//	//drag.selectByVisibleText("TATKAL");
//	drag.selectByValue("TATKAL");
//	
//	WebElement findElement2 = a.findElement(By.xpath("(//a[contains(@class,'ui-state-default ng-tns-c58-10')])[2]"));
////	findElement2.sendKeys("20/11/2023");
//	findElement2.sendKeys("21/11/2023");
//	findElement2.click();
//	Thread.sleep(5000);
//	
	
	
	
//	WebElement drop= a.findElement(By.xpath("//span[contains(text(),'AC First Class (1A)')]"));
//	Select drag=new Select(drop);
//	drag.selectByVisibleText("AC First Class (1A)");
	
	//a.findElement(By.xpath("//span[text()=' DELHI - DLI ']")).sendKeys("DELHI - DLI");
//a.findElement(By.xpath("//span[text()=' CHENNAI EGMORE - MS ']")).sendKeys("CHENNAI EGMORE - MS");
	
	
	
	
	 
	
	
	
	//TakesScreenshot ab = (TakesScreenshot)b;
	//File sourcenew = ab.getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(sourcenew, new File("C:\\Users\\HP\\eclipse-workspace\\automation\\screen\\bus.png"));
	
	
	
	
	
	
	
	
	
	
	/*a.findElement(By.xpath("//input[@class='ng-tns-c57-8 ui-inputtext ui-widget"
	+ " ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("chennai");
	a.findElement(By.xpath("//input[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default "
			+ "ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("coimbatore");
	//a.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget "
		//	+ "ui-state-default ui-corner-all ng-star-inserted']")).click();
	WebElement List7 = a.findElement(By.xpath("//span[contains(text(),'All Classes')]"));
	Select h=new Select(List7);
	h.selectByIndex(2);*/
	
	
	
	
	}

}
