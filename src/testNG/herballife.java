package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class herballife {
	WebDriver a;
	@Test(priority = 1)
	public void websitelink  () throws InterruptedException {
		a=new FirefoxDriver();
		a.get("https://www.myherbalife.com/");
		a.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test(priority = 2)
	public void new1() {
		WebElement findElement1 =a.findElement(By.xpath("//*[@id=\"localeSel\"]"));
		findElement1.click();
		//a.findElement(By.id("localeSel")).click();
  //a.findElement(By.xpath("//*[@id=\"locales-drop-3\"]/span/span"));
WebElement findElement = a.findElement(By.xpath("//*[@id=\"locales-drop-3\"]/span/span"));
Select b=new Select(findElement); 
b.selectByIndex(5);
	}

}
