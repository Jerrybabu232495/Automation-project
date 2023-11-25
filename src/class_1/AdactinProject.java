package class_1;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.bouncycastle.crypto.util.SSHNamedCurves;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinProject {

	public static void main(String[] args) throws InterruptedException, IOException {
		//WebDriver a = new ChromeDriver();
		WebDriver a=new EdgeDriver();
		//site link
		a.get("https://adactinhotelapp.com/index.php");
		//login values
		a.findElement(By.id("username")).sendKeys("jerrybabu");
		a.findElement(By.id("password")).sendKeys("12345678");
		a.findElement(By.id("login")).click();
		a.manage().window().maximize();
		Thread.sleep(1000);
		//drop down 1 selection
		WebElement List = a.findElement(By.id("location"));
		Select b=new Select(List);
		b.selectByIndex(5);
		//drop down 2  selection
				WebElement List1 = a.findElement(By.id("hotels"));
				Select c=new Select(List1);
				c.selectByIndex(3);
				//drop down 3  selection
				WebElement List3 = a.findElement(By.id("room_type"));
				Select d=new Select(List3);
				d.selectByIndex(2);
				WebElement List4 = a.findElement(By.id("room_nos"));
				Select e=new Select(List4);
				e.selectByIndex(2);
				Thread.sleep(1000);
				//date picker
				a.findElement(By.id("datepick_in")).sendKeys("025/11/2023");
				Thread.sleep(800);
				a.findElement(By.id("datepick_out")).sendKeys("026/11/2023");
				//drop down 4  selection
				WebElement List5 = a.findElement(By.id("adult_room"));
				Select f=new Select(List5);
				f.selectByIndex(2);
				//drop down 5  selection
				WebElement List6 = a.findElement(By.id("child_room"));
				Select g=new Select(List6);
				g.selectByIndex(3);
				Thread.sleep(1000);
				a.findElement(By.id("Submit")).click();
				a.findElement(By.id("radiobutton_0")).click();
				a.findElement(By.id("continue")).click();
				a.findElement(By.id("first_name")).sendKeys("Jerry");
				a.findElement(By.id("last_name")).sendKeys("babu");
				a.findElement(By.id("address")).sendKeys("ASHOK PILLAR , Chennai");
				a.findElement(By.id("cc_num")).sendKeys("1234567887654321");
				//drop down 7  selection
				WebElement List7 = a.findElement(By.id("cc_type"));
				Select h=new Select(List7);
				h.selectByIndex(1);
				Thread.sleep(1000);
				//drop down 8  selection
				WebElement List8 = a.findElement(By.id("cc_exp_month"));
				Select i=new Select(List8);
				i.selectByIndex(10);
				//drop down 9  selection
				WebElement List9 = a.findElement(By.id("cc_exp_year"));
				Select j=new Select(List9);
				j.selectByIndex(3);
				Thread.sleep(1000);
				a.findElement(By.id("cc_cvv")).sendKeys("1234");
				a.findElement(By.id("book_now")).click();
				//screenshot 
				TakesScreenshot ts = (TakesScreenshot)a;
				//File source =ts.getScreenshotAs(OutputType.FILE);
				File scrFile = ((TakesScreenshot) ts).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile, new File("C:\\Users\\HP\\eclipse-workspace\\automation\\Screenshot\\hotel.png"), true);
				//File Destination = new File ("C:\\Users\\HP\\eclipse-workspace\\automation\\Screenshot\\hotel.png");
				//FileHandler.copy(source,Destination);
				//ts.copy(source,Destination);
				Thread.sleep(5000);
				/*WebElement scrollDown = a.findElement(By.name("logout"));
			    JavascriptExecutor js=(JavascriptExecutor) a;
			    js.executeScript("arguments[0].scrollIntoView(true);", scrollDown);
			
			Thread.sleep(3000);*/
			
				//WebElement printout = a.findElement(By.id("order_no"));//input[@id='order_no']
			WebElement printout = a.findElement(By.xpath("//input[@id='order_no']"));
			//System.out.println(printout.getText());
			String getOrderNo=printout.getAttribute("value");
			System.out.println(getOrderNo);
				
//				WebElement printout = a.findElement(By.xpath("//input[@id='first_name']"));
//				System.out.println(printout.getText());
				
				System.out.println("Hotel has been booked");
				
				//FileHandler.class(source,Destination);				
				//Call getScreenshotAs method to create image file
				//File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
				//Move image file to new destination
				//File DestFile=new File("./automation/Screenshot");
				//Copy file at destination
				
				
				

	}

}
