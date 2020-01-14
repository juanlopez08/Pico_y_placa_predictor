/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.Placa;
import java.util.Calendar;
/**
 *
 * @author juanc
 */


public class ControllerPlaca {
    Placa placa = new Placa();
    
    Calendar now = Calendar.getInstance();
    String[] strDays = new String[] { "Sunday", "Monday", "Tuesday","Wednesday", "Thusday", "Friday", "Saturday" };
    //System.out.println("Current day is : " strDays[now.get(Calendar.DAY_OF_WEEK) - 1]);
    
    
    static char getLastDigit(String placa) {
        char lastDigit = placa.charAt(placa.length()-1);
        System.out.println(lastDigit);
        return lastDigit;
  }
    
    
    
    
}
