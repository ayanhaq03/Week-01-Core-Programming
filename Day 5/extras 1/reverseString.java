import java.util.*;

class reverseString {
  public static void main(String args[]){
  
  //taking input fron user
  Scanner sc = new Scanner (System.in);
  
    String s = sc.nextLine();
	
	// taking empty string to concat character one by one
	String ans = "";
	
	for(int i = s.length()-1; i>=0 ; i--){
		ans+=s.charAt(i);
	}
	
	System.out.println("reversed string is "+ans);
  }


}