package java_program;

public class StringDuplicateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	 int num[]= {2,4,5,7,6,8,5,0,8,9,6,4,11,13,14,13,16};
	 int[] arr=new int[num.length];
	 int count=0;
	 for(int i=0; i<num.length;i++) {
		 boolean Duplicate =false;
		 for(int j=0;j<count;j++) {
			 if(num[i]==arr[j]) {
			  Duplicate=true; 
			  break;
		 }
	 }
	if(!Duplicate) {
		arr[count]= num[i];
		count++;
	}
	System.out.print(arr[i]);
	}
	 
	 }

}
