package class_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowshandle {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver(); 
		driver.get("http://demo.guru99.com/popup.php ");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(2000);
driver.getWindowHandle();
driver.switchTo().window("https://demo.guru99.com/articles_popup.php");
	}

}
