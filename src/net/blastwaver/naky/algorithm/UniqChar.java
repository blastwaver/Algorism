package net.blastwaver.naky.algorithm;
import java.util.HashSet;

public class UniqChar {
	public static boolean  isUniqChar(String s) {
		
		//1.boolean[] 
		//2. HashSet
		//3. double for loop (bad)
		
		
		HashSet<Character> set = new HashSet<Character>();
		
		for (char c:s.toCharArray()) {
			
			if(set.contains(c)) return false;
			
			set.add(c);
		}
		return true;
	}
}
