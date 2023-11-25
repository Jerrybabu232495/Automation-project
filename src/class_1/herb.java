package class_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class herb {

	public static void main(String[] args) throws InterruptedException {
		WebDriver a=new FirefoxDriver();
		a.get("https://www.myherbalife.com/");
		a.manage().window().maximize();
		a.findElement(By.xpath("//*[@id=\"localeSel\"]")).click();
		Thread.sleep(3000);
//		WebElement findElement = a.findElement(By.xpath("//*[@id=\"locales-drop-3\"]/span/span"));
//		findElement.click();
//		Select b=new Select(findElement); 
//		//b.selectByIndex(5);
//		Thread.sleep(3000);
//		b.selectByVisibleText("Hong Kong - English");
//		findElement.click();
		a.findElement(By.xpath("//*[@id=\"locales-drop-3\"]/span/span")).click();
		a.findElement(By.xpath("/html/body/div[8]/div/div[2]/ul/li[7]")).click();
		Thread.sleep(3000);
		a.findElement(By.xpath("//a[contains(text(),'Sign in or create an online account')]")).click();
		a.findElement(By.xpath("//a[contains(text(),'Create an Account')]")).click();
//account create 
		Thread.sleep(5000);
		a.findElement(By.id("email")).sendKeys("pdineshbabu1995@gmail.com");
		a.findElement(By.id("cEmail")).sendKeys("pdineshbabu1995@gmail.com");
		Thread.sleep(3000);
		a.findElement(By.id("Password")).sendKeys("DIne,@232495");
		a.findElement(By.id("cpassword")).sendKeys("DIne,@232495");
		Thread.sleep(3000);
		a.findElement(By.xpath("//input[@id='cpassword']")).click();
	}

}
