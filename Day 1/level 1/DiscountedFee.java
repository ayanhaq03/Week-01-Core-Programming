public class DiscountedFee {
    public static void main(String[] args) {
        // original fee of the course
        double fee = 125000;
        
        // discount percentage
        double discountPercent = 10;
        
        // Calculating the discount amount
        double discount = (discountPercent / 100) * fee;
        
        // Calculating  final fee after applying the discount
        double finalFee = fee - discount;
        
    
        System.out.println("The discount amount is INR " + discount + 
                           " and final discounted fee is INR " + finalFee);
    }
}
