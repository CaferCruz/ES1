/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Operacoes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Cafer
 */
public class Calendario {
    
    public static String pegaData(){
        Date d = Calendar.getInstance().getTime();
        DateFormat f = new SimpleDateFormat("dd/MM/YYYY");
        DateFormat h = new SimpleDateFormat("HH:mm:ss");
        return f.format(d) +" "+h.format(d);
    }
}
