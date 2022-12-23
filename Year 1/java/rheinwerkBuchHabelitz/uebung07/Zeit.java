package uebung07;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Year;
import java.time.temporal.ChronoUnit;

public class Zeit {
    public static void main(String[] args) {
        Instant zeitpunkt = Instant.now();
        Instant ende = zeitpunkt.plus(10, ChronoUnit.DAYS);

        System.out.println(zeitpunkt);
        System.out.println(ende);

        Year jahr = Year.now();
        System.out.println(jahr);
        System.out.println(jahr.isLeap());

        LocalTime time = LocalTime.now();
        System.out.println(time);
        

    }
}
