package java_program;

import java.util.Scanner;

public class ScannerClassHelpof_printthetable {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.print("enter the number for print the table \n:");
			int a=sc.nextInt();
			int i=1;
			System.out.print("Start the given number of the table \n");
			while(i<=10) {
				System.out.printf(" %d * %d = %d \n",a,i,a*i);
				i++;
			}
		}
	}

}
