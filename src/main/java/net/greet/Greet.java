package net.greet;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Greet {

    String name;
    String lang;
    String zuluStr = "IsiZulu";
    String afrStr = "Afrikaans";
    String tshanaStr = "Tshwana";
    int countZulu;
    int countAfrikaans;
    int countTshwana;
    String zuluGreet = "-----Sawubona------";
    String afrikGreet = "-----Haai-----";
    String tshwanaGreet = "-----Dumela-----";

   // public Greet(String name, String lang){

     //   this.name = name;
      //  this.lang = lang;

    //}

    ArrayList<String> usersList = new ArrayList<String>();

    public String getName(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        name = input.next();



        usersList.add(name);

        return name;
    }

    public String getLang(){

        Scanner console = new Scanner(System.in);

        System.out.println("Enter a language you want to be greeted by : \n * IsiZulu \n * Afrikaans \n * Tshwana \n");
        lang = console.next();


        if(lang.equalsIgnoreCase(zuluStr)){
            countZulu ++;
            System.out.println(zuluGreet + "\n");
            return zuluGreet;

        }
        else if(lang.equalsIgnoreCase(afrStr)){
            countAfrikaans++;
            return afrikGreet;

        }
        else if(lang.equalsIgnoreCase(tshanaStr)){
            countTshwana++;
            return tshwanaGreet;
        }
        else {

            return "Go back and enter one of the available language of your choice that is on a list";
        }
    }



    public void greet(){
        System.out.println("The name of the user is " + name + " and language of your choice is " +lang);

    }

    public void greeted(){

        for( String greetedList: usersList ){

            System.out.println(greetedList);
        }

    }
}
