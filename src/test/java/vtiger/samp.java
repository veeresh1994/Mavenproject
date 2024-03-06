package vtiger;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.beust.jcommander.Strings;

public class samp 
{
	public static void main(Strings[]args)
	{
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("http://rmgtestingserver:8888/");
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.xpath("//a[text()='Organizations']")).click(); 
	driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("IBM");
	WebElement ele=driver.findElement(By.xpath("//select[@name='industry']"));
	Select sel=new Select(ele);
	sel.selectByVisibleText("Banking");
	WebElement ele1=driver.findElement(By.xpath("//select[@name='accounttype']"));
	Select sel1=new Select(ele1);
	sel1.selectByVisibleText("Investor");
	driver.findElement(By.xpath("//div[@align='center']/input[1]")).click();
    WebElement e1=driver.findElement(By.xpath("//span[text()='[ ACC1480 ] IBM -  Organization Information']"));
	String s=e1.getText();
	if(s.contains("IBM"))
	{
		System.out.println("Organization is created");
	}
	driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
	driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	
	}
}
