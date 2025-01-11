import java.util.*;

class CovertHeight{


public static void main (String args[]){

//input the height in centimeter
Scanner input = new Scanner (System.in);

System.out.println("enter the height in cm");
int heightInCm = input.nextInt();

//converting height into inches
double heightInInches = heightInCm/2.54 ;

//converting height into feet
double heightInFeet = heightInInches/12;

System.out.println("Your height in cm is "+heightInCm +" while in feet is " + heightInFeet + "and inches is " + heightInInches ) ;

}

}