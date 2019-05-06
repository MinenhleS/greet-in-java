package net.greet;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CommandProcessorTests {

    @Test
    public void shouldReturnGreetCommand(){

        CommandBuilder commandBuilder = new CommandBuilder("greet siya Tswana");
        CommandProcessor commandProcessor = new CommandProcessor(commandBuilder);

        assertEquals("Dumela, siya \n \nAdded user!", commandProcessor.execute());

    }

    @Test
    public void shouldReturnGreetCommandWithDefault(){

        CommandBuilder commandBuilder = new CommandBuilder("greet siya");
        CommandProcessor commandProcessor = new CommandProcessor(commandBuilder);

        assertEquals("Sawubona, siya \n \nAdded user!", commandProcessor.execute());

    }

    @Test
    public void shouldReturnGreeted(){



        CommandBuilder commandBuilder = new CommandBuilder("greeted");
        CommandProcessor commandProcessor = new CommandProcessor(commandBuilder);

        commandProcessor.in.adding("ace");
        commandProcessor.in.adding("siya");
        commandProcessor.in.adding("dino");


        assertEquals("The list of the greeted : {ace=1, dino=1, siya=1}", commandProcessor.execute());

    }

    @Test
    public void shouldReturnGreetedUser(){

        CommandBuilder commandBuilder = new CommandBuilder("greeted siya");
        CommandProcessor commandProcessor = new CommandProcessor(commandBuilder);

        commandProcessor.in.adding("ace");
        commandProcessor.in.adding("siya");
        commandProcessor.in.adding("dino");
        commandProcessor.in.adding("ace");
        commandProcessor.in.adding("siya");


        assertEquals("siya is greeted 2 time(s)", commandProcessor.execute());

    }

    @Test
    public void shouldReturnCounter(){

        CommandBuilder commandBuilder = new CommandBuilder("counter");
        CommandProcessor commandProcessor = new CommandProcessor(commandBuilder);

        commandProcessor.in.adding("siya");
        commandProcessor.in.adding("dino");
        commandProcessor.in.adding("siya");
        commandProcessor.in.adding("dino");

        assertEquals("2 user greeted", commandProcessor.execute());

    }

    @Test
    public void shouldClearUser(){

        CommandBuilder commandBuilder = new CommandBuilder("clear siya");
        CommandProcessor commandProcessor = new CommandProcessor(commandBuilder);

        commandProcessor.in.adding("ace");
        commandProcessor.in.adding("siya");
        commandProcessor.in.adding("dino");


        assertEquals("siya Cleared", commandProcessor.execute());

    }

    @Test
    public void shouldClearAll(){

        CommandBuilder commandBuilder = new CommandBuilder("clear");
        CommandProcessor commandProcessor = new CommandProcessor(commandBuilder);

        commandProcessor.in.adding("ace");
        commandProcessor.in.adding("siya");
        commandProcessor.in.adding("dino");


        assertEquals("Cleared List", commandProcessor.execute());

    }

}
