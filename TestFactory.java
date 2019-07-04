package DesginPatterns_Factory;

public class TestFactory {

	public static void main(String[] args) {
		
		GetInstanceFactory gf=new GetInstanceFactory();
		
		
		//Type of IE Instance
		gf.instanceType("ie").getDriver();
		//Type of Chrome Instance
		gf.instanceType("chrome").getDriver();
				
	}
	
}
