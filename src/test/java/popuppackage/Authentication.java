package popuppackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		String username="admin";
		String password="admin";
		String url="https://"+username+":"+password+"@"+"basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app";
		driver.get(url);

	}

}
