/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uc.edu.ph.view;
import uc.edu.ph.model.Parent;
import uc.edu.ph.model.Child;
/**
 *
 * @author m303user
 */
public class Display {
    
    public static void print(Parent Obj){
        
        if(Obj instanceof Child){
            Child objChild= (Child) Obj; // Example of Data type Casting
            System.out.println(Obj.gasolineClass);
            objChild.typeOfPayment(); //override
            objChild.typeOfPayment("BPI Cheque"); //overload
            objChild.gCashPayment(); 
        }else if(Obj instanceof Parent){
            System.out.println(Obj.gasolineClass);
            Obj.typeOfPayment();
        }
    }
}
