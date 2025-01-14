import java.util.*;


class toUpperCaseString{
 
 
  public static String convertToUpper(String s ){
     String ans = "";
    for(int i = 0 ; i<s.length() ;i++){
	 if((int)s.charAt(i)>=97){
	   int x = (int)s.charAt(i)-32 ;
	   ans+=(char)x;
	 }else{
	   ans+=s.charAt(i);
	 }
	}
	
	return ans;
  }
  
  public static boolean compareString(String s1 , String s2 ){
    boolean ans = true;
	
	if(s1.length()!=s2.length()){
	  return false;
	}
	for(int i = 0 ; i<s1.length() ; i++){
	  if(s1.charAt(i)!=s2.charAt(i)){
	  ans = false;
	  }
	}
  return ans;
  }

  public static void main(String args[]){
   
    Scanner sc = new Scanner(System.in);
	
	String str = sc.nextLine();
	
	String ust1 = str.toUpperCase();
	System.out.println(ust1);
	 String  ust2 = convertToUpper(str);
	 System.out.println(ust2);
	 
	 if(compareString(ust1,ust2)){
	 System.out.println("both uppper case string are same");
	 }else{
	 	 System.out.println("both uppper case string are not same");

	 }
	 
   
  }

}