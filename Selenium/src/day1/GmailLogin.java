package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailLogin {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		WebElement email=driver.findElement(By.id("identifierId"));
		
		email.sendKeys("testingtoolstrainer449");
		
//		email.clear();
		
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		
//		Sleeper.sleepTightInSeconds(5);
		
		driver.findElement(By.name("password")).sendKeys("123456799");

		driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
	}

}
