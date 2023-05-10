import java.util.*;
import java.lang.*;
import java.io.*;

class Q03Complex_List {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          // Input number of hands:
          int numHands = input.nextInt();
          // Input number of cards per hand
          int cardsPerHand = input.nextInt();

          if (numHands < 1 || cardsPerHand < 1)
               return;

          String[] suit = new String[] {
                    "Spades", "Hearts", "Diamonds", "Clubs"
          };
          String[] rank = new String[] {
                    "Ace", "2", "3", "4",
                    "5", "6", "7", "8", "9", "10",
                    "Jack", "Queen", "King"
          };

          List<String> deck = new ArrayList<String>();
          for (int i = 0; i < suit.length; i++)
               for (int j = 0; j < rank.length; j++)
                    deck.add(rank[j] + " of " + suit[i]);

          Collections.shuffle(deck, new Random(0));

          if (numHands * cardsPerHand > deck.size()) {
               System.out.println("Not enough cards.");
               return;
          }

          for (int i = 0; i < numHands; i++)
               System.out.println(dealHand(deck, cardsPerHand));
     }

     public static List<String> dealHand(List<String> deck, int n) {
          int deckSize = deck.size();
          List<String> handView = deck.subList(deckSize - n, deckSize);
          List<String> hand = new ArrayList<String>(handView);
          handView.clear();
          return hand;
     }
}