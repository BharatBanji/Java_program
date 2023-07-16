package java_program;

import java.util.Scanner;

public class Table_withthefor_loops_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       @SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Reverse table number :");
       int num=sc.nextInt();
       for(int i=10;i>=1; i-- ) {
    	  System.out.printf("%d*%d=%d \n", num,i,num*i); 
       }
	}

}
