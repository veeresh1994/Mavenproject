package popuppackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pop {
	public static void main(String[] args) throws InterruptedException 
	{
		//ChromeOptions option = new ChromeOptions();
		//option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-align-justify']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='BUSES']")).click();
		Thread.sleep(2000);
		/*WebElement ele=driver.findElement(By.xpath("//input[@placeholder='Depart From']"));
		ele.click();
		ele.sendKeys("Banglore");
		Thread.sleep(2000);
		WebElement ele2=driver.findElement(By.xpath("//input[@placeholder='Going To']"));
		ele2.click();
		ele2.sendKeys("Delhi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Search Bus ']")).click();
		/*Alert ale= driver.switchTo().alert();
		/*ale.sendKeys("Yes");
		Thread.sleep(2000);
		ale.accept();
		Thread.sleep(2000);
		ale.dismiss();*/
		
	}

}
