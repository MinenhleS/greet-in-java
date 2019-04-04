package net.greet;

public enum Languages {


        isiZulu("Sawubona"),
        Afrikaans("Haai"),
        Tswana("Dumela");

         private String lang;

    private Languages(String lang){

        this.lang = lang;
    }


    public String getLang(){
        return lang;
    }



}
