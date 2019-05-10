package net.greet;

import org.junit.Test;
import org.mockito.Mockito;
import java.util.HashMap;
import java.util.Map;
import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

public class CommandProcessorTests {

    //Greet put = new Greet();
    GreetDB put = new GreetDB();
    Greetings greetings = Mockito.mock(Greetings.class);


    @Test
    public void shouldReturnGreetCommand(){

        CommandProcessor commandProcessor = new CommandProcessor(greetings);

        assertEquals("Dumela, siya \n \nAdded user!", commandProcessor.execute("greet siya Tswana"));

    }

    @Test
    public void shouldReturnGreetCommandWithDefault(){


        CommandProcessor commandProcessor = new CommandProcessor(greetings);

        assertEquals("Sawubona, siya \n \nAdded user!", commandProcessor.execute("greet siya"));

    }

    @Test
    public void shouldReturnGreeted(){
        CommandProcessor commandProcessor = new CommandProcessor(greetings);
        Map<String, Integer> processor = new HashMap();
        processor.put("siya", 2);
        processor.put("dino", 3);
        processor.put("minenhle", 5);

        when(greetings.greeted()).thenReturn(processor);

        assertEquals("The list of the greeted : {minenhle=5, dino=3, siya=2}", commandProcessor.execute("greeted"));

        verify(greetings).greeted();
    }

    @Test
    public void shouldReturnGreetedUser(){


        CommandProcessor commandProcessor = new CommandProcessor(greetings);

        when(greetings.greetedUsers("siya")).thenReturn("siya is greeted 1 time(s)");


        assertEquals("siya is greeted 1 time(s)", commandProcessor.execute("greeted siya"));
        verify(greetings).greetedUsers("siya");
    }

    @Test
    public void shouldReturnCounter(){


        CommandProcessor commandProcessor = new CommandProcessor(greetings);

        when(greetings.counter()).thenReturn(2);

        assertEquals("2 user greeted", commandProcessor.execute("counter"));
        verify(greetings).counter();
    }

    @Test
    public void shouldClearUser(){


        CommandProcessor commandProcessor = new CommandProcessor(greetings);

        when(greetings.clear("siya")).thenReturn("siya Cleared");

        assertEquals("siya Cleared", commandProcessor.execute("clear siya"));
        verify(greetings).clear("siya");
    }

    @Test
    public void shouldClearAll(){


        CommandProcessor commandProcessor = new CommandProcessor(greetings);

        when(greetings.clear()).thenReturn("Cleared List");

        assertEquals("Cleared List", commandProcessor.execute("clear"));
        verify(greetings).clear();
    }

}
