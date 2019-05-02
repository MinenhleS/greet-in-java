package net.greet;

public class GreetMessage {

    String name;
    String lang;

    public void GreetM(String name, String lang) {

        if(lang == null) {
            lang =  Languages.valueOf("IsiZulu").getLang();
        }

        this.name = name;
        this.lang = lang;


    }

    public String messageDisplay(){

        return getLang() + ", " + getName();
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
