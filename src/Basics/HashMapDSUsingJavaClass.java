package basics;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDSUsingJavaClass {

	public static void main(String[] args) {
		
		HashMap<Integer, String> mapName = new HashMap<>();
		mapName.put(1, "Abc");
		mapName.put(2, "def");
		
		System.out.println(mapName.get(1));
		
		Set<Entry<Integer,String>> setEntry = mapName.entrySet();
		for(Entry<Integer,String> entry:setEntry) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

	}

}
