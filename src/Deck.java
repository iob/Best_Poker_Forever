/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pokergame;

import java.util.Random;

/**
 *
 * @author timo
 */
public class Deck {

    static final int cardsInDeck = 52;
    private int[] aDeck = new int[cardsInDeck];
    private int position;
    private Random generator = new Random();

    /*
     * Shuffle the Deck
     */
    public void shuffle() {
        position = 0;
        for (int i = 0; i < cardsInDeck; i++) {
            aDeck[i] = 0;
        }

        int i = 0;
        while (i < aDeck.length) {
            int gen = generator.nextInt(cardsInDeck);
            if (aDeck[gen] == 0) {
                aDeck[gen] = i;
                i++;
            }
        }


    }
    
    public int drawCard()
    {
        position++;
        return aDeck[position-1];
    }

    public void showDeck() {
        for(int i=0;i < aDeck.length;i++){
        System.out.print(String.valueOf(aDeck[i])+" ");
        }
System.out.println();

    }

    public Deck() {
        this.shuffle();
    }
}
