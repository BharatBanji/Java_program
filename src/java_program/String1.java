package java_program;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 		String str = "racecar";
		boolean isPalindrome = true;
		for (int i = 0; i < str.length() / 2; i++) {
		    if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
		        isPalindrome = false;
		        break;
		    }
		}
		System.out.println(isPalindrome);
	}

}
