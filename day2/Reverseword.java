package week1.day2;

public class Reverseword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Amazon development center, Chennai";
		String[] split = name.split(" ");
		// char[] charArray = name.toCharArray();
		
		
	/*	String a = "Amazon development center";
		String b = "Chennai";
		a.toLowerCase();
		b.toLowerCase();
		*/
		for (int i = split.length-1; i>=0; i--)
			
		System.out.print(split[i].toLowerCase()+ " ");
	}

}
