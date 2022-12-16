package week1.day2;


public class Charactercount {

	public static void main(String[] args) {
		

		String company = "Hexaware";
		
		// expected count = 'e' print how many character
		
		char[] charArray = company.toCharArray();
		
		int count = 0;
		for (int i = 0; i<=charArray.length-1; i++)
			
			if(charArray[i] == 'e')
				count++;
			
			System.out.println(count);
	}

}
