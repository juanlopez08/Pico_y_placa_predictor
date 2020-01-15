/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author juanc
 */
public class ControllerFecha {
        
    
    public int dayOfWeek(int day, int month, int year){
        int t[] = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        year -= (month < 3) ? 1 : 0;
        int dayNumber = (year + year/4 - year/100 + year/400 + t[month-1] + day) % 7;
        return dayNumber;
    }
    
    public int []StringToInt(String date){
        String[] parts = date.split("/");
        String day = parts[0];
        String month = parts[1];
        String year = parts[2];
        int dateint[] = {Integer.parseInt(day), Integer.parseInt(month), Integer.parseInt(year)};
        
        return dateint;
    }
    
    public String theDayIs(int dayNumber){
        String dayName;
        switch(dayNumber){
                case 1:
                    dayName = "Moonday";
                    break;
                case 2:
                    dayName = "Tuesday";
                    break;
                case 3:
                    dayName = "Wednesday";
                    break;
                case 4:
                    dayName = "Thursday";
                    break;
                case 5:
                    dayName = "Friday";
                    break;
                default:
                    dayName = "Weekend";
                
        }
        
        return dayName;
    }
    
    
        public int validateFecha(String fecha){
        Pattern pattern = Pattern.compile("^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})");
        Matcher matcher = pattern.matcher(fecha);
        if(matcher.find() == true){
            return 1;
        } else {
            return 0;
        }
    }
    
}
