package genericLibrary;
import java.io.FileInputStream;
import java.util.Properties;

public class Propertyfile {
	
	public String getPropertydata(String key) throws Throwable
	{
		Properties p=new Properties();
		FileInputStream fis = new FileInputStream(IpathConstant.propertyfilepath);
		
		p.load(fis);
		return p.getProperty(key);
		
	}
}
