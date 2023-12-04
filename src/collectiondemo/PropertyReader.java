package collectiondemo;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.Set;

public class PropertyReader {
	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\Vaibhav\\git\\tm_jul23_wd_javaselenium\\qa.properties");
			Properties prop = new Properties();
			prop.load(new FileInputStream(file));
			
			Set<Object> allKeys = prop.keySet();
			for(Object key: allKeys) {
				System.out.println(key.toString()+" - "+prop.get(key));
			}
		}catch(Exception e) {

		}
	}
}
