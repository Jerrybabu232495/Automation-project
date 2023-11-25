package testNG;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import graphql.PublicApi;

public class phptravels {
	WebDriver a;
	@Test (priority = 1)
	public void browseropen() {
		a= new FirefoxDriver();
		a.get("https://phptravels.com/");
		a.manage().window().maximize();
	}
@Test(priority = 2)
public void Signup() throws InterruptedException {
	
//a.findElement(By.xpath("//a[@class='btn btn-primary rounded m-1 w-100 text-uppercase fs-6 px-0 waves-effect']")).click();
String parentWindowId = a.getWindowHandle();
System.out.println("Parent Window ID:" + parentWindowId);
a.findElement(By.xpath("//a[@class='btn btn-primary rounded m-1 w-100 text-uppercase fs-6 px-0 waves-effect']")).click();
Set<String> allWindowId = a.getWindowHandles();
List<String> l=new ArrayList<String>(allWindowId);
a.switchTo().window(l.get(1));
//a.getWindowHandle();
//a.switchTo().window("https://phptravels.com/");
//a.switchTo().window("https://phptravels.org/register.php");
Thread.sleep(3000);
}
@Test(priority = 3)
public void PersonalInformation() {
	a.findElement(By.id("inputFirstName")).sendKeys("jerry");
	a.findElement(By.id("inputLastName")).sendKeys("babu");
	a.findElement(By.id("inputEmail")).sendKeys("pdineshbabu1995@gmail.com");
	a.findElement(By.xpath("//*[@id=\"containerNewUserSignup\"]/div[1]/div/div/div[4]/div/div/div/div/div[2]")).click();
	a.findElement(By.xpath("//*[@id=\"containerNewUserSignup\"]/div[1]/div/div/div[4]/div/div/div/ul/li[102]/span[1]")).click();
	
}
	
@Test(priority = 4)
public void BillingAddress() throws InterruptedException {

a.findElement(By.id("inputCompanyName")).sendKeys("soft logic institute");
a.findElement(By.id("inputAddress1")).sendKeys("kk nagar");
a.findElement(By.id("inputAddress2")).sendKeys("ashok pillar");
Thread.sleep(3000);
a.findElement(By.id("inputCity")).sendKeys("Chennai");
//implicit wait syntax
//a.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
Thread.sleep(5000);
a.findElement(By.name("state")).sendKeys("TamilNadu");
Thread.sleep(3000);
a.findElement(By.id("inputPostcode")).sendKeys("600036");
WebElement findElement =a.findElement(By.id("inputCountry"));
Select b=new Select(findElement); 
b.selectByVisibleText("India");
Thread.sleep(3000);
}

@Test(priority = 5)
public void AdditionalRequiredInformation() throws InterruptedException {
a.findElement(By.id("customfield2")).sendKeys("7200432055");
Thread.sleep(3000);
}


@Test(priority = 6)
	public void AccountSecurity() throws InterruptedException {
		a.findElement(By.name("password")).sendKeys("DIne,@2324");
		a.findElement(By.name("password2")).sendKeys("DIne,@2324");
		Thread.sleep(3000);
	}

@Test(priority = 7)
public void Joinourmailinglist() throws InterruptedException {
	a.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
	a.findElement(By.xpath("//body/section[@id='main-body']/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/span[3]")).click();
	a.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
	Thread.sleep(3000);
}

@Test(priority = 8)
	public void registerclick() throws InterruptedException {
		//checkbox syntax
		a.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();
		//register icon syntax
		a.findElement(By.xpath("//body/section[@id='main-body']/div[1]/div[1]/div[2]/div[1]/form[1]/p[1]/input[1]")).click();
		Thread.sleep(3000);
		
	}

} 
