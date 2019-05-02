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
    public void shouldReturnUserName(){
        CommandBuilder in = new CommandBuilder("greet siya Tswana");

        assertEquals("siya", in.getName());

    }

    @Test
    public void shouldReturnLanguage(){
        CommandBuilder in = new CommandBuilder("greet siya Tswana");

        assertEquals("Tswana", in.getLang());

    }


}
