import java.util.*;

class CheckLargest{


public static void main (String args[]){


//taking number1,number2,number3 as input from user
Scanner input = new Scanner (System.in);

int number1 = input.nextInt();
int number2 = input.nextInt();
int number3 = input.nextInt();

boolean ans1 = false;
boolean ans2 = false ;
boolean ans3 = false;

//checking if number1 us largest
if(number1 > number2 && number1 > number3 ) {
  ans1 = true;
}
//checking if number2 is largest
if(number2 > number1 && number2 > number3 ) {
  ans2 = true;
}

//checking if number3 is largest
if(number3 > number2 && number3 > number1) {
  ans3 = true;
}

System.out.println( "is the first number the largest ? " + ans1 );
System.out.println( "is the second number the largest ? " + ans2 );

System.out.println( "is the second number the largest ? " + ans3 );


}
}