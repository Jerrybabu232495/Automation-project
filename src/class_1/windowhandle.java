package class_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class windowhandle {

	public static void main(String[] args) {
		WebDriver a=new EdgeDriver();
		a.get("https://www.flipkart.com/");
		a.manage().window().maximize();
		//a.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung s21",Keys.ENTER);
	}

}
