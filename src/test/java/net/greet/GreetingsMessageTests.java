package net.greet;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GreetingsMessageTests {

    @Test
    public void shouldReturnName(){

        GreetMessage in = new GreetMessage();
        in.GreetM("dino", "Afrikaans");

        assertEquals(in.getName(), "dino");


    }

    @Test
    public void shouldReturnGreetings(){

        GreetMessage in = new GreetMessage();
        in.GreetM("minenhle", "Afrikaans");

        assertEquals(in.getLang() + ", " + in.getName(), "Haai, minenhle");
    }

    @Test
    public void shouldReturnGreetingsWithDefaultLang(){

        GreetMessage in = new GreetMessage();
        in.GreetM("Dino", null);

        assertEquals(in.getLang() + ", " + in.getName(), "Sawubona, Dino");
    }
}
