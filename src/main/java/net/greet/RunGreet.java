package net.greet;

import java.util.Scanner;

public class RunGreet {


    public static void main(String[] args) {

        String command;

        Scanner input = new Scanner(System.in);
        System.out.println(" \n ***************WELCOME TO OUR GREETINGAPP*************** \n \n ");

        Greet in = new Greet();

        while (true) {

                System.out.println(" \n Enter a command : ");
                command = input.nextLine();
                String[] word = command.trim().split("\\s");

            if(command.equalsIgnoreCase("exit")) {
                System.out.println(" \n Goodbye have a nice day !!!");
                break;
            }

                if (word[0].equalsIgnoreCase("greet")) {

                    if (word.length == 3) {


                        in.GreetM(word[1], word[2]);
                        in.adding(word[1]);

                        System.out.println(in.getLang() + ", " + in.getName());
                        System.out.println(" \n Added!");

                    }

                    else if (!(word.length == 3)) {
                        in.GreetM(word[1], null);
                        in.adding(word[1]);

                        System.out.println(in.getLang() + "," + in.getName());
                        System.out.println(" \n Added!");

                    }
                }

                else if (word[0].equalsIgnoreCase("greeted")) {


                        if (!(word.length == 2)) {
                                in.greeted();
                        }

                        else if (word.length == 2) {

                             in.greetedUsers(word[1]);
                        }
                }


                else if (word[0].equalsIgnoreCase("counter")) {

                    in.counter();
                }

                else if(word[0].equalsIgnoreCase("clear")){

                        if(!(word.length == 2)){
                            in.clear();
                        }
                        else if(word.length == 2){
                            in.clear(word[1]);
                        }
                }

                else if(word[0].equalsIgnoreCase("help"){


            }



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