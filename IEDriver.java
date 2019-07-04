package DesginPatterns_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriver extends Instances{

	
	@Override
	public WebDriver getDriver() {
		 System.setProperty("webdriver.ie.driver", "src\\test\\java\\Drivers\\IEDriverServer.exe");
         return  new InternetExplorerDriver();
	}

}
