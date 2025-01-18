
public class RemoveCharacter {
    public static void main(String[] args) {
        
        String input = "Hello World";
        char toRemove = 'l';

        // Build a new string 
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (c != toRemove) {
                result.append(c);
            }
        }

        // Print the modified string
        System.out.println("Modified String: \"" + result + "\"");
    }
}
