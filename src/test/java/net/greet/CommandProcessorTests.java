package net.greet;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CommandProcessorTests {

    @Test
    public void shouldReturnGreetCommand(){

        CommandProcessor commandProcessor = new CommandProcessor();

        assertEquals("Dumela, siya \n \nAdded user!", commandProcessor.execute("greet siya Tswana"));

    }

    @Test
    public void shouldReturnGreetCommandWithDefault(){

        CommandProcessor commandProcessor = new CommandProcessor();

        assertEquals("Sawubona, siya \n \nAdded user!", commandProcessor.execute("greet siya"));

    }

    @Test
    public void shouldReturnGreeted(){

        CommandProcessor commandProcessor = new CommandProcessor();
        commandProcessor.execute("greet siya");
        commandProcessor.execute("greet dino");
        commandProcessor.execute("greet siya");
        commandProcessor.execute("greet mini");
        commandProcessor.execute("greet dino");
        commandProcessor.execute("greet siya");

        assertEquals("The list of the greeted : {mini=1, dino=2, siya=3}", commandProcessor.execute("greeted"));

    }

    @Test
    public void shouldReturnGreetedUser(){

        CommandProcessor commandProcessor = new CommandProcessor();
        commandProcessor.execute("greet siya");
        commandProcessor.execute("greet dino");
        commandProcessor.execute("greet siya");

        assertEquals("siya is greeted 2 time(s)", commandProcessor.execute("greeted siya"));

    }

    @Test
    public void shouldReturnCounter(){

        CommandProcessor commandProcessor = new CommandProcessor();
        commandProcessor.execute("greet siya");
        commandProcessor.execute("greet dino");
        commandProcessor.execute("greet siya");

        assertEquals("2 user greeted", commandProcessor.execute("counter"));

    }

    @Test
    public void shouldClearUser(){

        CommandProcessor commandProcessor = new CommandProcessor();
        commandProcessor.execute("greet siya");
        commandProcessor.execute("greet dino");
        commandProcessor.execute("greet siya");




        assertEquals("siya Cleared", commandProcessor.execute("clear siya"));

    }

    @Test
    public void shouldClearAll(){

        CommandProcessor commandProcessor = new CommandProcessor();
        commandProcessor.execute("greet siya");
        commandProcessor.execute("greet dino");
        commandProcessor.execute("greet siya");




        assertEquals("Cleared List", commandProcessor.execute("clear"));

    }

}
