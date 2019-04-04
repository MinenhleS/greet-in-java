package net.greet;


import java.util.ArrayList;
import java.util.Scanner;

public class Greet {

    String name;
    String lang;
    String command;

    int countZulu;
    int countAfrikaans;
    int countTswana;

    public Greet() {

    }

    public void GreetM(String name, String lang) {

        if(lang == null) {
            lang = "Xhosa";
        }

        this.name = name;
        this.lang = lang;

    }


    public void setName(String name) {

        this.name = name;
    }

    public String getName() {
        return name;

    }

    public void setLang(String lang) {
        this.lang = lang;
    }


    public String getLang() {
        return getLang();
    }


    public void addUser() {

        Scanner input = new Scanner(System.in);
        System.out.println(input.nextLine());

        while (true) {

            System.out.println("Enter a command : ");
            command = input.nextLine();
            String[] word = command.split("");

            try {

                if (word[0].equalsIgnoreCase("greet")) {
                    Languages.valueOf(word[2]);
                    System.out.println(word[1]);
                }

            } catch (Exception e) {
                System.out.println("Check your typings");
            }





            System.out.println("Added!");
            System.out.println(" \n \n ");

            String option = "";
            System.out.println("You want to continue ??? Y / N  \n");
            option = input.next();

            if (!option.equalsIgnoreCase("Y")) {
                break;

            }

        }


    }
}
