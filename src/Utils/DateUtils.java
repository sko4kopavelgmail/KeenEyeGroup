package Utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateUtils {

    // #1 - Сделать функционал для каста между java.util.Date в LocalDate, LocalDateTime.
    public LocalDate getLocalDateFromDate(Date date) {
        return new java.sql.Date(date.getTime()).toLocalDate();
    }

    public Date getDateFromLocaldate(LocalDate locdate) {
        return java.sql.Date.valueOf(locdate);
    }

    public LocalDateTime getLocalDateTimeFromDate(Date date) {
        return new java.sql.Timestamp(date.getTime()).toLocalDateTime();
    }

    public Date getDateFromLocaldateTime(LocalDateTime locdatetime) {
        return java.sql.Timestamp.valueOf(locdatetime);
    }

    // #2 - Сделать функционал для увеличения или уменьшения даты в любом из методов путем перегрузки функции.
    public void getChangeDate(Date date, int shift) {    // c Date
        Calendar one = new GregorianCalendar();
        one.setTime(date);
        System.out.println(one.getTime());
        one.add(Calendar.DAY_OF_YEAR, shift);
        one.add(Calendar.MONTH, shift);
        one.add(Calendar.YEAR, shift);
        System.out.println(one.getTime());
    }

    public void getChangeDate(LocalDate locdate, int shift) {    // c LocaleDate
        System.out.println(locdate);
        locdate = locdate.plusYears(shift);
        locdate = locdate.plusMonths(shift);
        locdate = locdate.plusDays(shift);
        System.out.println(locdate);
    }

    // #3 - Познакомиться с DateTimeFormatter. Сделать функцию вывода даты в связке с FormatStyle.
    public void getDateOutput() {
        LocalDate anotherSummerDay = LocalDate.now();
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(anotherSummerDay));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(anotherSummerDay));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(anotherSummerDay));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(anotherSummerDay));
    }

    // #4 - Сделать функцию сравнения дат.
    public void getDateComparison() throws ParseException {
        SimpleDateFormat sdfo = new SimpleDateFormat("dd.MM.yyyy");
        Date date1 = sdfo.parse("31.03.2018");
        Date date2 = sdfo.parse("31.03.2012");
        if (date1.after(date2)) {
            System.out.println("Первая дата больше второй");
        } else if (date1.before(date2)) {
            System.out.println("Первая дата меньше второй");
        } else if (date1.equals(date2)) {
            System.out.println("Даты равны");
        }
    }

    // #5 - Получить разницу между датами в днях.
    public void getDifferenceBetweenDates() {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            Date date1 = dateFormat.parse("15.05.2018");
            Date date2 = dateFormat.parse("17.05.2018");
            long milliseconds = date2.getTime() - date1.getTime();
            int days = (int) (milliseconds / (24 * 60 * 60 * 1000));
            System.out.println("Разница между датами в днях: " + days);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // #6 - Узнать день недели, месяца и года по текущей дате. Так же текущий месяц и порядковый номер недели.
    public void getDateInformation() throws ParseException {
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("EEEE");
        String day = format.format(date);
        System.out.println("День недели: " + day);
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = localDate.getMonthValue();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int numOfWeek = cal.get(Calendar.WEEK_OF_YEAR);
        System.out.println("Порядковый номер недели: " + numOfWeek);
        int numDayOfYear = localDate.getDayOfYear();
        System.out.println("День года: " + numDayOfYear);
        int numDayOfMonth = localDate.getDayOfMonth();
        System.out.println("День месяца: " + numDayOfMonth);
        Month jan = Month.of(month);
        Locale loc = Locale.forLanguageTag("ru");
        System.out.println("Текущий месяц: " + jan.getDisplayName(TextStyle.FULL_STANDALONE, loc));
    }
}