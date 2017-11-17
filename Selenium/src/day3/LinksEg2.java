package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg2 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		driver.manage().window().maximize();
		
//		WebElement block=driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td"));
//		
//		List<WebElement> links=block.findElements(By.tagName("a"));
//
//		System.out.println(links.size());
//		
//		for (int i = 0; i < links.size(); i++)
//		{
//			String name=links.get(i).getText();
//			if (name.equalsIgnoreCase("home"))
//			{
//				links.get(i).click();
//				break;
//			}
//		}
		driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td")).findElement(By.linkText("Home")).click();
	}

}
