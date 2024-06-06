/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpi.com.ph;
import bsp.gov.ph.model.CreditCardRegulation;
import bir.gov.ph.model.BIRTaxPayment;
import bir.gov.ph.model.BIRMessages;

/**
 *
 * @author m303user
 */
public class BPICreditCardServicesDivision extends CreditCardRegulation
    implements BIRTaxPayment, BIRMessages{
    
    public BPICreditCardServicesDivision() throws InterruptedException{
        System.out.println("Welcome to BPI Credit Card Services Division");
        
        for(int counter=1; counter<=10; counter++){
            System.out.println(".");
            Thread.sleep(500);
        }
    }
    

    @Override
    public void creditCardPayment(String creditCardNumber) {
        System.out.println("Making credit card payment of your purchases using " + creditCardNumber +
                ". Please wait as we will validate your credit card");
    }

    @Override
    public boolean isNumberEqualTo16(String creditCardNumber) {
        return(creditCardNumber.trim().length()==16)?true:false;
    }

    @Override
    public boolean isCreditCardNumberValid(String creditCardNumber) {
        int s1 = 0, s2 = 0;
        String reverse = new StringBuffer(creditCardNumber).reverse().toString();
        for(int i = 0 ;i < reverse.length();i++){
            int digit = Character.digit(reverse.charAt(i), 10);
            if(i % 2 == 0){//this is for odd digits, they are 1-indexed in the algorithm
                s1 += digit;
            }else{//add 2 * digit for 0-4, add 2 * digit - 9 for 5-9
                s2 += 2 * digit;
                if(digit >= 5){
                    s2 -= 9;
                }
            }
        }
        return (s1 + s2) % 10 == 0;
    }

    @Override
    public double computeVAT(double amountPurchased) {
        return amountPurchased*VAT_AMOUNT;
    }
    
    public void vatMessageToConsumer(){
        System.out.println("\n"+ANNOUNCEMNT_ON_VAT);
        System.out.println(REPUBLIC_ACT_9337);
    }
    
}
