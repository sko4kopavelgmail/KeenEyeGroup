package Utils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DateUtils {

    public static void DateUtils(){

        System.out.println("Date Utill Activity v1.0  - Start:");

        boolean go = true;
        while (go) {
            System.out.println("This utility is designed for working with dates. Please select one of the menu items::" +
                "\n 1 - Change date!"+
                    "\n 2 - Converted date!"+
                "\n 3 - Date comparison" +
                "\n 4 - Get the difference between dates in days" +
                "\n 5 - Get the day of the week, month, and week sequence number for the specified date" +
                "\n 0 - Exit the utility");

            try {


                switch (getInt()) {
                    case 0:
                        go = false;
                        break;
                    case 1:
                        changeDate(DateReader());
                        break;
                    case 2:
                        Date date = DateReader();
                        LocalDate localDate = convertToLocalDateViaInstant(date);
                        System.out.println("Date:"+date+"\n To convert LocalDate:"+localDate);
                        break;
                    case 3:
                        Equals(DateReader(),DateReader());
                        break;
                    case 4 :
                        dateDay(DateReader(),DateReader());
                        break;
                    case 5 :
                        DayOfWeek(DateReader());
                        break;
                }
            } catch (IllegalArgumentException iae) {
                System.out.println("Unknown command.  View the available commands.");
            }
        }
    }

    private static void changeDate(Date date){
        LocalDate localDate = convertToLocalDateViaInstant(date);
        System.out.println("Date Change Utill  v1.0  - Start:");



        boolean go1 = true;
        while (go1) {
            System.out.println("This utility is designed for working with dates. Please select one of the menu items::" +
                    "\n 1 - Change the day of the week!" +
                    "\n 2 - Change the moth" +
                    "\n 3 - Change the year" +
                    "\n 0 - Exit the utility");

            int comand = getInt();

            try {


                switch (comand) {
                    case 0:
                        go1 = false;
                        break;
                    case 1:
                        System.out.println("Enter the number by which you want to change the parameter:");
                        int day = getInt();
                        PlusDay(localDate, day);
                        break;
                    case 2:
                        System.out.println("Enter the number by which you want to change the parameter:");
                        int moth = getInt();
                        PlusMonth(localDate, moth);
                        break;
                    case 3:
                        System.out.println("Enter the number by which you want to change the parameter:");
                        int year = getInt();
                        PlusYear(localDate, year);
                        break;
                    case 4 :
                        DayOfWeek(DateReader());
                        break;
                }
            } catch (IllegalArgumentException iae) {
                System.out.println("Unknown command.  View the available commands.");
            }
        }
    }

    private static int getInt()
    {
        Scanner in = new Scanner(System.in);
        String s;
        Pattern p = Pattern.compile("^\\d+$");
        Matcher m;

        do
        {
            System.out.println("Enter only valid numbers!");
            s = in.nextLine();
            m = p.matcher(s);
        } while(!m.matches());

        return Integer.parseInt(s);
    }

    private static Date DateReader(){
        Date date = null;
        System.out.println("Enter the date in the format \" dd. MM.yyyy\"");
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            date = sdf.parse(br.readLine());
        } catch (ParseException | IOException e) {
            System.out.println("Error, Please enter the date in the format \" dd. MM.yyyy\"");
            DateUtils();
        }

        return date;
    }

    private static LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
        return dateToConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    private static void PlusDay(LocalDate date,int n){
        LocalDate date1 = date.plusDays(n);
        System.out.println("Date:"+date + "\n Changed date:" + date1);
    }

    private static void PlusMonth(LocalDate date,int n){
        LocalDate date1 = date.plusMonths(n);
        System.out.println("Date:"+date + "\n Changed date:" + date1);
    }

    private static void PlusYear(LocalDate date,int n){
        LocalDate date1 = date.plusYears(n);
        System.out.println("Date:"+date + "\n Changed date:" + date1);
    }

    private static void Equals(Date date1,Date date2){

        if(date1.getTime()==date2.getTime()){
            System.out.println("Date"+date1+"="+date2);
        }else if(date1.getTime()<date2.getTime()){
            System.out.println("Date"+date1+"<"+date2);
        }else if (date1.getTime()>date2.getTime()) {
            System.out.println("Date"+date1+">"+date2);
        }else
            System.out.println("Comparison error! Check the entered data!");
    }

    private static void dateDay(Date date1, Date date2){
        long milliseconds = date2.getTime() - date1.getTime();
        System.out.println("The difference between dates is equal to" + (int) (milliseconds / (24 * 60 * 60 * 1000))+ "days");
    }

    private   static void DayOfWeek(Date date){
        DateFormat dateFormat = new SimpleDateFormat("- dd.MM.yyyy - EEEE", Locale.ENGLISH);
        System.out.println(dateFormat.format(date));
    }
}
