import java.util.*;


class findLength{
 
 //method to find length using exception handlling
 public static int lengthOfStr(String s){
  int count = 0;
  int i = 0;
 while(true){
 
 try{
    s.charAt(i);
    count++;
	i++;
   }catch (Exception e){
     System.out.println("index out of bound ");
	 return count;
   }
 }
 
 }
 


 
 
 public static void main (String args[]){
   
   //taking input from user
   Scanner sc = new Scanner(System.in);
   
   String str = sc.next();
   
   
   
   System.out.println(lengthOfStr(str));
   System.out.println(str.length());
  
  
 }

}