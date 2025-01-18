import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;
import java.time.temporal.ValueRange;
import java.util.Date;

public class DateTimeImpl {
   public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate ofLocalDate = LocalDate.of(1, 1, 1);
        LocalDate ofEpochDayLocalDate = LocalDate.ofEpochDay(6665);
        LocalDate instantLocalDate = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
        LocalDate ofYearLocalDate = LocalDate.ofYearDay(2016, 45);
        LocalDate localDate2 = LocalDate.of(2015, Month.APRIL, 5);
        LocalDate localDate3 = LocalDate.EPOCH;
        LocalDate localDate4 = LocalDate.MAX;
        LocalDate localDate5 = LocalDate.MIN;

        // Printing LocalDate variables
        System.out.println("localDate: " + localDate);
        System.out.println("ofLocalDate: " + ofLocalDate);
        System.out.println("ofEpochDayLocalDate: " + ofEpochDayLocalDate);
        System.out.println("instantLocalDate: " + instantLocalDate);
        System.out.println("ofYearLocalDate: " + ofYearLocalDate);
        System.out.println("localDate2: " + localDate2);
        System.out.println("localDate3 (EPOCH): " + localDate3);
        System.out.println("localDate4 (MAX): " + localDate4);
        System.out.println("localDate5 (MIN): " + localDate5);

        LocalTime localTime = LocalTime.now();
        LocalTime ofLocalTime = LocalTime.of(12, 34, 56);
        LocalTime ofInstantLocalTime = LocalTime.ofInstant(Instant.ofEpochMilli(6678), ZoneId.systemDefault());
        LocalTime nanoOfDayLocalTime = LocalTime.ofNanoOfDay(4*60*60*1000000000L);
        LocalTime minLocalTime = LocalTime.MIN;
        LocalTime maxLocalTime = LocalTime.MAX;
        LocalTime midnightLocalTime = LocalTime.MIDNIGHT;

        // Printing LocalTime variables
        System.out.println("localTime: " + localTime);
        System.out.println("ofLocalTime: " + ofLocalTime);
        System.out.println("ofInstantLocalTime: " + ofInstantLocalTime);
        System.out.println("nanoOfDayLocalTime: " + nanoOfDayLocalTime);
        System.out.println("minLocalTime: " + minLocalTime);
        System.out.println("maxLocalTime: " + maxLocalTime);
        System.out.println("midnightLocalTime: " + midnightLocalTime);



        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.of(ofYearLocalDate, ofLocalTime);

        // Printing LocalDateTime variables
        System.out.println("localDateTime: " + localDateTime);
        System.out.println("localDateTime2: " + localDateTime2);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        OffsetDateTime  offsetDateTime = OffsetDateTime.now();

        // Printing ZonedDateTime and OffsetDateTime
        System.out.println("zonedDateTime: " + zonedDateTime);
        System.out.println("offsetDateTime: " + offsetDateTime);

        Instant instant = Instant.now();
        // Printing Instant variables
        System.out.println("instant: " + instant);
        
        Duration duration = Duration.ofSeconds(15);
        Period period = Period.of(1, 2, 5);

        // Printing Duration and Period
        System.out.println("duration: " + duration);
        System.out.println("period: " + period);

        // Temporal Field - represents a field of date-time that can be queried or manipulated.
        /*
         * Represents Date-Time Components: Defines fields like YEAR, MONTH_OF_YEAR, DAY_OF_MONTH, etc., which represent parts of a date-time.
         * Querying and Manipulation: Used to access or modify values in date-time objects via methods like get(), getLong(), and range().
         * Valid Range of Values: Each TemporalField has a specific range of valid values, which can vary depending on the context (e.g., the range of DAY_OF_MONTH depends on the month).
         * Implemented by ChronoField: ChronoField is the main implementation, providing standard fields for common date-time components.
         * ChronoField, an implementation of TemporalField, is an enum that contains constants representing different temporal fields. We can access these fields directly and call various methods on them.
         */

        TemporalField temporalField = ChronoField.MINUTE_OF_HOUR;
        TemporalUnit temporalUnit = ChronoField.MINUTE_OF_HOUR.getBaseUnit();

        long checkValidateMinuteOfHour = ChronoField.MINUTE_OF_HOUR.checkValidValue(58);


        TemporalUnit hourTemporalUnit = ChronoField.MINUTE_OF_HOUR.getBaseUnit();
        ValueRange minuteValueRange = ChronoField.MINUTE_OF_HOUR.range();

        long example78 = Period.of(2024, 9, 2).get(ChronoUnit.YEARS);

        // Printing TemporalField, TemporalUnit, and related values
        System.out.println("temporalField: " + temporalField);
        System.out.println("temporalUnit: " + temporalUnit);
        System.out.println("checkValidateMinuteOfHour: " + checkValidateMinuteOfHour);
        System.out.println("hourTemporalUnit: " + hourTemporalUnit);
        System.out.println("minuteValueRange: " + minuteValueRange);
        System.out.println("example78: " + example78);
        /*
         * Date and Time Comparison
            To compare two dates, we can use the isBefore and isAfter methods to determine if a date is before or after a given date, respectively. 
            To check if two temporal objects are equal, we use the equals method.
            **It will return false if the types differ, even if their date and time information matches.
         * 
         */

        boolean dateIsBeforeFunction = LocalDate.of(2024, 9, 2)
        .isBefore(LocalDate.of(2024, 9, 2));
        // false

        boolean dateEqualsFunction = LocalDate.of(2024, 9, 2)
                .equals(LocalDate.of(2024, 9, 2));
        // true

        boolean dateIsAfterFunction = LocalTime.of(4, 9, 2)
                .isAfter(LocalTime.of(10, 9, 3));
        // true

        boolean isAfterInstantFunction = Instant.MAX.isAfter(Instant.MIN);

        // Printing Date and Time Comparison results
        System.out.println("dateIsBeforeFunction: " + dateIsBeforeFunction);
        System.out.println("dateEqualsFunction: " + dateEqualsFunction);
        System.out.println("dateIsAfterFunction: " + dateIsAfterFunction);
        System.out.println("isAfterInstantFunction: " + isAfterInstantFunction);



        // Converting temporal objects From String
        LocalDate example115 = LocalDate.parse("2024-09-02");
        // 2024-09-02

        LocalTime example116 = LocalTime.parse("10:15");
        // 10:15

        LocalDateTime example117 = LocalDateTime.parse("2024-09-02T10:15");
        // 2024-09-02T10:15

        Instant example118 = Instant.parse("2024-09-04T10:15:00.00Z");
        // 2024-09-04T10:15:00Z

        Period example119 = Period.parse("P2Y3M5D");
        // P2Y3M5D

        Duration example120 = Duration.parse("PT48H30M");
        // PT48H30M
        // Printing temporal object conversions from strings
        System.out.println("example115: " + example115);
        System.out.println("example116: " + example116);
        System.out.println("example117: " + example117);
        System.out.println("example118: " + example118);
        System.out.println("example119: " + example119);
        System.out.println("example120: " + example120);

        /*
         * 
         * A DateTimeFormatter is a class from the Date and Time API that is used to define and apply custom or predefined patterns 
         * for formatting and parsing date and time objects. It allows developers to convert temporal objects (like LocalDate, LocalTime, LocalDateTime) to strings, 
         * or parse strings into date/time objects, based on specific patterns or styles.
         */

         LocalDate example121 = LocalDate.parse("2024-09-04", DateTimeFormatter.ISO_LOCAL_DATE);
        // 2024-09-04

        LocalDate example122 = LocalDate
                .parse("20240904", DateTimeFormatter.BASIC_ISO_DATE);
        // 2024-09-04

        LocalDate example123 = LocalDate
                .parse("2024-W36-3", DateTimeFormatter.ISO_WEEK_DATE);
        // 2024-09-04
        
        // Or create our own:

        LocalDate example124 = LocalDate.parse("2024/09/04",
                DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        // 2024-09-04

        // Printing DateTimeFormatter examples
        System.out.println("example121: " + example121);
        System.out.println("example122: " + example122);
        System.out.println("example123: " + example123);
        System.out.println("example124: " + example124);

        // Conversion From legacy code

        /*
         * There’s no direct method to convert from java.util.Date to LocalDate, LocalTime, orLocalDateTime. 
         * To handle this, you first convert the java.util.Date to an Instant, and then convert the Instant to one of the new temporal classes.
         */     

        LocalDate example136 = LocalDate
                .ofInstant(Date.from(Instant.ofEpochSecond(1725494870L)).toInstant(),
                ZoneId.of("America/Chicago"));
        // 2024-09-04

        LocalTime example137 = LocalTime
                .ofInstant(Date.from(Instant.ofEpochSecond(1725494870L)).toInstant(),
                ZoneId.of("America/Chicago"));
        // 19:07:50

        LocalDateTime example138 = LocalDateTime
                .ofInstant(Date.from(Instant.ofEpochSecond(1725494870L)).toInstant(),
                ZoneId.of("America/Chicago"));
        // 2024-09-04T19:07:50



        /*
        * Conversely, you can convert LocalDateTime to an Instant, and from the Instant to java.util.Date. 
        * Since LocalDate and LocalTime cannot be directly converted to an Instant, 
        * the workaround is to first combine them into a LocalDateTime, then convert that to an Instant, and finally to java.util.Date.
        */

        Date example139 = Date.from(LocalDateTime.of(2024, 9, 4, 10, 15)
                .toInstant(ZoneOffset.UTC));
        // Wed Sep 04 07:15:00 BRT 2024

        Date example140 = Date.from(LocalDate.of(2024, 9, 4).atStartOfDay()
                .toInstant(ZoneOffset.UTC));
        // Tue Sep 03 21:00:00 BRT 2024

        Date example141 = Date.from(LocalDateTime.of(LocalDate.of(2024, 9, 4), 
                    LocalTime.NOON)
                .toInstant(ZoneOffset.UTC));
        // Wed Sep 04 09:00:00 BRT 2024

        // Printing legacy code conversions
        System.out.println("example136: " + example136);
        System.out.println("example137: " + example137);
        System.out.println("example138: " + example138);
        System.out.println("example139: " + example139);
        System.out.println("example140: " + example140);
        System.out.println("example141: " + example141);
   } 
}
