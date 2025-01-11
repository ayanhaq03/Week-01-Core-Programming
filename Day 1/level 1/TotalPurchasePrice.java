import java.util.*;

public class TotalPurchasePrice {
    public static void main(String[] args) {
		
		//taking input of quantity and unitprice from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter unit price of the item: ");
        double unitPrice = input.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
		
		//calculating total price
        double totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPrice +
                           " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
    }
}
