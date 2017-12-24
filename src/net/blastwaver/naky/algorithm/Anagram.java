package net.blastwaver.naky.algorithm;

import java.util.HashMap;

public class Anagram {
	public static boolean isAnagram(String s1, String s2) {
		//1. sort (bad)
		//car -> acr
		//rac => acr
		//O (nlogn)
		//O(n)
		
		//2. Hashmap count
		
		
		if(s1.length() != s2.length())
			return false;
		
		HashMap<Character, Integer> map = new HashMap <>();
		
		for(char c:s1.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		
		for(char c:s2.toCharArray()) {
			if(!map.containsKey(c)) 
				return false;
			if(map.get(c) == 0) 
				return false;
			map.put(c, map.get(c) -1 );
		}
		
		return true;
	}
}
