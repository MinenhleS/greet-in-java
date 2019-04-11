package net.greet;


import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GreetingsTests {

    @Test
    public void shouldReturnNameAndLanguage(){

        Greet in = new Greet();
        in.GreetM("Minenhle", "IsiZulu");

        //assertEquals();
    }


}
