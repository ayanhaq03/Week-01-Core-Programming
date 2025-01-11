import java.util.*;

public class CustomDiscountedFee {
    public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the fee amount: ");
		
		//taking user input
        double fee = input.nextDouble();
        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();
		//calculating discount using discount Percent
        double discount = (discountPercent / 100) * fee;
		//calculating fee after applying discount
		
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);
    }
}
