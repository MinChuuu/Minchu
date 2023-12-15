package com.java.collection;

import java.util.Map;
import java.util.TreeMap;

public class Exercise_Map {

	public static void main(String[] args) {
		
		//System.out.println('A'+3);
		
		Map<String, Integer> map = new TreeMap<String,Integer>();
		map.put("허준호", 123);
		map.put("김대호", 456);
//		map.put("c", 'A');
//		map.put("d", "A");
//		map.put("e", true);
//		map.put("f", 789f);
		
//		for(int i = 0; i<map.size(); i++) {
//			char temp = 'a';
//			String key = "" + (char)(temp + i);
//		
//			System.out.println("key: "+ key + ", value: " + map.get(key));
//		}
		
		System.out.println(map);

	}

}
