/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uc.edu.ph.controller;
import uc.edu.ph.model.Parent;
import uc.edu.ph.model.Child;
import uc.edu.ph.view.Display;

public class DemoInheritance {
    public static void main(String[] args){
        
        //Parent gasParent = new Parent();
        //Display.print(gasParent);
        
        Child gasChild = new Child();
        Display.print(gasChild);
    }
}
