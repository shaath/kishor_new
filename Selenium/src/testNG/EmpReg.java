package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpReg extends TestNGMaster
{
	@Test(dataProvider="data")
	public void org_Empreg(String x, String y)
	{
		expval=x+" "+y;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(x);
		driver.findElement(By.id("lastName")).sendKeys(y);
		driver.findElement(By.id("btnSave")).click();
		
		actval=driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).getText();
		Assert.assertEquals(actval, expval, "Empreg Failed");
	}
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] d=new Object[3][2];
		
		d[0][0]="Venki";
		d[0][1]="Ch";
		
		d[1][0]="Vikram";
		d[1][1]="Reddy";
		
		d[2][0]="Nagaraju";
		d[2][1]="K";
		
		return d;
	}

}
