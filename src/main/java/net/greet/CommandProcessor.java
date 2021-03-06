package net.greet;

public class CommandProcessor {

    private final Greetings in;
    GreetMessage put = new GreetMessage();

    CommandProcessor(Greetings in) {
        this.in = in;
    }

    public String execute(String taker) {

        CommandBuilder commandBuilder = new CommandBuilder(taker);

        try {

            if (commandBuilder.getCommand().equalsIgnoreCase("greet")) {

                    put.GreetM(commandBuilder.getName(), commandBuilder.getLang());
                    in.adding(commandBuilder.getName());
                    return put.messageDisplay() + " \n \nAdded user!";

            } else if (commandBuilder.getCommand().equalsIgnoreCase("greeted")) {

                if (commandBuilder.hasName()) {
                    return in.greetedUsers(commandBuilder.getName());
                } else {
                    return "The list of the greeted : " + in.greeted();
                }
            } else if (commandBuilder.getCommand().equalsIgnoreCase("counter")) {

                return in.counter() + " " + "user greeted";

            } else if (commandBuilder.getCommand().equalsIgnoreCase("clear")) {

                if ((commandBuilder.hasName())) {
                    return in.clear(commandBuilder.getName());

                }else {
                    return in.clear();
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
