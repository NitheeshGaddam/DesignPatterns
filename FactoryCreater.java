package DesginPatterns_Factory;

public class FactoryCreater {

	  public static AbstractFactory getFactory(String type){  
	      if(type.equalsIgnoreCase("button")){  
	         return new ButtonFactory();  
	      } else if(type.equalsIgnoreCase("instance")){  
	         return new InstanceFactory();  
	      }  
	      return null;  
	   }  
	
}
