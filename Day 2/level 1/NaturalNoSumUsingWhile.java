import java.util.*;

class NaturalNoSumUsingWhile{


  public static void main(Strings []args){
   
   //taking input
   Scanner input = new Scanner (System.in);
   
   int number = input.nextInt();
   int sum1 = 0;
   int sum2 = 0;
   //checking if the number is greater than 0 or not
   if(number<=0){
	   System.out.println("enter a greater value");
   }else{
	   int i = 0;
	   
	   //sum using while loop
	   while(i<=number){
	   sum+=i
	   i++
	   }
	   
	   //sum using formula
	   int sum2 = number * (number + 1) / 2;
	   
	    System.out.println("Sum using while loop  " + sum1);
            System.out.println("Sum using formula " + sum2);
			
			 if (sum1 == sum2) {
                System.out.println("Both sum are correct.");
            }
	   
   }