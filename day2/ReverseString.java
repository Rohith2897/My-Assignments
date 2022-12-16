package week1.day2;

import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Rohith";
		
		char[] charArray = name.toCharArray();
		
		for (int i= charArray.length-1; i >=0; i--)
			
		System.out.print(charArray[i]);
	}

}
