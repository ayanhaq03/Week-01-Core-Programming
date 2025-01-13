import java.util.*;

public class OTPGenerator {
    public static void main(String[] args) {
        // Generate and validate 10 OTPs
        int[] otps = new int[10];
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        
        System.out.println("Generated OTPs: " + Arrays.toString(otps));

        // Check uniqueness
        System.out.println("All OTPs are unique: " + areUnique(otps));
    }

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        return 100000 + (int) (Math.random() * 900000);
    }

    // Method to check if all OTPs are unique
    public static boolean areUnique(int[] otps) {
        Set<Integer> set = new HashSet<>();
        for (int otp : otps) {
            if (!set.add(otp)) return false;
        }
        return true;
    }
}
