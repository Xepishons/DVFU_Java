import java.text.SimpleDateFormat;
import java.util.Date;

public class TestTime {
    public static void main(String args[]){
        Date date = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        System.out.println(formatForDateNow.format(date));
    }
}