package com.company;

import java.util.Scanner;

public class HamburgerHealthy extends Hamburger {
    public HamburgerHealthy(String rollType) {
        super(rollType);
    }

    @Override
    public  void dodatkiDoHamburgera(){

        int licznikDodatkow = 6;
        while (true) {
            Scanner scan = new Scanner(System.in);
            if(licznikDodatkow == 0){
                break;
            }
            System.out.println("Możesz wybrać do 4 dodatków, dostępne są: ketchup/salata/marchewka/pomidor/jajko/kura");
            System.out.println("Możesz wybrać jeszcze " + licznikDodatkow + " dodatki");
            String wyborDodatku = scan.nextLine();
            licznikDodatkow --;
            switch (wyborDodatku) {

                case "ketchup":
                    System.out.println("Ketchup kosztował 1 zł");
                    this.totalPrice += 1;
                    if(licznikDodatkow > 0) {
                        System.out.println("Chcesz jeszcze jakiś dodatek? tak/nie");
                        String chceszJeszczeDodatek = scan.nextLine();
                        if (chceszJeszczeDodatek.equals("tak")) {
                            System.out.println("OK ok");
                            break;
                        } else {
                            licznikDodatkow = 0;
                        }
                    }
                    if(licznikDodatkow == 0){
                        continue;
                    }
                    else
                        continue;
                case "salata":
                    System.out.println("Salata kosztowała 2 zł");
                    this.totalPrice += 2;
                    if(licznikDodatkow > 0) {
                        System.out.println("Chcesz jeszcze jakiś dodatek? tak/nie");
                        String chceszJeszczeDodatek2 = scan.nextLine();
                        if (chceszJeszczeDodatek2.equals("tak")) {
                            System.out.println("OK ok");
                            break;
                        } else {
                            licznikDodatkow = 0;
                        }
                    }
                    if(licznikDodatkow == 0){
                        continue;
                    }
                    else
                        continue;


                case "kura":
                    System.out.println("Kura kosztowała 8 zł");
                    this.totalPrice += 8;
                    if(licznikDodatkow > 0) {
                        System.out.println("Chcesz jeszcze jakiś dodatek? tak/nie");
                        String chceszJeszczeDodatek3 = scan.nextLine();
                        if (chceszJeszczeDodatek3.equals("tak")) {
                            System.out.println("OK ok");
                            break;
                        } else {

                            licznikDodatkow = 0;
                        }
                    }
                    if(licznikDodatkow == 0){
                        continue;
                    }
                    else
                        continue;


                case "pomidor":
                    System.out.println("Pomidor kosztował 2 zł");
                    if(licznikDodatkow > 0) {
                        this.totalPrice += 2;
                        System.out.println("Chcesz jeszcze jakiś dodatek? tak/nie");
                        String chceszJeszczeDodatek4 = scan.nextLine();
                        if (chceszJeszczeDodatek4.equals("tak")) {
                            System.out.println("OK ok");
                            break;
                        }
                        else {
                            licznikDodatkow = 0;
                        }
                    }
                    if(licznikDodatkow == 0){
                        continue;
                    }
                case "jajko":
                    System.out.println("Jajko kosztowało 5 zł");
                    this.totalPrice += 3;
                    if(licznikDodatkow > 0) {
                        System.out.println("Chcesz jeszcze jakiś dodatek? tak/nie");
                        String chceszJeszczeDodatek5 = scan.nextLine();
                        if (chceszJeszczeDodatek5.equals("tak")) {
                            System.out.println("OK ok");
                            break;
                        } else {

                            licznikDodatkow = 0;
                        }
                    }
                    if(licznikDodatkow == 0){
                        continue;
                    }
                    else
                        continue;
                case "marchewka":
                    System.out.println("Marchewka kosztował 3 zł");
                    this.totalPrice += 3;
                    if(licznikDodatkow > 0) {
                        System.out.println("Chcesz jeszcze jakiś dodatek? tak/nie");
                        String chceszJeszczeDodatek6 = scan.nextLine();
                        if (chceszJeszczeDodatek6.equals("tak")) {
                            System.out.println("OK ok");
                            break;
                        } else {

                            licznikDodatkow = 0;
                        }
                    }
                    if(licznikDodatkow == 0){
                        continue;
                    }
                    else
                        continue;

                default:
                    System.out.println("Niewlasciwy wybór");
                    licznikDodatkow++;
                    break;

            }
        }

    }
}
