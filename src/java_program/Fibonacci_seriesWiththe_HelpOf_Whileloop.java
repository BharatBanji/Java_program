package java_program;

public class Fibonacci_seriesWiththe_HelpOf_Whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int i = 1, n = 10, firstTerm = 0, secondTerm = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    while (i <= n) {
	      System.out.print(firstTerm + ", ");

	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;

	      i++;
	    }
	}

}
