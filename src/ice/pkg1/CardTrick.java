/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ice.pkg1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author ----
 */
public class CardTrick {
    
     public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        for (int i=0; i<magicHand.length; i++)
        {
            Random rand = new Random();
            int cardNums = rand.nextInt(13)+1;
            Card c = new Card();
            c.setValue(cardNums);
            int cardSuits = rand.nextInt(4);
            c.setSuit(Card.SUITS[cardSuits]);
            magicHand[i]= c;
          
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
