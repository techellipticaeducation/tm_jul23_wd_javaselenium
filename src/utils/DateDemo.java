package utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
public static void main(String[] args) {
	Date dt = new Date();
	System.out.println(dt);
	
	
	// Format
	// 22-Aug-2023     dd-MMM-yyyy
	// 22-10-2023      dd-MM-yyyy
	// 2023-10-22      yyyy-MM-dd
	// 2023-22-10      yyyy-dd-MM
	// 22-August-2023  
	
	SimpleDateFormat fb = new SimpleDateFormat("dd-MMM-yyyy");
	String jk = fb.format(dt);
	System.out.println(jk);
	
	File fl  = new File
			("C:\\Users\\Vaibhav\\Desktop\\TechElliptica\\testometer_20sep\\dem\\"+jk);
	fl.mkdir();
	
}
}
