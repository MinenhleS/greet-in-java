package net.greet;


import java.util.HashMap;
import java.util.Map;

public class Greet implements Greetings{

    String name;
    String lang;

    int countZulu;
    int countAfrikaans;
    int countTswana;

    public Greet() {

    }

    Map<String, Integer> addUserMap = new HashMap<String, Integer>();

    public void GreetM(String name, String lang) {

        if(lang == null) {
            lang = "IsiZulu";
        }

        this.name = name;
        this.lang = lang;


    }
        @Override
    public void adding(String name){

        if (!addUserMap.containsKey(name)) {
            addUserMap.put(name, 0);
        }

        int userCounter = addUserMap.get(name);
        userCounter++;
        addUserMap.put(name, userCounter);
    }

    @Override
    public void counter(){

        System.out.println( addUserMap.size() + " " + "user greeted");
    }

    @Override
    public void greeted(){

        System.out.println("The list of the greeted : " + addUserMap);
    }

    @Override
    public void greetedUsers(String name) {

        System.out.println( name + " is greeted "+ addUserMap.get(name) + " time(s)");

    }

    public void clear() {
        addUserMap.clear();
    }

    public void clear(String name) {
        addUserMap.put(name, 0);
    }

    public void help(){

        System.out.println(" Valid commands are:\n" +
                "\n" +
                "greet >> followed by the name and the language the user is to be greeted in,\n" +
                "greeted >> should display a list of all users that has been greeted and how many time each user has been greeted,\n" +
                "greeted followed by a username >> returns how many times that username have been greeted,\n" +
                "counter >> returns a count of how many unique users has been greeted,\n" +
                "clear >> deletes of all users greeted and the reset the greet counter to 0,\n" +
                "clear followed by a username >> delete the greet counter for the specified user and decrement the greet counter by 1,\n" +
                "exit >> exits the application,\n" +
                "help >> shows a user an overview of all possible commands.");
    }


    public String getName() {
        return name;

    }

    public String getLang() {


        try {
            return Languages.valueOf(lang).getLang();
        } catch (IllegalArgumentException e) {

            return Languages.valueOf("IsiZulu").getLang();
        }
    }




}


