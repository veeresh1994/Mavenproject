package kayakflights;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flightbooking {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000)) ;
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.kayak.co.in/stays?lang=en&skipapp=true&gclid=EAIaIQobChMIyuHa0YWIhAMV1Bh7Bx1hFADJEAAYASAAEgJOd_D_BwE");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Flights']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='vvTc-item-button']")).click();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//input[@placeholder='From?']"));
		ele.sendKeys("Bengaluru");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Bengaluru (BLR)']/../div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='To?']")).sendKeys("Mumbai",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Fri 1/3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Friday 1 March, 2024']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Fri 8/3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Friday 8 March, 2024']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
		
		
		
		
		
		
		
		
		

	}

}
