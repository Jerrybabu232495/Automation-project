package class_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class google {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver = new EdgeDriver();
	WebDriver driver = new 	FirefoxDriver();
	Thread.sleep(300);
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	//driver.get("https://www.google.com");
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(200);
	driver.findElement(By.id("firstname")).sendKeys("Jerry");
	Thread.sleep(200);
	driver.findElement(By.name("lastname")).sendKeys("Babu");
	driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("abc@gmail.com");
	driver.findElement(By.name("reg_passwd__")).sendKeys("Babu");
	Thread.sleep(1000);
	WebElement List = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Select s=new Select(List);
	s.selectByIndex(23);
	Thread.sleep(1000);
	WebElement List1 = driver.findElement(By.id("month"));
	Select a=new Select(List1);
	s.selectByVisibleText("Sep");
	Thread.sleep(1000);
	WebElement List2 = driver.findElement(By.id("year"));
	Select c=new Select(List2);
	s.selectByValue("1995");
	Thread.sleep(1000);
	//driver.findElement(By.className("_8esa")).click();
	//Thread.sleep(1000);
	//driver.findElement(By.xpath("//button[contains(text(),'Sign')]")).click();
	//Thread.sleep(2000);
	//driver.close();

}
}