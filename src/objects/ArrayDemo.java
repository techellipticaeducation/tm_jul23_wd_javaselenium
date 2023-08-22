package objects;

public class ArrayDemo {

	public static void main(String[] args) {
		// school , 10th class (50 student) , - science , math, art, english, sst (5 subject)
		// every student and every subject marks
		// array = collection of ,object, datatype values , always provide same data type values
		int[][] mark = {
				{45,34,78,89,23},
				{78,89,23,89,23},
				{34,78,89,23,45},
				{45,34,78,89,23},
				{34,78,89,23,45},
				{78,89,23,89,23},
				{78,89,23,89,23},
				{34,78,89,23,45},
				{45,34,78,89,23},
				{78,89,23,89,23},
				{34,78,89,23,45},
				{78,89,23,89,23},
				{45,34,78,89,23},
				{78,89,23,89,23},
				{45,34,78,89,23},
				{45,34,78,89,23}
				};
		// student number 2 , 2nd subject
		System.out.println(mark[1][1]);
		// array are not dynamic in nature, 
		// When ever we are defining array (object creation) , we have to provide size to your array
		// object
		int[] mark1 = new int[2];
		mark1[1] = 90;
		
		//            0 , 1, 2 ,3, 4
		// indexing - 0 
		// size/length - 5 
		// upper-bound - (size-1)
		
//		System.out.println(mark.length);
		
		//System.out.println(mark[6]); // 56
		// If we are trying to access value more then array upper bound then we will get array index out of bound exception
		// 0 to 4
//		for(int i = 0 ; i < mark1.length ; i++) {
//			System.out.println(mark1[i]);
//		}
		
		// foreach loop
		
	}
	
}
