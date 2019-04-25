package net.greet;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import static junit.framework.TestCase.assertEquals;

public class GreetingsDBTests {

    final String DATABASE_URL = "jdbc:h2:file:./target/GreetUser";

    public Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");

        Connection conn = DriverManager.getConnection(DATABASE_URL, "sa", "");
        return conn;
    }

    @BeforeEach
    void cleanUpTable() {
        try {
            try(Connection conn = getConnection()) {
                Statement statement = conn.createStatement();
                statement.addBatch("delete from GreetUser");
                statement.executeBatch();
                System.out.println("----------");

            }
        } catch(Exception ex) {
            System.out.println("ERROR: " + ex);
        }
    }

    @Test
    public void shouldReturnGreeted(){

        GreetDB in = new GreetDB();
        in.adding("Siya");
        in.adding("Mukela");
        in.adding("Dino");

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

        assertEquals(in.greetedUsers("Siya"),"Siya is greeted " + 3 + " time(s) ");

    }

    @Test
    public void shouldReturnCounter(){

        GreetDB in = new GreetDB();
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

        GreetDB in = new GreetDB();
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

        assertEquals(in.greeted().toString(),"{}");

    }

    @Test
    public void shouldClearSpecificUser(){

        GreetDB in = new GreetDB();

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

        assertEquals(in.greeted().toString(),"{mukela=2, dino=2, Ngwenya=1}");

    }

}
