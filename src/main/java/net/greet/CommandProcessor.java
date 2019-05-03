package net.greet;

public class CommandProcessor {
    Greet in = new Greet();
    //GreetDB in = new GreetDB();
    GreetMessage put = new GreetMessage();

    public String execute(String taker) {

        CommandBuilder commandBuilder = new CommandBuilder(taker);

        try {

            if (commandBuilder.getCommand().equalsIgnoreCase("greet")) {

                    put.GreetM(commandBuilder.getName(), commandBuilder.getLang());
                    in.adding(commandBuilder.getName());

                    return put.messageDisplay() + " \n \nAdded user!";


            } else if (commandBuilder.getCommand().equalsIgnoreCase("greeted")) {


                if (!(commandBuilder.commandExtractor() == 2)) {

                    return "The list of the greeted : " + in.greeted();

                } else if (commandBuilder.commandExtractor() == 2) {

                    return in.greetedUsers(commandBuilder.getName());
                }

            } else if (commandBuilder.getCommand().equalsIgnoreCase("counter")) {

                return in.counter() + " " + "user greeted";

            } else if (commandBuilder.getCommand().equalsIgnoreCase("clear")) {

                if ((commandBuilder.commandExtractor() == 1)) {

                    return in.clear();

                } else if (commandBuilder.commandExtractor() == 2) {

                    return in.clear(commandBuilder.getName());
                }

            } else if (commandBuilder.getCommand().equalsIgnoreCase("help")) {

                return in.help();
            }
            else{
                return "Invalid Command !!!";
            }

        }
        catch (Exception ex) {

            ex.printStackTrace();
        }

        return "";

    }


}
