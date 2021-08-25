package com.revature.challenge;

import java.util.Arrays;

public class ValidCardMain {
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String RESET = "\033[0m";  // Text Reset
    
    public static void main(String[] args) {
        
        
   
        System.out.println("*********************** CHALLENGE LUNH ALGORITHN CASES  **********************************");
        System.out.println("");
        
        String cardNumber = "1234567890123456";
        System.out.println(ValidCardMain.validateCardOne(cardNumber)
                                   ? "Is the card number # "+cardNumber +" valid? >>> "+GREEN_BOLD+ValidCardMain.validateCardOne(cardNumber)+RESET
                                   : "Is the card number # "+cardNumber +" valid? >>> "+RED_BOLD +ValidCardMain.validateCardOne(cardNumber)+RESET );
        System.out.println("***********************");

        String cardNumber2 = "1234567890123452";
        System.out.println(ValidCardMain.validateCardOne(cardNumber2)
                                   ? "Is the card number # "+cardNumber2 +" valid? >>> "+GREEN_BOLD+ValidCardMain.validateCardOne(cardNumber2)+RESET
                                   : "Is the card number # "+cardNumber2 +" valid? >>> "+RED_BOLD +ValidCardMain.validateCardOne(cardNumber2)+RESET );
        System.out.println("***********************");
        
        System.out.println("");
        System.out.println("************************* OTHER LUNH ALGORITHM CASES ***********************************");
        System.out.println("********* Found at \"https://www.freebinchecker.com/credit-card-validator/\"**************");
        System.out.println("");
        
        String cardNumber3 = "4548737513899856";
        System.out.println(ValidCardMain.validateCardTwo(cardNumber)
                                   ? "Is the card number # "+cardNumber +" valid? >>> "+GREEN_BOLD+ValidCardMain.validateCardTwo(cardNumber)+RESET
                                   : "Is the card number # "+cardNumber +" valid? >>> "+RED_BOLD +ValidCardMain.validateCardTwo(cardNumber)+RESET );
        System.out.println("***********************");
    
        System.out.println(ValidCardMain.validateCardTwo(cardNumber2)
                                   ? "Is the card number # "+cardNumber2 +" valid? >>> "+GREEN_BOLD+ValidCardMain.validateCardTwo(cardNumber2)+RESET
                                   : "Is the card number # "+cardNumber2 +" valid? >>> "+RED_BOLD +ValidCardMain.validateCardTwo(cardNumber2)+RESET );
        System.out.println("***********************");
        
        System.out.println(ValidCardMain.validateCardTwo(cardNumber3)
                                   ? "Is the card number # "+cardNumber3 +" valid? >>> "+GREEN_BOLD+ValidCardMain.validateCardTwo(cardNumber3)+RESET
                                   : "Is the card number # "+cardNumber3 +" valid? >>> "+RED_BOLD +ValidCardMain.validateCardTwo(cardNumber3)+RESET );
        System.out.println("***********************");
        System.out.println("");
    }
    
    //This is the process explained in the challenge
    public static boolean validateCardOne(String cardNumber){
        StringBuilder cardNum = new StringBuilder(cardNumber.trim());
        if(cardNum.length() >=14 && cardNum.length() <=19){
            char lastDigit= cardNum.charAt(cardNum.length()-1);
            //This is the part that differed for the Lunh Algorithm in both cases
            int sum = completeLunhSum(cardNumber);
            if((10-Character.getNumericValue(String.valueOf(sum).charAt(String.valueOf(sum).length()-1)))==Character.getNumericValue(lastDigit)){
                return true;
            };
        }
        return false;
    }
    //This is the process to validate the credit card that I found it in the following link >> https://www.freebinchecker.com/credit-card-validator/
    public static boolean validateCardTwo(String cardNumber){
        StringBuilder cardNum = new StringBuilder(cardNumber.trim());
        if(cardNum.length() >=14 && cardNum.length() <=19){
            char lastDigit= cardNum.charAt(cardNum.length()-1);
            //This is the part that differed for the Lunh Algorithm in both cases
            if(completeLunhSum(cardNumber)%10==Character.getNumericValue(lastDigit)){return true;};
        }
        return false;
    }
    
    private static int completeLunhSum(String cardNum){
        StringBuilder supportStr = new StringBuilder(cardNum.substring(0, cardNum.length() - 1));
        supportStr.reverse();
        int sum=0;
        int oddPos = 1;
        for(char c: String.valueOf(supportStr).toCharArray()){
            if(oddPos % 2 != 0) {
                int oddNum =  Character.getNumericValue(c) * 2;
                if (oddNum >= 10){
                    oddNum -= 9;
                    sum += oddNum;
                }else{
                    sum += oddNum;
                }
            }else{
                sum += Character.getNumericValue(c);
                oddPos=0;
            }
            oddPos++;
        }
        return sum;
    }
  

}
