package popuppackage;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demo.automationtesting.in/Register.html#google_vignette");
		driver.findElement(By.xpath("//a[text()='SwitchTo']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Windows']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(2000);
		Set<String> s1=driver.getWindowHandles();
		for(String str : s1)
		{
			driver.switchTo().window(str);
			String title=driver.getCurrentUrl();
			if(title.contains("Selenium"))
			{
				break;
			}
			
		}
		WebElement ele=driver.findElement(By.xpath("//h1[@class='d-1 fw-bold']"));
		ele.getText();

		
	}

}
