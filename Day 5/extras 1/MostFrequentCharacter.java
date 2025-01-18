
public class MostFrequentCharacter {
    public static void main(String[] args) {
       
        String input = "success";

        // Frequency array for all characters
        int[] frequency = new int[256];

        // Count frequencies
        for (char c : input.toCharArray()) {
            frequency[c]++;
        }

        // Find the character with the maximum frequency
        char mostFrequent = ' ';
        int maxFrequency = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                mostFrequent = (char) i;
            }
        }

      
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }
}
