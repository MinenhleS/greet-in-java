package net.greet;

public class CommandBuilder {

    String[] word;
    String command;
    String name;
    String lang;

    public CommandBuilder(String word){
        this.word = word.trim().split("\\s"); //word = "clear" => ['clear'] => 1


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
