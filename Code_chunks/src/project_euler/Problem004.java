package project_euler;


/**
 * Problem 4
 * 
 * Largest palindrome product
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * @author periklis
 */
public class Problem004 {

	public static void main(String[] args)
	{
		int solution = palindrome();
		System.out.println(solution);
	}
	
	private static int palindrome()
	{
		int total = 0;
		for (int i = 999; i >= 900; i--){
			for (int j = 999; j >= 900; j--)			{
				total = i * j;
				String string = Integer.toString(total);
				String stringb = new StringBuffer(string).reverse().toString();
				if (string.equals(stringb))
					return total;
			}
		}
		return 0;
	}
}