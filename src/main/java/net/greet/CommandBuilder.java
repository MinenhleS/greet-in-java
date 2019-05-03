package net.greet;

public class CommandBuilder {

    String[] word;
    String command;
    String name;
    String lang;

    public CommandBuilder(String taker){
        this.word = taker.trim().split("\\s");
        command = this.word[0];

        if(argumentCount() > 1) {
            name = this.word[1];
        }
        else {
            name = "";
        }

        if(argumentCount() > 2){
            lang = this.word[2];
        }
        else {
            lang = "IsiZulu";

        }

    }


    public String getCommand(){

        return command;
    }

    public String getName(){

        return name;
    }

    public String getLang(){
        return lang;
    }

    private int argumentCount(){
        return word.length;
    }

    public boolean hasName() {
        return !name.isEmpty();
    }


}
