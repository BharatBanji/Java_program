package java_program;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       @SuppressWarnings("resource")
	Scanner sc= new Scanner(System.in);
       System.out.print("Enter the number : ");
       int a=sc.nextInt();
       if(a%2==0) {
           System.out.println("this given number is Even");
       }
       else {
           System.out.println("this given number is odd");
       }
	}

}
