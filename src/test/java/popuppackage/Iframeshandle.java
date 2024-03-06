package popuppackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframeshandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Nested with Multiple iframe']")).click();
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full h-96']")));
        Thread.sleep(2000);
        driver.switchTo().frame(0);
        Thread.sleep(2000);
        driver.switchTo().frame(0);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@gmail.com");
        driver.switchTo().parentFrame();
        driver.switchTo().frame(1);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin@1234");
        driver.switchTo().parentFrame();
        driver.switchTo().frame(2);
        driver.findElement(By.xpath("//input[@id='confirm']")).sendKeys("admin@1234");
        driver.switchTo().parentFrame();
        driver.switchTo().frame(3);
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        Thread.sleep(5000);
        
        
        
	
	}
	

}
