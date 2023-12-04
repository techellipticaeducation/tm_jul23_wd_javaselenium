package collectiondemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
public static void main(String[] args) {
	// word -> meaning
	// Key  -> value
	
	Map<String,String> mp = new HashMap<String, String>();
	mp.put("name", "abc");
	mp.put("class", "10th");
	mp.put("section", "A");
	mp.put("class", "11th");
	
//	System.out.println(mp.get("class"));
//	System.out.println(mp);
	
//	Set<String> keys = mp.keySet();
//	for(String key : keys) {
//		System.out.println(key + " - " + mp.get(key));
//	}
	
//	ENtry class

	for(Entry<String,String> entry : mp.entrySet()) {
		System.out.println(entry.getKey() + " - " + entry.getValue() );
	}
	
}
}
