// Program to replace a word in a sentence
public class ReplaceWord {
    public static void main(String[] args) {
        // Input sentence and words
        String sentence = "The quick brown fox jumps over the lazy dog";
        String wordToReplace = "fox";
        String replacementWord = "cat";

        // Replace the word
        String modifiedSentence = "";
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (word.equals(wordToReplace)) {
                modifiedSentence += replacementWord + " ";
            } else {
                modifiedSentence += word + " ";
            }
        }

        // Trim the result
        modifiedSentence = modifiedSentence.trim();
        System.out.println("Modified Sentence: \"" + modifiedSentence + "\"");
    }
}
