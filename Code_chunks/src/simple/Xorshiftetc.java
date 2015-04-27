package simple;


public class Xorshiftetc {
/**
 * @author periklas
 * Simple addition, shift and rotate.
 */
	public static void main(String[] args){
	

	int x0 = 2 + 3;
	int x1 = 5 >>> 3;
	int x2 = 4 ^ 2;
	
	int x21 = 4 ^ 2;
	int x11 = 5 >>> 3;
	int x01 = 2 + 3;
	
	System.out.println(x0 + "a  ");
	System.out.println(x1 + "a  ");
	System.out.println(x2 + "a  ");
		
	System.out.println(x01 + "aA  ");
	System.out.println(x11 + "aA  ");
	System.out.println(x21 + "aA  ");
	 }
	
}
