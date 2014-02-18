package Day10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by aditya on 2/17/14.
 */
final public class DateUtils {
    public Date getCurrentDate(){

        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd yyyy");//date format
        Date date = new Date();//current date
        System.out.println(dateFormat.format(date));

    return date;

    }
    public Calendar getAd (String bs){

        DateFormat dateFormat = new SimpleDateFormat("MM dd yyyy");//date format

        Calendar ad = Calendar.getInstance();
        try { ad.setTime(dateFormat.parse(bs));

        } catch (ParseException e){
            System.out.println("Invalid");
        }

        ad.add(Calendar.YEAR, -56);
        ad.add(Calendar.MONTH, -8);
        ad.add(Calendar.DAY_OF_MONTH, -17);
        ad.getTime();

        System.out.println("Your AD date for " +bs+ " BS : "+dateFormat.format(ad.getTime()));

        return ad;
    }
    public Calendar getBs (String ad){

        DateFormat dateFormat = new SimpleDateFormat("MM dd yyyy");//date format

        Calendar bs = Calendar.getInstance();
        try { bs.setTime(dateFormat.parse(ad));

        } catch (ParseException e){
            System.out.println("Invalid");
        }

        bs.add(Calendar.YEAR, +56);
        bs.add(Calendar.MONTH, +8);
        bs.add(Calendar.DAY_OF_MONTH, +17);
        bs.getTime();

        System.out.println("Your BS date for " +ad+ " AD : "+dateFormat.format(bs.getTime()));

        return bs;

    }
}
