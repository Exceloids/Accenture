/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bir.gov.ph.model;

/**
 *
 * @author m303user
 */
public interface BIRTaxPayment {
    //Declare Variable - Note: All variables are implicity public static final
    //Same as public static final
    double VAT_AMOUNT = .12; 
    
    // All Methods are implicitly  public abstract
    double computeVAT(double amountPurchased);
}
