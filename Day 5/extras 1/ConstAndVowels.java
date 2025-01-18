import java.util.*;


class ConstAndVowels{

public static void main (String args[]){

  Scanner sc = new Scanner(System.in);
  
  String s = sc.nextLine();
  int conCount = 0 ;
  int vowCount = 0 ;
  for(int i = 0 ; i<s.length();i++){
    if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i' ||s.charAt(i)=='o' || s.charAt(i)=='a'){
	  conCount++;
	}else{
	   vowCount++;
	}
  }
  
  System.out.println("number of vowels in string is "+vowCount+ " and number of consonant in string is " +conCount);
}
}