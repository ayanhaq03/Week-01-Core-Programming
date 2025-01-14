import java.util.*;

class createSubstring{

public static String createString(String str , int start , int end){
   
    String ans = "";
	
	while(start<end){
	
	ans+=str.charAt(start);
	start++ ;
	}
  
  
  return ans ;
}

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
   
   String str = sc.next();
   String str2 = sc.next();
   
   int i = 0 , j = 4 ;
   
  
   
   
   String subStr1  = str.substring(i,j);
   String subStr2 = createString(str2,i,j);
   
   if(CompareStrings(subStr1,subStr2)){
	System.out.println(" both are same ");
	}else{
	System.out.println(" both are different ");
	}
   
  
 
 }

}