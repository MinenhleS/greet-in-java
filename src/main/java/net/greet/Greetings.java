package net.greet;

import java.util.Map;

public interface Greetings {

    //String getName();

    //String getLang();

    //void GreetM(String name, String lang);


    void adding(String name);

    int counter();

    Map<String, Integer> greeted();

    String greetedUsers(String name);

    String clear(String name);

    String clear();

    String help();



}
