/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectociber;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author salazarwalter
 */
public class Fecha {
public static String fechaYYYYMMDD(java.util.Date fecha)    {
    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
return formato.format(fecha);
}
public static String fechaYYYYMMDD(java.sql.Date fecha)    {
    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
return formato.format(fecha);
}
public static String fechaDDMMYYYY(java.util.Date fecha){
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
return formato.format(fecha);
}

public static String DDMMYYYYHMS(java.util.Date fecha){
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy  H 'hs',m 'mins':s 'seg'");
return formato.format(fecha);
}
////////////////////////////////////////////////////////////////////////
public static long comparar(java.util.Date f1,java.util.Date f2){
        java.util.Calendar fecha1 = Calendar.getInstance();
        fecha1.setTime(f1);
        fecha1.set(Calendar.HOUR, 0);
        fecha1.set(Calendar.MINUTE, 0);
        fecha1.set(Calendar.SECOND, 0);
        fecha1.set(Calendar.MILLISECOND, 0);
        
        java.util.Calendar fecha2 = Calendar.getInstance();
        fecha2.setTime(f2);
        fecha2.set(Calendar.HOUR, 0);
        fecha2.set(Calendar.MINUTE, 0);
        fecha2.set(Calendar.SECOND, 0);
        fecha2.set(Calendar.MILLISECOND, 0);
        System.out.print("COMBO MILI="+fecha2.getTime().getTime());
        System.out.print("FECHA ACTUAL="+fecha1.getTime().getTime());
    return fecha1.getTime().getTime()-fecha2.getTime().getTime();
}
public static boolean isMayor(java.util.Date f1,java.util.Date f2){
    return comparar(f1, f2)>0;
}
public static boolean isMenor(java.util.Date f1,java.util.Date f2){
    return comparar(f1, f2)<0;
}
public static boolean equals(java.util.Date f1,java.util.Date f2){
    return comparar(f1, f2)==0;
}

public static int calcularAntiguedad(java.util.Date ayer,java.util.Date hoy){
         java.util.Calendar fecha1 = Calendar.getInstance();
        fecha1.setTime(ayer);
        fecha1.set(Calendar.HOUR, 0);
        fecha1.set(Calendar.MINUTE, 0);
        fecha1.set(Calendar.SECOND, 0);
        fecha1.set(Calendar.MILLISECOND, 0);
        
        java.util.Calendar fecha2 = Calendar.getInstance();
        fecha2.setTime(hoy);
        fecha2.set(Calendar.HOUR, 0);
        fecha2.set(Calendar.MINUTE, 0);
        fecha2.set(Calendar.SECOND, 0);
        fecha2.set(Calendar.MILLISECOND, 0);
        int dif=fecha2.get(Calendar.YEAR)-fecha1.get(Calendar.YEAR);
        if(dif<=0) dif=0;
        else if(fecha2.get(Calendar.MONTH)<fecha1.get(Calendar.MONTH))
            dif--;
        else if(fecha2.get(Calendar.MONTH)==fecha1.get(Calendar.MONTH))
            if(fecha2.get(Calendar.DAY_OF_MONTH)<fecha1.get(Calendar.DAY_OF_MONTH))
            dif--;
        
        return dif;
    }
}
