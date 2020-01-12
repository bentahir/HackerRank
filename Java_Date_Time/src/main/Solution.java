package main;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.DayOfWeek;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar Cal = Calendar.getInstance();
        Cal.clear();
        Cal.set(year, month-1, day);
        
        int dayNum = Cal.get(Calendar.DAY_OF_WEEK);
        //System.out.println("calender"+Cal.getTime());
        String res ="";
        switch (dayNum) {
        case Calendar.MONDAY :
        	res = "MONDAY";
        	break;
        case Calendar.TUESDAY :
        	res = "TUESDAY";
        	break;
        case Calendar.WEDNESDAY :
        	res = "WEDNESDAY";
        	break;
        case Calendar.THURSDAY :
        	res = "THURSDAY";
        	break;
        case Calendar.FRIDAY :
        	res = "FRIDAY";
        	break;
        case Calendar.SATURDAY :
        	res = "SATURDAY";
        	break;
        case Calendar.SUNDAY:
        	res = "SUNDAY";
        	break;
        default:
        	res = "OTHERS";
        }
        return (res);

        
        
    }

}

public class Solution {
	
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        System.out.println(res);

        bufferedReader.close();

    }
}

