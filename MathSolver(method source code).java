
public class PhysicsMathSolver {
	//this is similar to MP1 except im doing it recursively
	/**
	 * @param n the number you want the factorial of
	 * @return the final product
	 */
	public static int recFactorial(final int n) {
		if(n < 0) { // exception case
			return -1;
		}
		if(n == 0 || n == 1) {
			return 1;
		}
		return n*recFactorial(n-1);
	}
	/**
	 * @param n the sequence number
	 * @return the value of that sequences fibbonaci
	 */
	public static int fibMaster(final int n) {
		if (n < 0) { //exception case
			return -1;
		}
		if (n == 0) { //edge case
			return 0;
		}
		if (n == 1) { //base case
			return 1;
		} else {
			return fibMaster(n-1) + fibMaster(n-2);
		}
	}
	/**
	 * @param n the number which is supposedly prime only greater than 1
	 * @return if the number is prime or not
	 */
	public static boolean isPrime(final int n) {
		if (n <= 1) {
			System.out.println(n + " is not a valid number");
			return false;
		}
		for(int i=2;2*i<n;i++) {
	        if(n % i ==0) {
	        	System.out.println(n + " is not prime");
	            return false;
	        }
	    }
		System.out.println(n + " is prime");
		return true;
	}
	/**
	 * @param a var1
	 * @param b var2
	 * @return the gcd
	 */
	public static int gcd(int a, int b) {
		if (a < 0 || b < 0) {
			System.out.print("don't accept values that are less than 0");
			return -1;
		}
	    if (a == 0 || b == 0) { //edge case
	       return 0;
	    }
	    if (a == b) { //base case
	        return a;	
	    }
	    if (a > b) {
	        return gcd(a-b, b);
	    } else {
	    return gcd(a, b-a);
	    }
	}
	public static void main(String[] args) {
		int a = recFactorial(4);
		int b = fibMaster (4);
		System.out.println("" + a + "\n" + b);
		isPrime(11);
		isPrime(15);
		isPrime(-1);
		int c = gcd(16,24);
		System.out.println("" + c);
	}
}
