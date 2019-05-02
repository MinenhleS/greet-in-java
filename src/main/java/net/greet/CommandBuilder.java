package net.greet;

public class CommandBuilder {

    String[] word;
    String command;
    String name;
    String lang;

    public CommandBuilder(String word){
        this.word = word.trim().split("\\s");
    }


    public String getCommand(){
        command = this.word[0];
        return command;
    }

    public String getName(){
        name = this.word[1];
        return name;
    }

    public String getLang(){
        lang = this.word[2];
        return lang;

    }

    public int commandExtractor(){

        return word.length;
    }


}
