package app.clase3.formato;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Formato {

    public static void main(String[] args) {
        //Formato.numberFormat();
        //Formato.monedaFormat();
        //Formato.gregorianCalendar();
        //Formato.dateFormat();
        
        //Formato.simpleDateFormat();
        Formato.compararFechas();
    }

    public static void compararFechas() {
        Calendar c1 = new GregorianCalendar(2011, 9, 1);
        Date fecha1 = c1.getTime();
        
        Calendar c2 = new GregorianCalendar(2011, 9, 3);
        Date fecha2 = c2.getTime();
        
        if (fecha1.after(fecha2)) {
            System.out.println("fecha1 es después que fecha2");
        }
        if (fecha1.before(fecha2)) {
            System.out.println("fecha2 es antes que fecha1");
        }
    }

    public static void simpleDateFormat() {
        DateFormat df = new SimpleDateFormat("E d MMMM");

        Date now = new Date();

        System.out.println(df.format(now));
    }

    public static void dateFormat() {
        Date now = new Date(); //UNIX TIME: NUMERO DE MILISEGUNDOS PASADOS DESDE 1 ENERO 1970
        System.out.println(now.getTime());

        DateFormat df = DateFormat.getDateInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        DateFormat df6 = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);

        System.out.println(df1.format(now));
        System.out.println(df2.format(now));
        System.out.println(df3.format(now));
        System.out.println(df4.format(now));
        System.out.println(df5.format(now));
        System.out.println(df6.format(now));
    }

    public static void gregorianCalendar() {
        GregorianCalendar ahora = new GregorianCalendar();
        // Crear una fecha
        //Calendar ahora = new GregorianCalendar(1968,5,9); //mes va de 0 a 11
        System.out.println("Fecha : " + ahora.getTime());
        System.out.println("Año: " + ahora.get(Calendar.YEAR));
        System.out.println("Mes: " + ahora.get(Calendar.MONTH));
        System.out.println("Día del mes: " + ahora.get(Calendar.DAY_OF_MONTH));
        //
        System.out.println("Hora: " + ahora.get(Calendar.HOUR));
        System.out.println("Minuto: " + ahora.get(Calendar.MINUTE));
        System.out.println("Segundo: " + ahora.get(Calendar.SECOND));
        System.out.println("Milisegundo: " + ahora.get(Calendar.MILLISECOND));
        //
        System.out.println("Primer día de la semana : " + ahora.getFirstDayOfWeek());
        System.out.println("Semana del mes: " + ahora.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Semana del año: " + ahora.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Día del año: " + ahora.get(Calendar.DAY_OF_YEAR));
    }

    public static void monedaFormat() {
        // Formato de moneda
        NumberFormat formatoAleman = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        formatoAleman.setGroupingUsed(false);

        NumberFormat formatoAmericano = NumberFormat.getCurrencyInstance(Locale.US);
        formatoAmericano.setGroupingUsed(true); //agrupa moneda

        Locale localePeru = new Locale("es", "PE");
        NumberFormat formatoPeru = NumberFormat.getCurrencyInstance(localePeru);
        formatoPeru.setGroupingUsed(false);

        System.out.println("Moneda Euro :" + formatoAleman.format(15000000));
        System.out.println("Moneda Dolar :" + formatoAmericano.format(15000000));
        System.out.println("Moneda Soles :" + formatoPeru.format(15000000));
    }

    public static void numberFormat() {
        NumberFormat nf = NumberFormat.getInstance(Locale.US);

        // Agrupar 
        nf.setGroupingUsed(true);
        System.out.println(nf.format(10000000.0045451));
        // No agrupar
        nf.setGroupingUsed(false);
        System.out.println(nf.format(10000000.0045451));

        System.out.println("Con 3 enteros mínimo");
        nf.setMinimumIntegerDigits(3);
        System.out.println(nf.format(12));

        System.out.println("Con 5 enteros máximo");
        nf.setMaximumIntegerDigits(5);
        System.out.println(nf.format(123456));

        System.out.println("Con 4 enteros máximo en los decimales");
        nf.setMaximumFractionDigits(4);
        System.out.println(nf.format(123.981454));

        System.out.println("Con 2 enteros mínimo en los decimales");
        nf.setMinimumFractionDigits(2);
        System.out.println(nf.format(45.2));
    }
}
