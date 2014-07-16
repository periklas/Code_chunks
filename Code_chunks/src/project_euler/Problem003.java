package project_euler;

/**
 * Problem 3
 * Largest prime factor
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * 
 * @author periklis
 *
 */
public class Problem003 {
	public static void main(String[] args) {
        int out = 0;
        long m = 600851475143l;
        for (int n = 3; n < m; n += 2) {
            while (m % n == 0) {
                out = n;
                m = m / n;
            }
        }
        System.out.println("" + ((m == 1)?out:m));
    }

}
