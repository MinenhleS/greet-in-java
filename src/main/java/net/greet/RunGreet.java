package net.greet;

import java.util.Scanner;

public class RunGreet {

    public static void main(String[] args) {

        Greet in  = new Greet();
        // GreetDB in = new GreetDB();

        String command;
        Scanner input = new Scanner(System.in);
        System.out.println(" \n ***************WELCOME TO OUR GREETINGAPP*************** \n \n ");

        CommandProcessor commandProcessor = new CommandProcessor(in);

        while (true) {

                System.out.println("\nEnter a command : ");
                command = input.nextLine();

            if (command.equalsIgnoreCase("exit")) {
                System.out.println( " \n Goodbye have a nice day !!!");
                break;
            }

                System.out.println(commandProcessor.execute(command));


        }
    }
}