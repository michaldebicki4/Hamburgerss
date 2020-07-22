package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Hamburger {
    public String rollType;
    public boolean meat;
    public int totalPrice;

    public Hamburger(String rollType) {
        this.rollType = rollType;
        this.meat = true;
        this.totalPrice = 0;

    }

    public String getRollType() {
        return rollType;
    }

    public boolean isMeat() {
        return meat;
    }
    public  void dodatkiDoHamburgera(){

        int licznikDodatkow = 4;
        while (true) {
            Scanner scan = new Scanner(System.in);
            if(licznikDodatkow == 0){
                break;
            }
            System.out.println("Możesz wybrać do 4 dodatków, dostępne są: ketchup/salata/marchewka/pomidor");
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


                case "marchewka":
                    System.out.println("Marchewka kosztowała 3 zł");
                    this.totalPrice += 3;
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
                    default:
                        System.out.println("Niewlasciwy wybór");
                        licznikDodatkow++;
                        break;


            }
        }

    }


    public void zamowJedzenie(){
        while (true) {
            System.out.println("Czy chcesz zamowic jedzenie?: tak/nie");
            Scanner scan = new Scanner(System.in);
            String ifYouWant = scan.nextLine();
            if (ifYouWant.equals("tak")) {
                while (true) {
                    System.out.println("Jakiego burgersa chcesz zjesc?: deluxe/healthy/normal");
                    String whichBurgerYouWant = scan.nextLine();
                    if (whichBurgerYouWant.equals("normal")) {
                        this.totalPrice += 6 + 4;
                        dodatkiDoHamburgera();
                        System.out.println("Dodac innego burgera?: tak/nie");
                        String addBurger = scan.nextLine();
                        System.out.println("Na razie cena to: " + totalPrice);
                        if(addBurger.equals("tak")){
                        }
                        else {
                            System.out.println("Ostateczna cena to: " + totalPrice);
                            break;
                        }
                    }
                    else if (whichBurgerYouWant.equals("deluxe")) {
                        this.totalPrice += 6 + 4;
                        //HamburgerDeluxe.dodatkiDoHamburgera();
                        System.out.println("Dodac innego burgera?: tak/nie");
                        String addBurger = scan.nextLine();
                        System.out.println("Na razie cena to: " + totalPrice);
                        if(addBurger.equals("tak")){
                        }
                        else {
                            System.out.println("Ostateczna cena to: " + totalPrice);
                            break;
                        }
                    }
                    else if (whichBurgerYouWant.equals("healthy")) {
                        this.totalPrice += 6 + 6;
                        dodatkiDoHamburgera();
                        System.out.println("Dodac innego burgera?: tak/nie");
                        String addBurger = scan.nextLine();
                        System.out.println("Na razie cena to: " + totalPrice);
                        if(addBurger.equals("tak")){
                        }
                        else {
                            System.out.println("Ostateczna cena to: " + totalPrice);
                            break;
                        }
                        break;

                    }
                    else {
                        System.out.println("Nie ma takiego burgerka");

                    }
                }
                break;

            }
            else if(ifYouWant.equals("nie")) {
                System.out.println("Ok ok");
                break;
            }
            else {
                System.out.println("Niewlasciwa odpowiedz");

            }
        }

    }
}
