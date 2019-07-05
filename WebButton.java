package DesginPatterns_Factory;

import org.openqa.selenium.WebElement;

public class WebButton implements Buttons{

	@Override
	public void button(WebElement element) {
		
		element.click();
		
	}

	@Override
	public void checkboc(WebElement element) {
		// TODO Auto-generated method stub
		
	}

}
