package net.greet;

import java.util.ArrayList;
import java.util.Scanner;

public class RunGreet {


    public static void main(String[] args) {

        ArrayList<Greet> usersList = new ArrayList<Greet>();
        Scanner input = new Scanner(System.in);

        System.out.println(" ***************WELCOME TO OUR GREETINGAPP*************** \n \n ----------WE ARE USING ENGLISH AS OUR DEFAULT LANGUAGE---------- \n --HOPEFULLY YOU WILL BE FREE AND BE ABLE TO SELECT YOUR COMFORTABLE LANGUAGE-- ");

        Greet in = new Greet();
        in.addUser();
        usersList.add(usersList.size(), in);
        System.out.println(usersList);
        in.greet();

    }




}