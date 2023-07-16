package java_program;

public class Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10 , FirstTerm=0, SecondTerm=1 ;
		System.out.println("Fibonacci Series till " + n + " terms:");
		for(int i=1; i<=n; ++i ) {
			System.out.print(FirstTerm + ", ");

		      // compute the next term
		      int nextTerm = FirstTerm + SecondTerm;
		      FirstTerm = SecondTerm;
		      SecondTerm = nextTerm;
		}
	}

}
