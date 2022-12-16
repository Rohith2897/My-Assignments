package week1.day1;

public class FibbinocciSeries {

	public static void main(String[] args) {
		
		int n = 11, firstnum = 0, secondnum = 1;
	    System.out.println("Fibonacci Series");

	    for (int i = 1; i <= n; i++) {
	      System.out.print(firstnum);

	    
	      int sum = firstnum + secondnum;
	      firstnum = secondnum;
	      secondnum = sum;
	      
	
	}
}
}
