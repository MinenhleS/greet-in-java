package net.greet;


import java.util.HashMap;
import java.util.Map;

public class Greet {

    String name;
    String lang;

    int countZulu;
    int countAfrikaans;
    int countTswana;

    public Greet() {

    }

    Map< Languages, Integer> addUserMap = new HashMap< Languages, Integer>();

    public void GreetM(String name, String lang) {

        if(lang == null) {
            lang = "IsiZulu";
        }

        this.name = name;
        this.lang = lang;



    }

    public void adding(Languages addUser){

        if (!addUserMap.containsKey(addUser)) {
            addUserMap.put(addUser, 0);
        }

        // increment the counter for this type

        int userCounter = addUserMap.get(addUser);
        userCounter++;
        addUserMap.put(addUser, userCounter);
    }

    public int totalUsers() {

        int totalAddedUser = 0;

        for (Integer userCount : addUserMap.values()) {
            totalAddedUser += userCount;
        }

        return totalAddedUser;

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


