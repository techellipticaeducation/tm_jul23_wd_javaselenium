package excep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(5) ;
		ls.add(625); 
		ls.add(4) ;
		ls.add(2) ;
		ls.add(25);
		maxSetSize(ls);
	}
	
	static List<String> allComb = new ArrayList<String>();
	public static int maxSetSize(List<Integer> riceBags) {


		int arr[] = new int[riceBags.size()];
		int index = 0;
		for(int k : riceBags){
			arr[index] = k;
			System.out.println(arr[index]);
			index++;
		}
		
		for(int i = 2; i <= arr.length ; i++){
			int r = i;
			int n = arr.length;
			printCombination(arr, n, r);
		}
		
		System.out.println(allComb.toString());
		int maxRange = -1;
		for(String comb : allComb){
			String[]  arr1  = comb.split(" ");
			List<Integer> lk = new ArrayList<Integer>();
			for(String s : arr1){
				if(s.trim().length() != 0){
					lk.add(Integer.parseInt(s));
				}
				Collections.sort(lk);
			}
			boolean found = true;
			for(int k = 0 ; k < lk.size()-2 ; k++){
				if((lk.get(k) * lk.get(k)) != lk.get(k+1)){
					found = false;
				}
			}
			if(found){

				maxRange = lk.size();
			}

		}

		return maxRange;

	}

	static void combinationUtil(int arr[], int data[], int start,
			int end, int index, int r)
	{
		String ls = "";
		if (index == r)
		{
			for (int j=0; j<r; j++)
				System.out.print(data[j]);
				//ls= ls  + data[j]+" ";
//			allComb.add(ls);
			System.out.println();
			return;
		}
		for (int i=start; i<=end && end-i+1 >= r-index; i++)
		{
			data[index] = arr[i];
			combinationUtil(arr, data, i+1, end, index+1, r);
		}
	}
	static void printCombination(int arr[], int n, int r)
	{
		int data[]=new int[r];
		combinationUtil(arr, data, 0, n-1, 0, r);
	}

}
