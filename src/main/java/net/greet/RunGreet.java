package net.greet;

import java.util.Scanner;

public class RunGreet {


    public static void main(String[] args) {

        String command;

        Scanner input = new Scanner(System.in);
        System.out.println(" \n ***************WELCOME TO OUR GREETINGAPP*************** \n \n ");

        Greet in = new Greet();

        while (true) {

            System.out.println("Enter a command : ");
            command = input.nextLine();
            String[] word = command.trim().split("\\s");

                if (word[0].equalsIgnoreCase("greet")) {
                    if (word.length == 3) {
                        in.GreetM(word[1], word[2]);
                        System.out.println(in.getLang() + ", " + in.getName());


                    }
                    if (!(word.length == 3)) {
                        in.GreetM(word[1], null);

                    }

                }


            System.out.println("Added!");
            System.out.println(" \n \n ");

            String option = "";
            System.out.println("You want to continue ??? Y / N  \n");
            option = input.nextLine();

            if (!option.equalsIgnoreCase("Y")) {
                break;

            }



        }
    }
}