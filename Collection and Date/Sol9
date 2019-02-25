import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Sol9 {

    public static void main(String[] args) {

        Date d1= new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss z");

        df.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        String Date1 = df.format(d1);
        System.out.println(Date1+ " : " + df.getTimeZone().getDisplayName());

        df.setTimeZone(TimeZone.getTimeZone("Europe/London"));
        String Date2 = df.format(d1);
        System.out.println(Date2+ " : " + df.getTimeZone().getDisplayName());


        df.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        String Date3 = df.format(d1);
        System.out.println(Date3+ " : " + df.getTimeZone().getDisplayName());

        df.setTimeZone(TimeZone.getTimeZone("Australia/Canberra"));
        String Date4 = df.format(d1);
        System.out.println(Date4+ " : " + df.getTimeZone().getDisplayName());
    }

}
