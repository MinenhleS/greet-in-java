package net.greet;

import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

public class CommandBuilderTests {

    @Test
    public void shouldReturnComand(){
        CommandBuilder in = new CommandBuilder("greet siya Tswana");

        assertEquals("greet", in.getCommand());

    }

    @Test
    public void shouldReturnInvalid(){
        CommandBuilder in = new CommandBuilder("greet");

        assertEquals("greet", in.getCommand());
        assertEquals("", in.getName());


    }

    @Test
    public void shouldReturnInvalidCommand(){
        CommandBuilder in = new CommandBuilder("");

        assertEquals("", in.getCommand());



    }

    @Test
    public void shouldReturnUserName(){
        CommandBuilder in = new CommandBuilder("greet siya");

        assertEquals("greet", in.getCommand());
        assertEquals("siya", in.getName());


    }

    @Test
    public void shouldReturnLanguage(){
        CommandBuilder in = new CommandBuilder("greet siya Tswana");

        assertEquals("Tswana", in.getLang());

    }

    @Test
    public void shouldReturnDefaultLanguage(){
        CommandBuilder in = new CommandBuilder("greet siya");

        assertEquals("IsiZulu", in.getLang());

    }


}
