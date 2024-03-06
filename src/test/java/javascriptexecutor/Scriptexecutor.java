package javascriptexecutor;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scriptexecutor {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		WebElement ele=driver.findElement(By.id("name"));
		ele.click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		//ele.sendKeys("shoes");
		//WebElement searchBtn=driver.findElement(By.id("nav-search-submit-button"));
		//searchBtn.click();
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<5;i++)
		{
			js.executeScript("window.scrollBy(0,900)");
			Thread.sleep(2000);
		}
		for(int i=0;i<5;i++)
		{
			js.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(2000);
		}*/
		
		
       // Point loc=ele.getLocation();
        //int x=loc.getX();
        //int y=loc.getY();
        //System.out.println(x+" "+y);
       // JavascriptExecutor js=(JavascriptExecutor)driver;*/
        //js.executeScript("window.scrollBy("+x+","+y+")");
        //js.executeScript(" window.location=arguments[0]",url)
        //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

}  
