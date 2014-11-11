
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Romulo
 */
public class TesteDate {
    
    public static void main(String[] args) {
        
        Calendar calendar = Calendar.getInstance();
        Date data = calendar.getTime();
        System.out.println("Sem formatação: " + data);
        
        Date d = Calendar.getInstance().getTime();
        DateFormat f = new SimpleDateFormat("dd/MM/YYYY");
        DateFormat h = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Com formatação: " + f.format(d) + " " + h.format(d));
        
    }
    
}
