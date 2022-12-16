package week1.day2;

public class Duplicatenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = { 2, 5, 7, 7, 5, 9, 2, 3};
		
		for (int i = 0; i<nums.length; i++)
			for (int j = 0; j<nums.length; j++)
		{
			if (i !=j)
				if (nums[i]== nums[j])
					System.out.println(nums[i]);
		}
	}

}
