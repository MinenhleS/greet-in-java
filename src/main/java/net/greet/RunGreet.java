package net.greet;

import java.util.ArrayList;
import java.util.Scanner;

public class RunGreet {



    public static void main(String[] args){

        ArrayList<Greet> usersList = new ArrayList<Greet>();

                System.out.println(" ***************WELCOME TO OUR GREETINGAPP*************** \n \n ----------WE ARE USING ENGLISH AS OUR DEFAULT LANGUAGE---------- \n --HOPEFULLY YOU WILL BE FREE AND BE ABLE TO SELECT YOUR COMFORTABLE LANGUAGE-- ");

               /* int i = 0;
                while(i < 5) {
                    in.getName();
                    in.getLang();
                    i++;
                }
                in.greet();
                in.greeted();
                */


                    int i = 0;

                    while(i<2){
                   Greet in = new Greet();
                   in.getName();
                   in.getLang();

                   usersList.add(in);

                   i++;

                    in.greet();


               }

        //System.out.println(usersList);
        for( Greet greetedList: usersList ){

            System.out.println(greetedList.name + greetedList.lang);
        }

    }



}
