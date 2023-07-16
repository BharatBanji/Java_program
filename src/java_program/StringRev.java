package java_program;

public class StringRev {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// there are two way declare into the string
		
		String str="bharat";
		
	// by using the keyword
		
		String str1=new String("bharat veer");
	
        String rev="Veer";	
	// one or more than one character
        // v
        // e
        // e
        // r
        
        // reverse the string 
        //System.out.print(rev.charAt(1));
        for(int i=rev.length()-1; i>=0; i--) {
        	System.out.println(rev.charAt(i));
        }

	
	// second way to print the reverse string
        System.out.print("reverse the String : ");
       for(int i=3; i>=0; i--) {
    	   
    	   String revValue=" ";
    	   
    	   revValue= revValue + rev.charAt(i);
    	   
    	   System.out.print(revValue);
    	   
       }

	}

}
