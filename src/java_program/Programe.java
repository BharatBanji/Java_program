package java_program;

public class Programe {

				public static void main(String[] args) {
				// TODO Auto-generated method stub
				Programe a = new Programe();
				  a.star();
				  a.swap();
				

			}
			public void swap() {
				int a = 5;
				int b = 10;
				System.out.println(a);
				System.out.println(b);
				a = b+a;
				b = a-b;
				a = a-b;
				System.out.println(a);
				System.out.println(b);
				
			}
			
			public void star() {
				for (int i = 1; i<5; i++) {
					for (int j = 0;j<i; j++) {
					System.out.print("*");
					}
				    System.out.println("");
				    }
			}

		}
	



