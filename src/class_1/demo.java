package class_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo {
 public static void main(String[] args) throws InterruptedException {
	System.out.print("hi");
	WebDriver driver =new EdgeDriver();
	Thread.sleep(2000);
	driver.get("https://www.google.com");
	driver.close();
	
	WebDriver driver2=new FirefoxDriver();
	Thread.sleep(2000);
	driver2.get("https://www.redbus.in/");
	driver2.findElement(By.id("src")).sendKeys("chennai");
	driver2.findElement(By.id("dest")).sendKeys("salem");
	driver2.findElement(By.className("dateText"));
	//driver2.close();
 }
 }
