package DesginPatterns_Factory;

public class ButtonFactory extends AbstractFactory{

	@Override
	Instances getInstance(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Buttons getButton(String type) {
		 if(type.equalsIgnoreCase("webbutton"))
	            return new WebButton();
	        else if(type.equalsIgnoreCase("webcheckbox"))
	       	 return new WebCheckbox();
			 
			 return null;
	}

}
