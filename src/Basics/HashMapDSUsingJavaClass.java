package basics;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDSUsingJavaClass {

	public static void main(String[] args) {

		// Hashmap creation
		HashMap<Integer, String> mapName = new HashMap<>();
		HashMap<Integer, String> mapName2 = new HashMap<>();
		mapName.put(1, "Abc");
		mapName.put(2, "def");
		mapName2.put(3, "Abc");
		mapName2.put(4, "def");
		mapName2.put(1, "Duplicate value");
		
		System.out.println("-----------------hashcodes ---------------------------------");
		Integer x = 5;
		System.out.println(x.hashCode());
		
		byte y = 10;
		
		Character c = 'c';
		System.out.println(c.hashCode());
		
		String s = "abc";
		System.out.println(s.hashCode());
		
		Double d = 2.5;
		System.out.println(d.hashCode());
		
		System.out.println("------------------------------------------");
		HashMap<Object, String> mapName3 = new HashMap<>();
		
		mapName3.put(x, "Abc");
		mapName3.put(c, "def");
		mapName3.put(s, "Abc");
		mapName3.put(d, "def");
		mapName3.put('x', "def");
		mapName3.put(y, "def");

		// Getting value based on key
		System.out.println(mapName.get(1));

		System.out.println("------------------------------------------");
		
		// Iterating values
		Set<Entry<Integer, String>> setEntry = mapName.entrySet();
		for (Entry<Integer, String> entry : setEntry) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		System.out.println("----------------To print in sorted order--------------------------");
		
		TreeMap<Integer, String> sortedHashmap = new TreeMap(mapName2);
		System.out.println(sortedHashmap.toString());
		
		System.out.println("------------------------------------------");
		
		System.out.println("toString method "+mapName3.toString());
		
		

		System.out.println("--------------------------");
		// Adding one map to another
		// The order is random
		// It can store duplicate values
		// Duplicate key not accepted
		mapName.putAll(mapName2);
		Set<Entry<Integer, String>> setEntry2 = mapName.entrySet();
		for (Entry<Integer, String> entry : setEntry2) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

		System.out.println("--------------------------");
		// Getting only Keys
		Set<Integer> setKey = mapName.keySet();
		for (Integer key : setKey) {
			System.out.println(key);
		}

		System.out.println("------------If Key exist--------------");
		System.out.println(mapName.containsKey(3));

		System.out.println("------------If Value exist--------------");
		System.out.println(mapName.containsValue("Abc"));

		System.out.println("---Size of Map-------------");
		System.out.println(mapName.size());

		mapName.clear();
		System.out.println("Map size after clearing " + mapName.size());

		mapName2.remove(4);
		System.out.println("Map size after removing 1 element from map2 is " + mapName2.size());

		mapName2.replace(1, "Replaced value");
		System.out.println("After replcaing value of key 1 is " + mapName2.get(1));

		// Change Capacity of Hashmap
		//Default capacity 16
		HashMap<Integer, String> map3 = new HashMap<Integer, String>(14);
		HashMap<Integer, String> map4 = new HashMap<Integer, String>(20);

		// Change Load Factor of Hashmap
		//Default Load factor 0.75
		HashMap<Integer, String> map5 = new HashMap<Integer, String>(14, 0.5f);
		
		//The constructor HashMap<Integer,String>(float) is undefined
		//HashMap<Integer, String> map6 = new HashMap<Integer, String>( ,0.5f);
		
	}

}
