import java.util.*;

class SumUntilBreak{

public static void main(String [] args){
Scanner input = new Scanner (System.in);

double total = 0.0;
System.out.println("enter the value");
double value = input.nextDouble();

while(true){
 if(value<=0){
 break;
 }
 total+=value ;
 value = input.nextDouble();
 
}

 System.out.println("total sum is " + total );

}
}