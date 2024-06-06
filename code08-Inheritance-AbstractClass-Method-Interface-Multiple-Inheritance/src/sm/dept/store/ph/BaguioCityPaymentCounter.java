/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.dept.store.ph;
import uc.edu.ph.utility.Reader;
import bpi.com.ph.BPICreditCardServicesDivision;
import java.io.IOException;
/**
 *
 * @author m303user
 */
public class BaguioCityPaymentCounter {
    static{
        System.out.println("Welcome to SM Baguio City Department Store");
    }
    
    
    public static void main(String[] args) throws IOException, InterruptedException {
        String customerName= Reader.readString("customer name");
        double amountPurchased= Reader.readDouble("amount purchased");
        String creditCardNumber= Reader.readString("credit card number");
        
        BPICreditCardServicesDivision bpiCC = new BPICreditCardServicesDivision();
        bpiCC.creditCardPayment(creditCardNumber); 
        
        
        if (bpiCC.isNumberEqualTo16(creditCardNumber)) {
            if (bpiCC.isCreditCardNumberValid(creditCardNumber)){
                System.out.println("Customer Name: " + customerName);
                System.out.println("Gross Purchase Amount: Php ");
                
                double vatAmount= bpiCC.computeVAT(amountPurchased);
                System.out.println("VAT\t\t: Php" + vatAmount);
                System.out.println("Total Amount: Php" + (amountPurchased + vatAmount));
                System.out.println("Credit card number" + creditCardNumber + "is valid");
                System.out.println("Thank you for paying the amount of" + amountPurchased);
            } else{
                System.err.println("Invalid credit card number. Transaction aborted");
            }
        } else{
            System.out.println("Invalid credit card number length- must be 16 digits" + "Transavction aborted");
        }
            System.out.println("\n Thank you for shopping in SM Baguio City");
            System.out.println("Because we got it all for you");
    }
}
