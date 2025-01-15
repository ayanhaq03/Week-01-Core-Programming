import java.util.*;

public class DeckOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize suits and ranks
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

       
        String[] deck = initializeDeck(suits, ranks);

        // Shuffle the deck
        shuffleDeck(deck);

        //taking input
        System.out.print("Enter the number of cards to distribute: ");
        int numOfCards = sc.nextInt();
        System.out.print("Enter the number of players: ");
        int numOfPlayers = sc.nextInt();

        // Distributing cards
        String[][] playerCards = distributeCards(deck, numOfCards, numOfPlayers);

       
        printPlayerCards(playerCards);
    }

    // Method to initialize the deck of cards
    public static String[] initializeDeck(String[] suits, String[] ranks) {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck of cards
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            // Swap the current card with the random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int numOfCards, int numOfPlayers) {
        if (numOfCards * numOfPlayers > deck.length) {
            System.out.println("Not enough cards in the deck to distribute.");
            return null;
        }

        String[][] playerCards = new String[numOfPlayers][numOfCards];
        int cardIndex = 0;

        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < numOfCards; j++) {
                playerCards[i][j] = deck[cardIndex++];
            }
        }

        return playerCards;
    }

    // Method to print the cards of each player
    public static void printPlayerCards(String[][] playerCards) {
        if (playerCards == null) return;

        for (int i = 0; i < playerCards.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : playerCards[i]) {
                System.out.println(card);
            }
            System.out.println();
        }
    }
}
