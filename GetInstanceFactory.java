package DesginPatterns_Factory;

import org.openqa.selenium.WebDriver;

public class GetInstanceFactory {

	public Instances instanceType(String type)
	{
		 if(type.equalsIgnoreCase("ie"))
             return new IEDriver();  
         else if(type.equalsIgnoreCase("chrome"))
        	 return new ChromeDriver12();   
		 
		 return null;
	}
	
}
