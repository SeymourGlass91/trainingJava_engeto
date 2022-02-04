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

        BigDecimal spotrebaVozidla = BigDecimal.valueOf(6.7); // može byt aj double ale chcel som skusit bigdecimal
        System.out.println("Spotreba vozidla : " + spotrebaVozidla + "l");

        double mnozstviKabelu = 37.7;
        System.out.println("Mnozstvi kabelu : " + mnozstviKabelu + "m");

        LocalDate datumNarozeni = LocalDate.of (1991, 6, 4);
        System.out.println("Datum narozeni klienta : " + datumNarozeni );

        String spz = "MT-42631";
        System.out.println("Spz vozidla : " + spz );

        String ipAdresa = "191.168.1.1";
        System.out.println("Ip adresa klienta :  " + ipAdresa );


        System.out.println("___________________________________________");

        // Úkol: Oprav chybný kód
        ukol1();
        ukol2();
        ukol3();
        ukol4();
        ukol5();
        ukol6();
        ukol7();
        ukol8();
        ukol9();

    }

    public static void ukol1() {
        System.out.println("Hello world!");
    }
    public static void ukol2() {
        String uzivatel = "Karel";
        System.out.println(uzivatel);
    }

    public static void ukol3() {
        int pocetLekci = 10;
        System.out.println(pocetLekci);
    }

    public static void ukol4() {
        double cena = 10.0;
        System.out.println(cena);
    }

    public static void ukol5() {
        BigDecimal cena = new BigDecimal(0);
        for (int i = 0; i < 10; i++) {
            cena = cena.add(BigDecimal.valueOf(0.1));
        }
        System.out.println(cena);
        // Má vypsat "1.0". Ale vypíše "0.9999" !!!
    }

    public static void ukol6() {
        BigDecimal cena = new BigDecimal(0);
        cena = cena.add(BigDecimal.valueOf(0.1));
        System.out.println(cena);
    }

    public static void ukol7() {
        int vykonMotoru = 120;
        System.out.println("Výkon Motoru je: " + vykonMotoru + " kW.");
    }

    public static void ukol8() {
        int velikostKosile = 37;
        System.out.println("Velikost košile je: " + velikostKosile + ".");
    }

    public static void ukol9() {
        System.out.println("Metoda *skoro* bez chybičky!");
    }

}
