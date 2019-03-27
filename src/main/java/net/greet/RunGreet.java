package net.greet;

import java.util.Scanner;

public class RunGreet {

    public static void main(String[] args){

                Greet in = new Greet();

                System.out.println(" ***************WELCOME TO OUR GREETINGAPP*************** \n \n ----------WE ARE USING ENGLISH AS OUR DEFAULT LANGUAGE---------- \n --HOPEFULLY YOU WILL BE FREE AND BE ABLE TO SELECT YOUR COMFORTABLE LANGUAGE-- ");

                int i = 0;
                while(i < 5) {
                    in.getName();
                    in.getLang();
                    i++;
                }
                in.greet();


    }
}
