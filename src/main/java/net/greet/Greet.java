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

    Map<String, Integer> addUserMap = new HashMap<String, Integer>();

    public void GreetM(String name, String lang) {

        if(lang == null) {
            lang = "IsiZulu";
        }

        this.name = name;
        this.lang = lang;



    }

    public void adding(String name){

        if (!addUserMap.containsKey(name)) {
            addUserMap.put(name, 0);
        }

        // increment the counter for this type

        int userCounter = addUserMap.get(name);
        userCounter++;
        addUserMap.put(name, userCounter);
    }

    public void counter(){

        System.out.println( addUserMap.size());
    }
    public void greeted(){

        System.out.println( addUserMap);
    }


    public void greetUsers(String name) {

//        if (!addUserMap.containsKey(name)) {
//            return addUserMap;
//        }
//            else
        System.out.println(addUserMap.get(name) + name + "greeted");

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


