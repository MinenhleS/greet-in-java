package net.greet;


import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GreetingsTests {


    @Test
    public void shouldReturnName(){

        Greet in = new Greet();
        in.GreetM("dino", "Afrikaans");

        assertEquals(in.getName(), "dino");


    }

    @Test
    public void shouldReturnGreetings(){

        Greet in = new Greet();
        in.GreetM("minenhle", "Afrikaans");

        assertEquals(in.getLang() + ", " + in.getName(), "Haai, minenhle");
    }

    @Test
    public void shouldReturnGreetingsWithDefaultLang(){

        Greet in = new Greet();
        in.GreetM("Dino", null);

        assertEquals(in.getLang() + ", " + in.getName(), "Sawubona, Dino");
    }

    @Test
    public void shouldReturnGreeted(){

        Greet in = new Greet();
        in.adding("Siya");
        in.adding("Mukela");
        in.adding("Dino");

        assertEquals(in.addUserMap.toString(),"{Dino=1, Siya=1, Mukela=1}");
    }

    @Test
    public void shouldReturnHowMuchUserIsGreeted(){

        Greet in = new Greet();
        in.adding("Siya");
        in.adding("Siya");
        in.adding("dino");
        in.adding("Siya");
        in.adding("mukela");

        assertEquals(in.addUserMap.get("Siya").toString(),"3");

    }

    @Test
    public void shouldReturnCounter(){

        Greet in = new Greet();
        in.adding("Siya");
        in.adding("Siya");
        in.adding("dino");
        in.adding("Siya");
        in.adding("mukela");
        in.adding("Siya");
        in.adding("Siya");
        in.adding("dino");
        in.adding("Ngwenya");
        in.adding("mukela");

        assertEquals(in.addUserMap.size(), 4);
    }


    @Test
    public void shouldClearUser(){

        Greet in = new Greet();
        in.adding("Siya");
        in.adding("Siya");
        in.adding("dino");
        in.adding("Siya");
        in.adding("mukela");
        in.adding("Siya");
        in.adding("Siya");
        in.adding("dino");
        in.adding("Ngwenya");
        in.adding("mukela");

        assertEquals(in.getLang() + ", " + in.getName(), "Sawubona, minenhle");
    }
}
