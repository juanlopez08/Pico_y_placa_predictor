/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Placa;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author juanc
 */

public class ControllerPlaca {

    Placa placa = new Placa();

    public char getLastDigit(String placa) {
        char lastDigit = placa.charAt(placa.length() - 1);
        //System.out.println(lastDigit);
        return lastDigit;
    }

    public int validateChapa(String chapa) {
        Pattern pattern = Pattern.compile("^[A-z]{3}[0-9]{4}$");
        Matcher matcher = pattern.matcher(chapa);
        if (matcher.find() == true) {
            return 1;
        } else {
            return 0;
        }
    }
}
