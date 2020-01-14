/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author juanc
 */
public class ControllerFecha {
    
    public int dayofweek(int day, int month, int year){
        int t[] = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        year -= (month < 3) ? 1 : 0;
        
        return (year + year/4 - year/100 + year/400 + t[month-1] + day) % 7;
    }
    
    
}
