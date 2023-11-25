package class_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class demoinstagarm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver a=new EdgeDriver();
		a.get("https://www.webnexs.com/career.php");
		a.manage().window().maximize();
		a.findElement(By.id("field_name")).sendKeys("DineshBabu");
		Thread.sleep(1000);
		a.findElement(By.id("field_email")).sendKeys("pdineshbabu1995@gmail.com");
		a.findElement(By.id("field_exp")).sendKeys("1.3");
		Thread.sleep(1000);
		a.findElement(By.id("field_phone")).sendKeys("7200432057");
		a.findElement(By.id("field_period")).sendKeys("Immeditely");
		Thread.sleep(10000);
		a.close();
	}

}
