package com.company.matus;

import org.w3c.dom.ranges.Range;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("1. Cvicenie faktura");
        System.out.println("___________________________________________");

        String jmeno = "Jan Novak";
        System.out.println("Jmeno a primeni klienta  : " + jmeno);

        int pocetNakupu = 15;
        System.out.println("Pocet Nakupu : " +pocetNakupu);

        String nazovMesta = "Ostrava";
        System.out.println("Nazov mesta klienta : " + nazovMesta);

        BigDecimal spotrebaVozidla = BigDecimal.valueOf(6.7);
        System.out.println("Spotreba vozidla : " + spotrebaVozidla + "l");

        double mnozstviKabelu = 37.7;
        System.out.println("Mnozstvi kabelu : " + mnozstviKabelu + "m");

        LocalDate datumNarozeni = LocalDate.of (1991, 6, 4);
        System.out.println("Datum narozeni klienta : " + datumNarozeni );

        String spz = "MT-42631";
        System.out.println("Spz vozidla : " + spz );

        String ipAdresa = "191.168.1.1";
        System.out.println("Ip adresa klienta : " + ipAdresa );





    }
}
