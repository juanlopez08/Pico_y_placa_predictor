/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Color;
import javax.swing.JTextField;


/**
 *
 * @author juanc
 */
public class ControllerValidations {

    public boolean validateEmptyFields(JTextField jTextField) {
        boolean flag = false;
        if (jTextField.getText().trim().equals("")) {
            jTextField.setBackground(Color.red);
            flag = true;
        } else {
            jTextField.setBackground(Color.white);
        }
        jTextField.revalidate();
        return flag;
    }

    public String validatePicoPlaca(char lastDigit, int day) {
        String negative = "You can NOT drive from 7:00 a.m. \nto 9:30 a.m. or from 4:00 p.m. to 7:30 p.m.";
        String positive = "You can drive.";
        String message = "";
        int lastDigitInt = Character.getNumericValue(lastDigit);
           
        if ((lastDigitInt == 0 || lastDigitInt == 1) && day == 1 ) {
            message = negative;
        }else if ((lastDigitInt == 2 || lastDigitInt == 3) && day == 2){
            message = negative;
        }else if ((lastDigitInt == 4 || lastDigitInt == 5) && day == 3){
            message = negative;
        } else if ((lastDigitInt == 6 || lastDigitInt == 7) && (day == 4)) {
            message = negative;
        } else if ((lastDigitInt == 8 || lastDigitInt == 9) && (day == 5)) {
            message = negative;
        } else {
            message = positive;
        }
        return message;
    }

}
