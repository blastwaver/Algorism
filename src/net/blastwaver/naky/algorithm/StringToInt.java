package net.blastwaver.naky.algorithm;

public class StringToInt {

	public static int convert(String s) {
		char[] ca = s.toCharArray();
		int num = 0;
		for(char c:ca) {
			//123
			//1*10+2 =12
			//12*10+3 =123
				num *= 10;
				num += c - '0';		
		}
		return num;
	}
}
