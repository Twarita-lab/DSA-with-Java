package basics;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDSUsingJavaClass {

	public static void main(String[] args) {
		
		//Hashmap creation
		HashMap<Integer, String> mapName = new HashMap<>();
		HashMap<Integer, String> mapName2 = new HashMap<>();
		mapName.put(1, "Abc");
		mapName.put(2, "def");
		mapName2.put(3, "Abc");
		mapName2.put(4, "def");
		mapName2.put(1, "Duplicate value");
		
		//Getting value based on key
		System.out.println(mapName.get(1));
		
		//Iterating values
		Set<Entry<Integer,String>> setEntry = mapName.entrySet();
		for(Entry<Integer,String> entry:setEntry) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		System.out.println("--------------------------");
		//Adding one map to another
		//The order is random
		//It can store duplicate values
		//Duplicate key not accepted
		mapName.putAll(mapName2);
		Set<Entry<Integer,String>> setEntry2 = mapName.entrySet();
		for(Entry<Integer,String> entry:setEntry2) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		System.out.println("--------------------------");
		//Getting only Keys
		Set<Integer> setKey = mapName.keySet();
		for(Integer key:setKey) {
			System.out.println(key);
		}
		
		System.out.println("------------If Key exist--------------");
		System.out.println(mapName.containsKey(3));
		
		System.out.println("------------If Value exist--------------");
		System.out.println(mapName.containsValue("Abc"));

	}

}
