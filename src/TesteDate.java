
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
        System.out.println(data);
        
    }
    
}
