/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author rkusch
 */
public class DateUtilites {
    
    
    public String dateToString(LocalDate localDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        return localDate.format(formatter);
        
    }
}
