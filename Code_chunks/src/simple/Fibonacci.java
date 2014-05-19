package simple;

/**
 * @author periklas
 * Simple Fibonacci solution
 */
public class Fibonacci {

	public static void main(String[] args) {
		fib();
	}

	//variables more than 91 cannot be hold by long int
	public static void fib(){
		long f =0, s=1, n = 2;
		for (int i = 0; i<91; i++){
			n= f+s;
			f=s;
			s=n;
			System.out.println(i+": "+ n);
		}

	}

}
