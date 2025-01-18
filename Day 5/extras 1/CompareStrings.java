
public class CompareStrings {
    public static void main(String[] args) {
       
        String string1 = "apple";
        String string2 = "banana";

        // Compare the two strings character by character
        int result = 0;
        for (int i = 0; i < Math.min(string1.length(), string2.length()); i++) {
            if (string1.charAt(i) != string2.charAt(i)) {
                result = string1.charAt(i) - string2.charAt(i);
                break;
            }
        }

        // If the strings are equal so far, compare their lengths
        if (result == 0) {
            result = string1.length() - string2.length();
        }

        // Print the result of the comparison
        if (result < 0) {
            System.out.println("\"" + string1 + "\" comes before \"" + string2 + "\" in lexicographical order");
        } else if (result > 0) {
            System.out.println("\"" + string1 + "\" comes after \"" + string2 + "\" in lexicographical order");
        } else {
            System.out.println("\"" + string1 + "\" is equal to \"" + string2 + "\"");
        }
    }
}
