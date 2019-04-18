package net.greet;


import java.util.HashMap;
import java.util.Map;

public class Greet implements Greetings{

    int countZulu;
    int countAfrikaans;
    int countTswana;

    public Greet() {

    }

    Map<String, Integer> addUserMap = new HashMap<String, Integer>();


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
    public int counter(){

        return(addUserMap.size());
    }

    @Override
    public  Map<String, Integer> greeted(){

        return (( addUserMap));
    }

    @Override
    public String greetedUsers(String name) {

        return( name + " is greeted "+ addUserMap.get(name) + " time(s)" );

    }

    public String clear() {
        addUserMap.clear();
        return " Cleared List ";
    }

    public String clear(String name) {
        addUserMap.put(name, 0);
        return name + " Cleared";
    }

    public String help(){

        return(" Valid commands are:\n" +
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






}


