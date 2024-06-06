/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsp.gov.ph.model;

/**
 *
 * @author m303user
 */
public abstract class CreditCardRegulation {
    
    public abstract void creditCardPayment(String creditCardNumber) throws InterruptedException;
    public abstract boolean isNumberEqualTo16(String creditCardNumber);
    public abstract boolean isCreditCardNumberValid(String creditCardNumber);
    
    public void sayThankYou(){
        System.out.println("Thank you so much for using credit card services");
    }
}
