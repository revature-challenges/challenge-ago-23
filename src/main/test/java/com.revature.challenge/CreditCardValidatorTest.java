package com.revature.challenge;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreditCardValidatorTest {
    private CreditCardValidator sut;
    
    @BeforeEach
    public void setUpTest(){sut = new CreditCardValidator();}
    
    @AfterEach
    public void tearDownTest() {sut = null;}
    
    @Test
    public void test_validateCardOneWithValidCreditNumber(){
        //Arrange
        String creditNumber = "1234567890123452";
        
        //Act
        
        //Assert
        assertTrue(sut.validCardOne(creditNumber));
    }
    
    @Test
    public void test_validateCardOneWithAnInvalidCreditNumber(){
        //Arrange
        String creditNumber = "1234567890123456";
        //Act
        
        //Assert
        assertFalse(sut.validCardOne(creditNumber));
    }
    
    @Test
    public void test_validateCardTwoWithValidCreditNumber(){
        //Arrange
        String creditNumber = "4548737513899856";
        
        //Act
        
        //Assert
        assertTrue(sut.validCardTwo(creditNumber));
    }
    
    @Test
    public void test_validateCardTwoWithAnInvalidCreditNumber(){
        //Arrange
        String creditNumber = "1234567890123452";
        //Act
        
        //Assert
        assertFalse(sut.validCardTwo(creditNumber));
    }
}
