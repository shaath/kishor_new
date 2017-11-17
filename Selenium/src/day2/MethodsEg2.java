package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MethodsEg2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();

//		driver.navigate().to("http://facebook.com");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
		
		driver.findElement(By.linkText("Privacy")).click();
		
//		driver.close();
		driver.quit();
	}

}
