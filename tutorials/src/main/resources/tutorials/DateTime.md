```javax-snippet
{
    "title":"Date Time",
    "description":"",
    "input": [""],
    "tags" : ["oo"]
}
```
### Date-Time Overview
`java.time` package provides a rich set of utilities to represent Date-Time, based on ISO calendar following Gregorian rules.

**Instant**
>Instant represents the start of a nanosecond on the time, a.k.a [EPOCH](https://en.wikipedia.org/wiki/Epoch), similar to but more advance than `System.currentTimeMillis()` or `System.nanoTime()`. It's useful to generate machine timestamp.

```
Instant timestamp = Instant.now();
//to ISO-8601 format
System.out.println(timestamp.toString());
```

**Period**
>To define an amount of time with date-based values (years, months, days), use the Period class. The Period class provides various get methods, such as getMonths, getDays, and getYears, so that you can extract the amount of time from the period.

**Duration**
>This class models a quantity or amount of time in terms of seconds and nanoseconds. It can be accessed using other duration-based units, such as minutes and hours. In addition, the DAYS unit can be used and is treated as exactly equal to 24 hours, thus ignoring daylight savings effects.

**OffsetTime**
>A time with an offset from UTC/Greenwich in the ISO-8601 calendar system, such as *10:15:30+01:00*

**OffsetDateTime**
>A date-time with an offset from UTC/Greenwich in the ISO-8601 calendar system, such as *2007-12-03T10:15:30+01:00*.

**LocalTime**
>A time without a time-zone in the ISO-8601 calendar system, such as *10:15:30*.

**LocalDate**
>A date without a time-zone in the ISO-8601 calendar system, such as *2007-12-03*.

**LocalDateTime**
>A date-time without a time-zone in the ISO-8601 calendar system, such as *2007-12-03T10:15:30*

**ZonedDateTime**
>A date-time with a time-zone in the ISO-8601 calendar system, such as *2007-12-03T10:15:30+01:00* Europe/Paris.

**YearMonth**
>A year-month in the ISO-8601 calendar system, such as *2007-12*.

**Year**
>A year in the ISO-8601 calendar system, such as *2007*.

**MonthDay**
>A month-day in the ISO-8601 calendar system, such as *--12-03*.

**Month**
>A month-of-year, such as *July*.

**DayOfWeek**
>A day-of-week, such as 'Tuesday'.