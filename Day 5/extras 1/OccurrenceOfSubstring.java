import java.util.*;

public class OccurrenceOfSubstring {

    public static void main(String[] args) {
        String subStr = "aab";
        String str = "aabaabaaabaaaa";

        int subStrLen = subStr.length();
        int strLen = str.length();

        int count = 0 ;

        // Use a sliding window to check substrings
        for (int i = 0; i <= strLen - subStrLen; i++) {
            String currentWindow = str.substring(i, i + subStrLen);
            if (currentWindow.equals(subStr)) {
                count++;
            }
        }

        System.out.println("Count of occurrences: " + count);
    }
}
