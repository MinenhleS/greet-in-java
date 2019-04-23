package net.greet;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import static junit.framework.TestCase.assertEquals;

public class GreetingsDBTests {

    final String DATABASE_URL = "jdbc:h2:file:./target/GreetUser";

    public Connection getConnection() throws Exception {

        Connection conn = DriverManager.getConnection(DATABASE_URL, "sa", "");
        return conn;
    }

    @BeforeEach
    public void cleanUpTable() {
        try {
            try(Connection conn = getConnection()) {
                Statement statement = conn.createStatement();
                statement.addBatch("delete from GreetUser");
                statement.executeBatch();

            }
        } catch(Exception ex) {
            System.out.println( ex);
        }
    }

    @Test
    public void shouldReturnGreeted(){

        GreetDB in = new GreetDB();
        in.adding("Siya");
        in.adding("Mukela");
        in.adding("Dino");
        //System.out.println(in.greeted());
        assertEquals(in.greeted().toString(),"{Dino=1, Siya=1, Mukela=1}");
    }

    @Test
    public void shouldReturnHowMuchUserIsGreeted(){

        GreetDB in = new GreetDB();
        in.adding("Siya");
        in.adding("Siya");
        in.adding("dino");
        in.adding("Siya");
        in.adding("mukela");

        assertEquals(in.greetedUsers("Siya"),"3");

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

        assertEquals(in.counter(), 4);
    }

    @Test
    public void shouldClearUsers(){

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

        in.clear();

        assertEquals(in.greeted(),"{}");
        //assertEquals(in.clear().size(), 0);
    }

    @Test
    public void shouldClearSpecificUser(){

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

        in.clear("Siya");

        assertEquals(in.greeted(),"{mukela=2, dino=2, Ngwenya=1}");

    }

}
