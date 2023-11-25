package class_1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class redbus {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver b= new FirefoxDriver();
		b.get("https://www.redbus.in/");
		b.manage().window().maximize();
		b.findElement(By.xpath("//span[contains(text(),'Bus Tickets')]")).click();
		Thread.sleep(4000);
		b.findElement(By.id("src")).sendKeys("chennai");
		b.findElement(By.id("dest")).sendKeys("Bangalore");
		//TakesScreenshot ts = (TakesScreenshot)a;
		//File source =ts.getScreenshotAs(OutputType.FILE);
		//File scrFile = ((TakesScreenshot) ts).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(scrFile, new File("C:\\Users\\HP\\eclipse-workspace\\automation\\Screenshot\\hotel.png"), true);
		Thread.sleep(3000);
		TakesScreenshot ab = (TakesScreenshot)b;
		File sourcenew = ab.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourcenew, new File("C:\\Users\\HP\\eclipse-workspace\\automation\\screen\\bus.png"));
		//FileHandler.copy(source, new File("C:\\Users\\HP\\eclipse-workspace\\automation\\screen\\redbus.png"));
	}
	
	

}
