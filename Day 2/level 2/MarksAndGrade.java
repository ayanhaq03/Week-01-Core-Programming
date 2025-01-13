import java.util.*;
public class MarksAndGrade{
    public static void main(String [] args){
	    //taking input
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter marks of maths");
		double mathMarks=sc.nextDouble();
		System.out.println("Enter marks of physics:");
		double phyMarks=sc.nextDouble();
		System.out.println("Enter marks of Chemistry ");
		double chemMarks=sc.nextDouble();
		
	    double Percent= (mathMarks+phyMarks+chemMarks)/3;
		
		if(Percent>=80){
		System.out.println(Percent +" Level 4");
		}
		 
		 else if(Percent>=70 && Percent<=79){
		 System.out.println(Percent +" Level 3");
		 }
		 
		 else if(Percent>=60 && Percent<=69){
		 System.out.println(Percent +" Level 2");
		 }
		 
		 else if(Percent>=50 && Percent=59){
		 System.out.println(Percent" Level 1");
         }
		 
		 else if(Percent>=40 && Percent<=49){
		 System.out.println(Percent +" Level 1");
         }
		 
		 else if(Percent>=0 && Percent=39){
		 System.out.println(Percent +" Remedial Standards");
         }
		 
	}
}