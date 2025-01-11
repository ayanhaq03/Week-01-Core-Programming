import java.util.*;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input ages and heights for Amar, Akbar, and Anthony
		
        System.out.print("Enter age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter height of Amar (in cm): ");
        int heightAmar = sc.nextInt();

        System.out.print("Enter age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter height of Akbar (in cm): ");
        int heightAkbar = sc.nextInt();

        System.out.print("Enter age of Anthony: ");
        int ageAnthony = sc.nextInt();
        System.out.print("Enter height of Anthony (in cm): ");
        int heightAnthony = sc.nextInt();

        // Determine youngest
        String youngest;
        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            youngest = "Amar";
        } else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }

        // Determine tallest
        String tallest;
        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            tallest = "Amar";
        } else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }

       
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        
    }
}