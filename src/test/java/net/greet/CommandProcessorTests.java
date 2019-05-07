package net.greet;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CommandProcessorTests {

    Greet put = new Greet();
    //GreetDB put = new GreetDB();

    @Test
    public void shouldReturnGreetCommand(){



        CommandProcessor commandProcessor = new CommandProcessor(put);

        assertEquals("Dumela, siya \n \nAdded user!", commandProcessor.execute("greet siya Tswana"));

    }

    @Test
    public void shouldReturnGreetCommandWithDefault(){


        CommandProcessor commandProcessor = new CommandProcessor(put);

        assertEquals("Sawubona, siya \n \nAdded user!", commandProcessor.execute("greet siya"));

    }

    @Test
    public void shouldReturnGreeted(){


        CommandProcessor commandProcessor = new CommandProcessor(put);

        put.adding("ace");
        put.adding("siya");
        put.adding("dino");


        assertEquals("The list of the greeted : {ace=1, dino=1, siya=1}", commandProcessor.execute("greeted"));

    }

    @Test
    public void shouldReturnGreetedUser(){


        CommandProcessor commandProcessor = new CommandProcessor(put);

        put.adding("ace");
        put.adding("siya");
        put.adding("dino");
        put.adding("ace");
        put.adding("siya");


        assertEquals("siya is greeted 2 time(s)", commandProcessor.execute("greeted siya"));

    }

    @Test
    public void shouldReturnCounter(){


        CommandProcessor commandProcessor = new CommandProcessor(put);

        put.adding("siya");
        put.adding("dino");
        put.adding("siya");
        put.adding("dino");

        assertEquals("2 user greeted", commandProcessor.execute("counter"));

    }

    @Test
    public void shouldClearUser(){


        CommandProcessor commandProcessor = new CommandProcessor(put);

        put.adding("ace");
        put.adding("siya");
        put.adding("dino");


        assertEquals("siya Cleared", commandProcessor.execute("clear siya"));

    }

    @Test
    public void shouldClearAll(){


        CommandProcessor commandProcessor = new CommandProcessor(put);

        put.adding("ace");
        put.adding("siya");
        put.adding("dino");


        assertEquals("Cleared List", commandProcessor.execute("clear"));

    }

}
