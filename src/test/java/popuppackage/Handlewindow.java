package popuppackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlewindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Multiple Tabs']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click to open multiple tabs']")).click();
		Thread.sleep(2000);
		Set<String> s1=driver.getWindowHandles();
		for(String str : s1)
		{
			driver.switchTo().window(str);
			String title=driver.getCurrentUrl();
			if(title.contains("SignUpPage"))
			{
				break;
			}
			
		}
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("bv188558@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.id("confirmPassword")).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign Up']"));
		
	}

}
