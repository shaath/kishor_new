package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;

public class Drag_DropEg {

	public static void main(String[] args)
	{
//		WebDriver driver=new FirefoxDriver();
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		
		WebDriver driver=new FirefoxDriver(fp);
		
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
//		driver.switchTo().frame(0);
//		List<WebElement> list=driver.findElements(By.tagName("iframe"));
		WebElement frame=driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(frame);
		
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(drag, drop).build().perform();
		
	}

}
