/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.Placa;

/**
 *
 * @author juanc
 */


public class ControllerPlaca {
    Placa placa = new Placa();
    
    public char getLastDigit(String placa) {
        char lastDigit = placa.charAt(placa.length()-1);
        //System.out.println(lastDigit);
        return lastDigit;
  }
    
    //VALIDAR CHAPA 
    
    
}
