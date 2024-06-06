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
public class Parent {
    
    public String gasolineClass;
    
    public Parent(){
        this.gasolineClass= "This is the Parent class";
    }
    
    public void typeOfPayment(){
        System.out.println("We only accept cash payment.");
    }

    
}
