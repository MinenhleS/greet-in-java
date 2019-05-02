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



        assertEquals("The list of the greeted : {siya=5}", commandProcessor.greet("greeted"));

    }

    @Test
    public void shouldReturnGreetedUser(){

        CommandProcessor commandProcessor = new CommandProcessor();



        assertEquals("siya is greeted 5 time(s)", commandProcessor.greet("greeted siya"));

    }

    @Test
    public void shouldReturnCounter(){

        CommandProcessor commandProcessor = new CommandProcessor();



        assertEquals("1 user greeted", commandProcessor.greet("counter"));

    }

    @Test
    public void shouldClearUser(){

        CommandProcessor commandProcessor = new CommandProcessor();



        assertEquals("siya cleared", commandProcessor.greet("clear siya"));

    }

    @Test
    public void shouldClearAll(){

        CommandProcessor commandProcessor = new CommandProcessor();



        assertEquals("List cleared", commandProcessor.greet("clear"));

    }

}
