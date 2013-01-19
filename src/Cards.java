/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pokergame;

import java.util.Set;

/**
 *
 * @author timo
 */
public class Cards {
    
    
    //holds up to 7 cards
    int[] aiCards = new int[7];
    int position = 0;
    
    public int evaluate(int[] cardArray)
    {
        int result = 0;
        
        return result;
    }
    /*
     *
     */
    public int checkForFlush(int[] cardArray)
    {
        int hearts = 0;
        int spades = 0;
        int diamonds = 0;
        int clubs = 0;
        
        for (int i = 0; i < cardArray.length; i++) {
            switch (Card.color(cardArray[i])){
                 case 0: //"diamonds";
                diamonds++;
                break;
            case 1:     //"hearts"
                hearts++;
                break;
            case 2:     //"spades"
                spades++;
                break;
            case 3:
                clubs++; // "clubs"
                break;
            default:
                throw new IndexOutOfBoundsException();            
        }
            
            if (hearts > 5)
            {
                
            }
        
    }
    
    public void addCard(int card)
    {
        if (position > 6)
        {
            throw new IndexOutOfBoundsException("Only Position 0-6 allowed");
        }
            
        aiCards[position] = card;
        position++;
    }
    

    
    public Cards() {
        for (int i = 0;i < aiCards.length ;i++)
        {
            aiCards = -1;
        }
    }
    
}
