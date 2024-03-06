package headless;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Launch2window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ChromeOptions option = newChromeOptions();
		option.addArguments("--incognito");*/
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
		//driver.switchTo().newWindow(WindowType.WINDOW);
		//driver.switchTo().newWindow(WindowType.TAB);
		//WebDriver driver1=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//driver1.get("https://www.amazon.com/");*/
		WebElement ele=driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("Lenova");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.alertIsPresent());
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		//wait.until(ExpectedConditions.visibilityOf(ele));
		//wait.until(ExpectedConditions.titleContains(null));
		//wait.until(ExpectedConditions.elementToBeSelected(ele));
		/*Fluent wait
		FluentWait wt=new FluentWait(driver);
		wt.pollingEvery(Duration.ofSeconds(200));
		wt.ignoring(NoAlertPresentException.class);
		wt.until(ExpectedConditions.elementToBeClickable(ele));*/
		
				
				

	}

}
