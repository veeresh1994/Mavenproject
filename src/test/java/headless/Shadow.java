package headless;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4)) ;
		driver.manage().window().maximize();
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement element=(WebElement)js.executeScript("return document.querySelector('#userName')"
				+".shadowRoot.querySelector('#kils')");
		element.sendKeys("veeresh");*/
		WebElement shadowelement1=driver.findElement(By.xpath("//div[@id='userName']"));
		SearchContext shadowRoot1=shadowelement1.getShadowRoot();
		WebElement ele1=shadowRoot1.findElement(By.cssSelector("#kils"));
		ele1.sendKeys("username");
		WebElement shadowelement2=shadowRoot1.findElement(By.cssSelector("#app2"));
		SearchContext shadowRoot2=shadowelement2.getShadowRoot();
		WebElement ele= shadowRoot2.findElement(By.cssSelector("#pizza"));
		ele.sendKeys("hiii");
		WebElement shadowelement3=shadowRoot2.findElement(By.cssSelector("#concepts"));
		SearchContext shadowRoot3=shadowelement3.getShadowRoot();
		WebElement ele2= shadowRoot3.findElement(By.cssSelector("#training"));
		ele2.sendKeys("qwertyuio");
		
		

	}

}
