
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Romulo
 */
public class Teste {

    public static void main(String[] args) {
        Date d = Calendar.getInstance().getTime();
        DateFormat f = new SimpleDateFormat("dd/MM/YYYY");
        DateFormat h = new SimpleDateFormat("HH:mm:ss");
        System.out.println(f.format(d) + " " + h.format(d));

    }
}
