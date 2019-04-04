package net.greet;

import java.util.ArrayList;
import java.util.Scanner;

public class RunGreet {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println(" \n ***************WELCOME TO OUR GREETINGAPP*************** \n \n ");

        Greet in = new Greet();
        String[] cmd = input.spl

        while (true) {

            if("greet"){
                String language = null;
                if(cmd.length == 3) {
                    language = cmd[2];
                }

                in.GreetM(cmd[1], language);
            }
        }
        in.addUser();


    }




}