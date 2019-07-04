package DesginPatterns_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriver12 extends Instances{
	
	@Override
	public WebDriver getDriver() {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "src\\test\\java\\Drivers\\chromedriver.exe");
         return new ChromeDriver();
	}

}
