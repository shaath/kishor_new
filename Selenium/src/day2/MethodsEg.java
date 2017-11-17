package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MethodsEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
//		String title=driver.getTitle();
//		System.out.println(title);
		
//		String url=driver.getCurrentUrl();
//		System.out.println(url);
		
		System.out.println(driver.getPageSource());
	}

}
