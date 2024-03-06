package selpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTooltip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Sel-firstproject/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement element=driver.findElement(By.xpath("//a[text()='Cart']"));
		String Tooltip=element.getAttribute("title");
		System.out.println(Tooltip);
		
		/*To open an link in new tab
		String tab=Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.findElement(By.xpath("//a[@href='/account/login?signup=true&ret=/']")).sendKeys(tab);
		//To open new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.makemytrip.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com/");
		//To capture size and location of an element
		WebElement ele=driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chHotels']"));
		System.out.println(ele.getLocation());
		int x=ele.getLocation().getX();
		int y=ele.getLocation().getY();
        System.out.println(x);
        System.out.println(y);
        System.out.println(ele.getSize());
        System.out.println(ele.getSize().getHeight());
        System.out.println(ele.getSize().getWidth());*/
	}

}
