import org.openqa.jetty.http.SSORealm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Task {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://24hoursfitness.com");
		driver.manage().window().maximize();
		
		
		WebElement gym=driver.findElement(By.linkText("Gym Pass"));
		
		if (gym.isDisplayed()) 
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
