package DesginPatterns_Singleton;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Propertiesfile_Singleton {
	
	private static Propertiesfile_Singleton propertiesfile;
	private Properties p;
	
	private Propertiesfile_Singleton() throws Exception {
		
		File file = new File(System.getProperty("user.dir")+"\\src\\main\\java\\Factory\\TestData.properties");		
		FileInputStream fis = new FileInputStream(file);		
		p = new Properties();
		p.load(fis);
		
	}
	
	public static Propertiesfile_Singleton getInstanceOfProp() throws Exception {
		
		if(propertiesfile==null)
		 propertiesfile=new Propertiesfile_Singleton();
			return propertiesfile;
		
	}
	
	public String getProperty(String Property) throws Exception {		
				
		return p.getProperty(Property);
		
		
	}
	

}
