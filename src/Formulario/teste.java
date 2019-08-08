package Formulario;

import java.sql.Timestamp;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import static mondrian.olap.fun.vba.Vba.date;

public class teste {

    public static void main(String... args) {

        LocalTime time1 = LocalTime.of(8, 00, 12);
        LocalTime time2 = LocalTime.of(9, 05, 12);
        LocalTime time3 = LocalTime.of(10, 00, 12);
        LocalTime time4 = LocalTime.of(12, 00, 12);

//        System.out.println("horas1:" + time1);
//        System.out.println("horas2:" + time2);
//        System.out.println("horas3:" + time3);
//        System.out.println("horas4:" + time4);
        Duration diff = null;
        Duration diff1 = null;
        for (int i = 0; i < 2; i++) {
            diff = Duration.between(time1, time2);

            diff1 = Duration.between(time3, time4);

        }

//        Duration diff = Duration.between(time1, time2);
//
//        Duration diff1 = Duration.between(time3, time4);
        long hours = diff.toHours(); //75
        long minutes = diff.minusHours(hours).toMinutes(); //15

        long hours1 = diff1.toHours(); //75

        long minutes1 = diff1.minusHours(hours1).toMinutes(); //15

        long soma = 0;
        soma += minutes + minutes1;
        System.out.println("MUNUTOS soma" + soma);

        System.out.println("HORAS sTRING:" + hours);
        System.out.println("MUNUTOS sRING:" + minutes);

        java.util.GregorianCalendar gc = new java.util.GregorianCalendar();
        gc.setTime(new java.util.Date());
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("hh:mm:ss");
        System.out.println("dd: " + sdf.format(gc.getTime()));
        gc.add(java.util.Calendar.MINUTE, 30);
        System.out.println("dd1: " + sdf.format(gc.getTime()));
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Calendar cal = GregorianCalendar.getInstance();
        System.out.println("Agora: " + cal.get(Calendar.MONTH));

        // Qual é o dia da semana do dia primeiro DESTE mês?
        cal.setTime(new java.util.Date());
        cal.set(Calendar.DAY_OF_MONTH, -1);
        int diaPrimeiro = cal.get(Calendar.DAY_OF_WEEK); // Calendar.SUNDAY ... Calendar.SATURDAY
        System.out.println("Teste 1: " + diaPrimeiro);
        // Qual é o último dia deste mês?
        int ultimoDia = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        int pos = diaPrimeiro - Calendar.SUNDAY; // a partir de que JLabel lblDatas vamos contar de 1 a ultimoDia
        System.out.println("Teste 2: " + diaPrimeiro);
        //-- Pondo os dias de 1 a ultimoDia
        System.out.println("***********************************************************");
        GregorianCalendar agora = new GregorianCalendar();
        int mes = (agora.get(Calendar.MONTH) + 1);
        int diadasemana = agora.get(Calendar.DAY_OF_WEEK);

        System.out.println();
        System.out.println("Estamos no mes " + mes + " e hoje e o " + diadasemana + "o dia da semana.");
        System.out.println("A semana comeca no DOMINGO!");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        java.text.SimpleDateFormat sdf1 = new java.text.SimpleDateFormat("dd/MM/yyyy");
        Date data = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(data);
        c.set(Calendar.DAY_OF_MONTH, 0);
        c.add(Calendar.DAY_OF_MONTH, 0 );
        System.out.println("OLHA: "+sdf1.format(c.getTime()));
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        
        Timestamp ts = Timestamp.valueOf("2019-03-26 08:00:30");
        System.out.println("Esse: "+ts);
        
    }
}
