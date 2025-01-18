import java.util.*;

class isPalindrome{
  public static void main(String args[]){
  
  //taking input of string
  Scanner sc = new Scanner (System.in);
  
    String s = sc.nextLine();
	String ans = "";
	
	//reversing the string
	for(int i = s.length()-1; i>=0 ; i--){
		ans+=s.charAt(i);
	}
	
	//checking if both string is equal and printing result
	if(s.equals(ans)){
	System.out.println(" string is palindrome ");
	}else{
	System.out.println(" string is not palindrome ");
	}
  }


}