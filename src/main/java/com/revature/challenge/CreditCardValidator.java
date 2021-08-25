package com.revature.challenge;

public class CreditCardValidator {
    
    public CreditCardValidator() {}
    
    //This is the process explained in the challenge
    public boolean validCardOne(String cardNumber){
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
    public boolean validCardTwo(String cardNumber){
        StringBuilder cardNum = new StringBuilder(cardNumber.trim());
        if(cardNum.length() >=14 && cardNum.length() <=19){
            char lastDigit= cardNum.charAt(cardNum.length()-1);
            //This is the part that differed for the Lunh Algorithm in both cases
            if(completeLunhSum(cardNumber)%10==Character.getNumericValue(lastDigit)){return true;};
        }
        return false;
    }
    
    private int completeLunhSum(String cardNum){
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
