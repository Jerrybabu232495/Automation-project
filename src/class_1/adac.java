package class_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class adac {

	public static void main(String[] args) throws InterruptedException {
	WebDriver a= new FirefoxDriver();
	a.get("https://adactinhotelapp.com/SearchHotel.php");
	//Dropdown Syntax
	//WebElement a = driver.findElement(By.name("States"));
	//Select s = new Select(a);
	//s.selectByIndex(1)
	a.findElement(By.id("username")).sendKeys("jerrybabu");
	a.findElement(By.id("password")).sendKeys("12345678");
	a.findElement(By.id("login")).click();
	WebElement b = a.findElement(By.id("location"));
	Select c=new Select(b);
	c.selectByIndex(8);
	Thread.sleep(3000);
	WebElement d = a.findElement(By.id("location"));
	Select list2=new Select(d);
	list2.selectByValue("Melbourne");
	
	}

}
