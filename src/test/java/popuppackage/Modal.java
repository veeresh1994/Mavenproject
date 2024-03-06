package popuppackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui/modal?sublist=0");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//section[text()='Modal']")).click();
		driver.findElement(By.xpath("//button[text()='Open Modal']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='close']")).click();
		

	}

}
