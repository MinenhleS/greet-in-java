package net.greet;


import java.util.ArrayList;
import java.util.Scanner;

public class Greet{

    String name;
    int lang;
    String langNumber = "";
    String zuluStr = "IsiZulu";
    String afrStr = "Afrikaans";
    String tsanaStr = "Tswana";
    int countZulu;
    int countAfrikaans;
    int countTswana;
    String zuluGreet = "-----Sawubona------";
    String afrikGreet = "-----Haai-----";
    String tswanaGreet = "-----Dumela-----";

    public Greet(){

    }

   public Greet(String name, int lang){

        this.name = name;
        this.lang = lang;

    }


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;

    }

    public void setLang(int lang){
        this.lang = lang;
    }


    public String getLang(){
        return getLang();
    }



    public void addUser() {

        Scanner input = new Scanner(System.in);
        String name;
        int lang;
        Greet greet;

        while (true) {

            System.out.println("Enter First Name: ");
            name = input.next();
            System.out.print("Enter a number of a language you want to be greeted by : \n 1. IsiZulu \n 2. Afrikaans \n 3. Tshwana \n");
            lang = input.nextInt();


            switch(lang){

                case 1 : langNumber = zuluStr;
                            break;
                case 2 : langNumber = afrStr;
                            break;
                case 3 : langNumber = tsanaStr;
                          break;
            }

            if(!langNumber.equalsIgnoreCase(zuluStr) && !langNumber.equalsIgnoreCase(afrStr) && !langNumber.equalsIgnoreCase(tsanaStr)){
                System.out.println("Go back, start Afresh and enter one of the available language of your choice that is on a list!!!");
                break;
            }

            else if(langNumber.equalsIgnoreCase(zuluStr)){
                countZulu ++;
                System.out.println(zuluGreet + "\n");


            }
            else if(langNumber.equalsIgnoreCase(afrStr)){
                countAfrikaans++;
                System.out.println(afrikGreet + "\n");


            }
            else if(langNumber.equalsIgnoreCase(tsanaStr)){
                System.out.println(tswanaGreet + "\n");
                countTswana++;

            }



           setName(name);
            setLang(lang);


           // usersList.add(usersList.size(), in);

            System.out.println("Added!");
            System.out.println(" \n \n " );

            String option = "";
            System.out.println("You want to continue ??? Y / N  \n");
            option = input.next();

            if(!option.equalsIgnoreCase("Y")){
                break;
               // continue;
            }

        }

    }



    public String greet(){
        System.out.println("The name of the user is " + name + " and language of your choice is " + langNumber);
        return null;

    }


}
