package Day10;

import com.sun.xml.internal.messaging.saaj.util.FinalArrayList;

import java.util.Date;

/**
 * Created by aditya on 2/17/14.
 */
public class Driver {

    public static void main (String[] args){

    DateUtils dateUtils = new DateUtils();

        Date date=dateUtils.getCurrentDate();


        dateUtils.getAd("10 13 2070");//month-day-year


        dateUtils.getBs("02 17 2014");//month-day-year



    }




}

