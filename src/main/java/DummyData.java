//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.time.format.DateTimeFormatter;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.TimeZone;
//
//public class DummyData {
//    public static void main(String[] args)
//    {
//        parse("2002-10-10T12:00:00-05:00");
//        parse("2002-10-10T17:00:00Z");
//    }
//
//    private static final DateTimeFormatter XML_DATE_TIME_FORMAT =
//            ISODateTimeFormat.dateTimeNoMillis();
//
//    private static final DateTimeFormatter CHECKING_FORMAT =
//            ISODateTimeFormat.dateTime().withZone(DateTimeZone.UTC);
//
//    static void parse(String text)
//    {
//        System.out.println("Parsing: " + text);
//        DateTime dt = XML_DATE_TIME_FORMAT.parseDateTime(text);
//        System.out.println("Parsed to: " + CHECKING_FORMAT.print(dt));
//    }
//}
