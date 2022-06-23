package com.lun.bito.api.demo.dateAndTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class Result  {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) throws ParseException {
        String[] weekDays = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };

        StringBuffer sf = new StringBuffer();
        sf.append(year).append("-").append(month).append("-").append(day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//.getCalendar().get(Calendar.DAY_OF_WEEK
        Calendar cal = Calendar.getInstance();
        Date date= sdf.parse(sf.toString());
        cal.setTime(date);
//        System.out.println(cal.get(Calendar.DAY_OF_WEEK)-1);
        return weekDays[cal.get(Calendar.DAY_OF_WEEK)-1];
    }

}

public class Solution {
    public static void main(String[] args) throws ParseException,Exception {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int month = Integer.parseInt(firstMultipleInput[0]);
//
//        int day = Integer.parseInt(firstMultipleInput[1]);
//
//        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(06, 22, 2022);

//        bufferedWriter.write(res);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
