package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users/Dell\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
	}

}
