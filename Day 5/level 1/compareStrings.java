import java.util.*;

class compareStrings{

public static char[] charToArrayUser(String s){
  
 char [] arr =  new char[s.length()];
 for(int i = 0 ; i<s.length() ; i++){
  
  arr[i] = s.charAt(i);
   
 }
 
 return arr ;
}

public static boolean compareArrays(char [] arr1 , char[] arr2){
  if(arr1.length!=arr2.length){
  return false;
  }
   
   boolean ans = true;
  for(int i = 0 ; i < arr1.length ; i++){
   if(arr1[i]!= arr2[i]){
	   ans = false ;
   return ans;
   }
   
  
  }
  return ans;
}
public static void main (String args[]){
 
 
 Scanner sc = new Scanner(System.in);
 String str = sc.next();
 
 char [] arr1 = str.toCharArray();
 char [] arr2 = charToArrayUser(str);
 
 if(compareArrays(arr1,arr2)){
   System.out.println("both array are same");
 }else{
    System.out.println("both array are not same");

 }
 

}

}