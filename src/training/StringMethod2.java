package training;

public class StringMethod2 {
	public static void main(String[] args) {
		String para = "hello my name is Vaibhav. and i am teaching you java and i am a trainer.";
		// how many character are there in string para 
		// how many word are there in string para
		//	int lettercount = para.length();
		//	System.out.println(lettercount);

		String[] splittedArray = para.split(" ");
		//	System.out.println(splittedArray.length);


		// substring method


		int in1 = para.indexOf('n');
		int in2 = para.indexOf('v');
		String s = para.substring(in1, in2+1);
		//	System.out.println(s);

		int k  = 20;
		int m =  30;
		System.out.println(k + m); // 50
		
		String k1 = String.valueOf(k);
		String m1 = String.valueOf(m);
		System.out.println(k1 + m1);
		
//		
//		String i1 = "10";
//		String i2 = "20";
//		String i3 = i1 + i2;
//		//	System.out.println(i3);
//
//		// datatype to string
//		String k1 = String.valueOf(k);
//		System.out.println(k1);
//
//		// String to datatype
		String m6 = "30";
		int l = Integer.parseInt(m6);

		String m16 = "true";
		boolean l1 = Boolean.parseBoolean(m16);
		System.out.println(l1);
	}
}
