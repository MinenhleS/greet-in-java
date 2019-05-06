package net.greet;

import java.util.Scanner;

public class RunGreet {


    public static void main(String[] args) {

        String command;
        Scanner input = new Scanner(System.in);
        System.out.println(" \n ***************WELCOME TO OUR GREETINGAPP*************** \n \n ");

        while (true) {

                System.out.println("\nEnter a command : ");
                command = input.nextLine();

                CommandBuilder commandBuilder = new CommandBuilder(command);
                CommandProcessor commandProcessor = new CommandProcessor(commandBuilder);

            if (command.equalsIgnoreCase("exit")) {
                System.out.println( " \n Goodbye have a nice day !!!");
                break;
            }

                System.out.println(commandProcessor.execute());

        }
    }
}