package Main;

import java.util.Scanner;

//import Manager.Manager;
import Utils.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

/**
 * @autor Nikolay Shvedov
 */
public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner num = new Scanner(System.in);
        int shift = num.nextInt();

        Date date = new Date();
        SimpleDateFormat newDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
        String result = newDateFormat.format(date);
        LocalDate locdate = LocalDate.now();
        LocalDateTime locdatetime = LocalDateTime.now();

        DateUtils dateutils = new DateUtils();
        //1
        dateutils.getDateFromLocaldate(locdate);
        dateutils.getDateFromLocaldateTime(locdatetime);
        dateutils.getLocalDateFromDate(date);
        dateutils.getLocalDateTimeFromDate(date);
        //2
        dateutils.getChangeDate(date, shift);
        dateutils.getChangeDate(locdate, shift);
        //3
        dateutils.getDateOutput();
        //4
        dateutils.getDateComparison();
        //5
        dateutils.getDifferenceBetweenDates();
        //6
        dateutils.getDateInformation();
        /*System.out.println("Введите команду:");
        Manager manager = new Manager();
        Scanner num = new Scanner(System.in);
        while (true) {
            String input = num.nextLine();
            manager.manage(input);
        }*/
    }
}