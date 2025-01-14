import java.util.*;


class StringCheck{
  //method to compare two strings
  public static boolean CompareStrings(String s1, String s2 ){
        boolean ans = true;
     for(int i = 0 ; i< s1.length(); i++){
	    if(s1.length()!= s2.length()){
		return false;
		}
	   if(s1.charAt(i)!=s2.charAt(i)){
	    ans  = false ;
		return ans;
	   }
	 }
	 
	  return ans;
  } 
	 
	
  
  

 
 
  public static void main (String args[]){
   
   Scanner sc = new Scanner(System.in);
   
   String s1 = sc.next();
   String s2 = sc.next();
   
   if(CompareStrings(s1,s2)){
     System.out.println("both strings are same ");
   }else{
   System.out.println("both strings are different");
   }
   if(s1.equals(s2)){
     System.out.println("both strings are same ");
   }else{
   System.out.println("both strings are different");
   }
  
  }
}