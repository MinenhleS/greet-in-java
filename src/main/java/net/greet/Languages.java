package net.greet;

public enum Languages {


        IsiZulu("Sawubona"),
        Afrikaans("Haai"),
        Tswana("Dumela");

          String lang;

    Languages(String lang){

        this.lang = lang;
    }


    public String getLang(){
        return lang;
    }



}
