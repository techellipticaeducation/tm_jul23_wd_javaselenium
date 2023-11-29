package collectiondemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test1 {
public static void main(String[] args) {
	
	Set<Integer> ls = new LinkedHashSet<Integer>();
	ls.add(1);
	ls.add(5);
	ls.add(8);
	ls.add(3);
	ls.add(5);
	ls.add(45);
	ls.add(65);
	ls.add(85);
	ls.add(15);
	ls.add(25);
	
	for(int i : ls) {
		System.out.println(i);
	}
	
	
}
}
