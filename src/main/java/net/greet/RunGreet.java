package net.greet;

import java.util.Scanner;

public class RunGreet {


    public static void main(String[] args) {

        String command;

        Scanner input = new Scanner(System.in);
        System.out.println(" \n ***************WELCOME TO OUR GREETINGAPP*************** \n \n ");

        CommandProcessor commandProcessor = new CommandProcessor();

        while (true) {

                System.out.println("\nEnter a command : ");
                command = input.nextLine();

            if (command.equalsIgnoreCase("exit")) {
                System.out.println( " \n Goodbye have a nice day !!!");
                break;
            }

                System.out.println(commandProcessor.greet(command));

                    System.out.println("\n You want to continue ??? Y / N");
                    String option = input.nextLine();

                        if (!option.equalsIgnoreCase("Y")) {
                            break;

                        }



        }
    }
}