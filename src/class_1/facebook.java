package class_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook {
	public static void main(String[] args) throws InterruptedException {
	//WebDriver driver = new EdgeDriver();
	WebDriver a = new FirefoxDriver();
	
	a.get("https://www.facebook.com/");
	a.manage().window().maximize();
	Thread.sleep(3000);
	a.findElement(By.id("email")).sendKeys("jerry");
a.findElement(By.id("pass")).sendKeys("12345678");
a.findElement(By.name("login")).click();
	
	}
}
