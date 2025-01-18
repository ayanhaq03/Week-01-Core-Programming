import java.util.*;


class removeDuplicate{


public static void main(String args[]){


 Scanner sc = new Scanner(System.in);
 
 String s = sc.nextLine();

 HashSet <Character> st = new HashSet <>();
 
 for(int i = 0 ; i<s.length() ;i++){
    st.add(s.charAt(i) );
 }
 
 String ans = "";
 for(char i : st){
  ans+=i ;
 }

System.out.println("updated string after removing duplicate is " +ans);
}

}