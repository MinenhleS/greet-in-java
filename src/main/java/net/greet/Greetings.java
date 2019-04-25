package net.greet;

import java.util.Map;

public interface Greetings {

    void adding(String name);

    int counter();

    Map<String, Integer> greeted();

    String greetedUsers(String name);

    String clear(String name);

    String clear();

    String help();



}
