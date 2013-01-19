/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pokergame;

/**
 *
 * @author timo
 */
public class PokerGame {

    /**
     * @param args the command line arguments
     */
    
    public static void test(){
          Card test = new Card(21);
        Deck testd = new Deck();
        testd.shuffle();
        testd.showDeck();
        System.out.print(String.valueOf(testd.drawCard()));
        System.out.print(String.valueOf(testd.drawCard()));
    }
    
    public static void main(String[] args) {
  
    }
}
