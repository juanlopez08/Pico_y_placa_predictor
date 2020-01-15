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

    public int validatePicoPlaca(char lastDigit, int day) {
        int flag = 0;
        int lastDigitInt = Character.getNumericValue(lastDigit);
        int pairDays[] = {0, 2, 4, 6, 8};
        int nonPairDays[] = {1, 3, 5, 7, 9};

        for (int i = 0; i < 5; i++) {
            if ((lastDigitInt == pairDays[i] || lastDigitInt == nonPairDays[i]) && (day == i + 1)) {
                flag = 1;
            }
        }
        return flag;
    }

}

