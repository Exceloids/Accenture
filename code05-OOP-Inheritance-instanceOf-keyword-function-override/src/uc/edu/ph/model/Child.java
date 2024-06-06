/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uc.edu.ph.model;

/**
 *
 * @author m303user
 */
public class Child extends uc.edu.ph.model.Parent{
    
    public Child(){
        this.gasolineClass= "This is the child class."; // Inherited from the Parent
    }
    
    @Override
    public void typeOfPayment(){
        System.out.println("We only accept cash payment.");
        //Add Codes
        debitCardPayment();
        creditCardPayment();
        gCashPayment();
        payMayaPayment();
        payPalPayment();

    }
    
    
    //Additional Methods
    public void debitCardPayment(){
        System.out.println("We only All Debit card payment.");
    
    }
    
    public void creditCardPayment(){
        System.out.println("We only All Credit card payment.");
    }
    
    public void gCashPayment(){
        System.out.println("We accept GCash.");
    }
    
    public void payMayaPayment(){
        System.out.println("We accept Paymaya.");
    }
    
    public void payPalPayment(){
        System.out.println("We accept PayPal.");
    }
}
