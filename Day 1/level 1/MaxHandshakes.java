import java.util.*;

public class MaxHandshakes {
    public static void main(String[] args) {
		
		//taking input of number of students 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
		
		//calculating handshakes
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println("The maximum number of handshakes is " + handshakes);
    }
}
