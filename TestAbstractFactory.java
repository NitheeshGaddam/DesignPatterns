package DesginPatterns_Factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestAbstractFactory {

	public static void main(String[] args) {
		
		Instances instance=FactoryCreater.getFactory("instance").getInstance("chrome");
		WebDriver driver=instance.getDriver();
		
		driver.get("https://unifiedportal-mem.epfindia.gov.in/memberinterface/");
		
		
		Buttons button=FactoryCreater.getFactory("webbutton").getButton("webbutton");
		button.button(driver.findElement(By.xpath("//button[@type='submit']")));
	}
	
}
