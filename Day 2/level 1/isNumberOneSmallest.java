import java.util.*;

class isNumberOneSmallest {

public static void main (String args[]){


//taking number1,number2,number3 as input from user
Scanner input = new Scanner (System.in);

int number1 = input.nextInt();
int number2 = input.nextInt();
int number3 = input.nextInt();
boolean ans = false ;
if(number1<number2 && number1 < number3 ){
   ans = true;
}

System.out.println("is the first number the smallest ? " + ans);

}

}