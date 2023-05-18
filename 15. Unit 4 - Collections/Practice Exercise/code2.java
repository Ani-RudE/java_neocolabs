import java.util.*;
import java.lang.*;
import java.io.*;

class Q04Easy_Collections2 {
     static class Card {
          private String symbol;
          private Integer number;

          public Card(String symbol, Integer num) {
               this.symbol = symbol;
               this.number = num;
          }

          public String getSymbol() {
               return symbol;
          }

          public void setSymbol(String symbol) {
               this.symbol = symbol;
          }

          public Integer getNumber() {
               return number;
          }

          public void setNumber(int number) {
               this.number = number;
          }

          public String toString() {
               return this.symbol + " " + this.number;
          }
     }

     static class CardComp implements Comparator<Card> {

          @Override
          public int compare(Card e1, Card e2) {
               int cmp = e1.getSymbol().compareTo(e2.getSymbol());
               if (cmp == 0)
                    return e1.getNumber() - e2.getNumber();
               return cmp;
          }
     }

     public static void main(String[] args) throws java.lang.Exception {
          Scanner input = new Scanner(System.in);
          boolean err = false;
          int count = 0;
          TreeMap<String, TreeSet<Card>> cards = new TreeMap<String, TreeSet<Card>>();
          int cardCount = 0;
          do {
               try {
                    cardCount = Integer.parseInt(input.nextLine());
                    if (cardCount > 0)
                         err = false;
                    else
                         err = true;
               } catch (NumberFormatException e) {
                    err = true;
               }
          } while (err);

          while (cardCount > 0) {
               // Input card
               String symbol = input.nextLine();
               Integer value = null;
               do {
                    try {
                         value = Integer.parseInt(input.nextLine());
                         err = false;
                    } catch (NumberFormatException e) {
                         System.out.println("Invalid Input");
                         err = true;
                    }
               } while (err);
               if (!cards.containsKey(symbol)) {
                    cards.put(symbol, new TreeSet<Card>(new CardComp()));
               }
               cards.get(symbol).add(new Card(symbol, value));
               count++;
               cardCount--;
          }

          System.out.println("Distinct Symbols are: ");
          for (String key : cards.keySet()) {
               System.out.print(key + " ");
          }
          System.out.println();
          for (String key : cards.keySet()) {
               System.out.println("Cards in " + key + " Symbol:");
               TreeSet<Card> value = cards.get(key);
               int sum = 0;
               for (Card card : value) {
                    System.out.println(card);
                    sum += card.getNumber();
               }
               System.out.println("Number of Cards: " + value.size());
               System.out.println("Sum of Numbers: " + sum);

          }
     }
}