/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pokergame;

/**
 *
 * Card Class, Cards are 0-51
 */
public class Card {

    static public String strColor(int number) {
        String result;

        switch (number) {
            case 0:
                result = "diamonds";
                break;
            case 1:
                result = "hearts";
                break;
            case 2:
                result = "clubs";
                break;
            case 3:
                result = "clubs";
                break;
            default:
                throw new IndexOutOfBoundsException();
        }

        return result;

    }

    static public String strValue(int number) {
        String result;

        switch (number) {
            case 0:
                result = "two";
                break;
            case 1:
                result = "three";
                break;
            case 2:
                result = "four";
                break;
            case 3:
                result = "five";
                break;
            case 4:
                result = "six";
                break;
            case 5:
                result = "seven";
                break;
            case 6:
                result = "eight";
                break;
            case 7:
                result = "nine";
                break;
            case 8:
                result = "ten";
                break;
            case 9:
                result = "jack";
                break;
            case 10:
                result = "queen";
                break;
            case 11:
                result = "king";
                break;
            case 12:
                result = "ace";
                break;
            default:
                throw new IndexOutOfBoundsException("Only Values 0-12 allowed");
        }

        return result;

    }

    /*
     * lalala
     */
    public static int color(int number) {
        return number / 13;
    }

    /*
     *
     */
    public static int value(int number) {
        return number % 13;
    }

    public Card() 
    {
//        if (number > 51 || number < 0) {
//            throw new IndexOutOfBoundsException("Card " + String.valueOf(number) + " doesn't exist");
//        } else {
//            this.number = number;
//        }
    }
}
