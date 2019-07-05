package DesginPatterns_Factory;

public class InstanceFactory extends AbstractFactory{

	@Override
	Instances getInstance(String type) {

		 if(type.equalsIgnoreCase("ie"))
            return new IEDriver();  
        else if(type.equalsIgnoreCase("chrome"))
       	 return new ChromeDriver12();   
		 
		 return null;
	}

	@Override
	Buttons getButton(String type) {
		// TODO Auto-generated method stub
		return null;
	}

}
