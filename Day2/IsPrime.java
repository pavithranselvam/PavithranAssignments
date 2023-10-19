package homeWorks.Day2;

public class IsPrime {

	public static void main(String[] args) {
		
		int num = 10;
	    boolean num1 = false;
	    for (int i = 2; i < num / 2;i++) {
	    		
	      if (num % i == 0) {
	        num1 = true;
	        break;
	      }
	    }

	    if (num1)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }
			
		
	}


