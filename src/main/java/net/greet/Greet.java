package net.greet;


public class Greet {

    String name;
    String lang;

    int countZulu;
    int countAfrikaans;
    int countTswana;

    public Greet() {

    }

    public void GreetM(String name, String lang) {

        if(lang == null) {
            lang = "IsiZulu";
        }

        this.name = name;
        this.lang = lang;



    }


    public String getName() {
        return name;

    }

    public String getLang() {


        try {
            return Languages.valueOf(lang).getLang();
        } catch (IllegalArgumentException e) {
//            e.printStackTrace();
            return Languages.valueOf("IsiZulu").getLang();
        }
//        return  null;
//        return Languages.valueOf(lang).getLang();
    }



}


