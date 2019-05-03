package net.greet;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CommandProcessorTests {

    @Test
    public void shouldReturnGreetCommand(){

        CommandProcessor commandProcessor = new CommandProcessor();
        //GreetMessage put = new GreetMessage();



        assertEquals("Dumela, siya \n \nAdded user!", commandProcessor.greet("greet siya Tswana"));

    }

    @Test
    public void shouldReturnGreetCommandwithDefault(){

        CommandProcessor commandProcessor = new CommandProcessor();
        //GreetMessage put = new GreetMessage();



        assertEquals("Sawubona, siya \n \nAdded user!", commandProcessor.greet("greet siya"));

    }

    @Test
    public void shouldReturnGreeted(){

        CommandProcessor commandProcessor = new CommandProcessor();
        commandProcessor.greet("greet siya");
        commandProcessor.greet("greet dino");
        commandProcessor.greet("greet siya");
        commandProcessor.greet("greet mini");
        commandProcessor.greet("greet siya");

        assertEquals("The list of the greeted : {mini=1, dino=1, siya=3}", commandProcessor.greet("greeted"));

    }

    @Test
    public void shouldReturnGreetedUser(){

        CommandProcessor commandProcessor = new CommandProcessor();
        commandProcessor.greet("greet siya");
        commandProcessor.greet("greet dino");
        commandProcessor.greet("greet siya");

        assertEquals("siya is greeted 2 time(s)", commandProcessor.greet("greeted siya"));

    }

    @Test
    public void shouldReturnCounter(){

        CommandProcessor commandProcessor = new CommandProcessor();
        commandProcessor.greet("greet siya");
        commandProcessor.greet("greet dino");
        commandProcessor.greet("greet siya");


        assertEquals("2 user greeted", commandProcessor.greet("counter"));

    }

    @Test
    public void shouldClearUser(){

        CommandProcessor commandProcessor = new CommandProcessor();
        commandProcessor.greet("greet siya");
        commandProcessor.greet("greet dino");
        commandProcessor.greet("greet siya");




        assertEquals("siya Cleared", commandProcessor.greet("clear siya"));

    }

    @Test
    public void shouldClearAll(){

        CommandProcessor commandProcessor = new CommandProcessor();
        commandProcessor.greet("greet siya");
        commandProcessor.greet("greet dino");
        commandProcessor.greet("greet siya");




        assertEquals("Cleared List", commandProcessor.greet("clear"));

    }

}
