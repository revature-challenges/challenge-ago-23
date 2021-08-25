package com.revature.challenge;

import java.util.Arrays;

public class ValidCardMain {
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String RESET = "\033[0m";  // Text Reset
    
    public static void main(String[] args) {
        
        CreditCardValidator creditCardValidator = new CreditCardValidator();
   
        System.out.println("*********************** CHALLENGE LUNH ALGORITHN CASES  **********************************");
        System.out.println("");
        
        String cardNumber = "1234567890123456";
        System.out.println(creditCardValidator.validCardOne(cardNumber)
                                   ? "Is the card number # "+cardNumber +" valid? >>> "+GREEN_BOLD+creditCardValidator.validCardOne(cardNumber)+RESET
                                   : "Is the card number # "+cardNumber +" valid? >>> "+RED_BOLD +creditCardValidator.validCardOne(cardNumber)+RESET );
        System.out.println("***********************");

        String cardNumber2 = "1234567890123452";
        System.out.println(creditCardValidator.validCardOne(cardNumber2)
                                   ? "Is the card number # "+cardNumber2 +" valid? >>> "+GREEN_BOLD+creditCardValidator.validCardOne(cardNumber2)+RESET
                                   : "Is the card number # "+cardNumber2 +" valid? >>> "+RED_BOLD +creditCardValidator.validCardOne(cardNumber2)+RESET );
        System.out.println("***********************");
        
        System.out.println("");
        System.out.println("************************* OTHER LUNH ALGORITHM CASES ***********************************");
        System.out.println("********* Found at \"https://www.freebinchecker.com/credit-card-validator/\"**************");
        System.out.println("");
        
        String cardNumber3 = "4548737513899856";
        System.out.println(creditCardValidator.validCardTwo(cardNumber)
                                   ? "Is the card number # "+cardNumber +" valid? >>> "+GREEN_BOLD+creditCardValidator.validCardTwo(cardNumber)+RESET
                                   : "Is the card number # "+cardNumber +" valid? >>> "+RED_BOLD +creditCardValidator.validCardTwo(cardNumber)+RESET );
        System.out.println("***********************");
    
        System.out.println(creditCardValidator.validCardTwo(cardNumber2)
                                   ? "Is the card number # "+cardNumber2 +" valid? >>> "+GREEN_BOLD+creditCardValidator.validCardTwo(cardNumber2)+RESET
                                   : "Is the card number # "+cardNumber2 +" valid? >>> "+RED_BOLD +creditCardValidator.validCardTwo(cardNumber2)+RESET );
        System.out.println("***********************");
        
        System.out.println(creditCardValidator.validCardTwo(cardNumber3)
                                   ? "Is the card number # "+cardNumber3 +" valid? >>> "+GREEN_BOLD+creditCardValidator.validCardTwo(cardNumber3)+RESET
                                   : "Is the card number # "+cardNumber3 +" valid? >>> "+RED_BOLD +creditCardValidator.validCardTwo(cardNumber3)+RESET );
        System.out.println("***********************");
        System.out.println("");
    }
}
