import java.util.*;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        // Check using logic 1
        boolean isPalindrome1 = isPalindromeLogic1(text);
        System.out.println("Palindrome check using Logic 1: " + isPalindrome1);

        // Check using logic 2
        boolean isPalindrome2 = isPalindromeRecursive(text, 0, text.length() - 1);
        System.out.println("Palindrome check using Logic 2: " + isPalindrome2);

        // Check using logic 3
        boolean isPalindrome3 = isPalindromeWithReverse(text);
        System.out.println("Palindrome check using Logic 3: " + isPalindrome3);
    }

    public static boolean isPalindromeLogic1(String text) {
        int start = 0, end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;

        if (text.charAt(start) != text.charAt(end)) return false;

        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    public static boolean isPalindromeWithReverse(String text) {
        String reversed = reverseString(text);
        return text.equals(reversed);
    }

    public static String reverseString(String text) {
        StringBuilder reversed = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }
        return reversed.toString();
    }
}
