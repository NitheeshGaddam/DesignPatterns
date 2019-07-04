package DesginPatterns_Singleton;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverInitialization_Singleton {
	
	private static DriverInitialization_Singleton DriverInitialization=null;
	private WebDriver driver;
	private DriverInitialization_Singleton(String browser) {
		
		 if(browser.equals("chrome"))
	        {
	                        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\Drivers\\chromedriver.exe");
	                        driver=new ChromeDriver();
	                     
	        }else if(browser.equals("IE")) {
	                        System.setProperty("webdriver.ie.driver", "src\\test\\java\\Drivers\\IEDriverServer.exe");
	                        driver= new InternetExplorerDriver();
	        }
		
	}
	
	public static DriverInitialization_Singleton getInstance(String browser) {
		
		if(DriverInitialization==null) {
			DriverInitialization=new DriverInitialization_Singleton(browser);
		}
		return DriverInitialization;
	}
	

	
	public WebDriver getDriver() {
		return driver;
	}

}
