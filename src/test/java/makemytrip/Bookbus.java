package makemytrip;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Bookbus {

	public static void main(String[] args)  {
		//System.setProperty("webdriver.chrome.driver","./softwares/chrimedriver.exe");
		//try {
		WebDriver driver=new ChromeDriver();
		//catch(Exception e)
		//e.printStackTrace();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.get("https://www.makemytrip.com/");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chBuses']")).click();
		//Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("//input[@id='fromCity']"));
		e.click();
		//Thread.sleep(2000);
		e.sendKeys("Pune");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Pune, Maharashtra']")).click();
		//Thread.sleep(2000);
		WebElement e1=driver.findElement(By.xpath("//input[@id='toCity']"));
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(e1));*/
		e1.click();
		//Thread.sleep(2000);
		e1.sendKeys("Delhi");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Delhi']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='bussw_inner']/div[3]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[1]/div[3]/div[2]/div[1]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
	}

}
