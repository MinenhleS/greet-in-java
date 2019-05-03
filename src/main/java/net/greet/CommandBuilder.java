package net.greet;

public class CommandBuilder {

    String[] word;
    String command;
    String name;
    String lang;

    public CommandBuilder(String taker){
        this.word = taker.trim().split("\\s");


    }


    public String getCommand(){

        command = this.word[0];
        return command;
    }

    public String getName(){
        if(commandExtractor() > 1) {
            name = this.word[1];
        } else {
            name = "";
        }
        return name;
    }

    public String getLang(){
        if(commandExtractor() > 2){
        lang = this.word[2];
        }
        else {
             lang = "IsiZulu";
        }
        return lang;
    }

    public int commandExtractor(){

        return word.length;
    }




}
