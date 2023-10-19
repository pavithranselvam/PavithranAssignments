package homeWorks.Day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a=0,b=1,c,Range=6;
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i < Range; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			
		}
		

	}

}
