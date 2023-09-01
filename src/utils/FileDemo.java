package utils;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		
		String fol = MathDemo.getRandomName(30);
		File fl  = new File
				("C:\\Users\\Vaibhav\\Desktop\\TechElliptica\\testometer_20sep\\dem");
//		fl.mkdir();
		
		File[] files  = fl.listFiles();
		for(int i = 0 ; i < files.length ; i++) {
			File fl1 = files[i];
			System.out.println(fl1.getName() + "-" + (fl1.isDirectory()? "Folder":"File" ));
		}
		
	}
}
