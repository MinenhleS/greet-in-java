package net.greet;

import java.sql.*;

public class GreetDB implements Greetings {

    final String INSERT_USER_SQL = "insert into GreetUser (name, user_count) values(?, ?)";

    final String FIND_USER_SQL = "select user_count from GreetUser where name = ?";

    final String UPDATE_USER_SQL = "update GreetUser set user_count = ? where name = ?";

    final String FIND_ALL_SQL = "select count(*) as name from GreetUser ";

    final String FIND_LIST_SQL = "select * from GreetUser ";

    Connection conn;
    PreparedStatement psCreateNewGreetings;
    PreparedStatement psGreetsCount;
    PreparedStatement psUpdateGreetsCount;
    PreparedStatement psAllUsers;
    PreparedStatement psListOfAll;



    public GreetDB() {
        try {
            conn = DriverManager.
                    getConnection("jdbc:h2:file:./target/Create_GreetUser", "sa", "");

            psCreateNewGreetings = conn.prepareStatement(INSERT_USER_SQL);
            psGreetsCount = conn.prepareStatement(FIND_USER_SQL);
            psUpdateGreetsCount = conn.prepareStatement(UPDATE_USER_SQL);
            psAllUsers = conn.prepareStatement(FIND_ALL_SQL);
            psListOfAll = conn.prepareStatement(FIND_LIST_SQL);

        } catch (Exception ex) {

            ex.printStackTrace();
        }

    }

    @Override
    public void adding(String name) {

        try {

            psGreetsCount.setString(1, name.toString());
            ResultSet rsName = psGreetsCount.executeQuery();

            if (!rsName.next()) {

                psCreateNewGreetings.setString(1, name.toString());
                psCreateNewGreetings.setInt(2, 1);
                System.out.println(psCreateNewGreetings.execute());

            } else {
                int nameCount = rsName.getInt("user_count");
                psUpdateGreetsCount.setInt(1, ++nameCount);
                psUpdateGreetsCount.setString(2, name.toString());
                psUpdateGreetsCount.execute();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }


    @Override
    public void counter() {

        try {

            System.out.println(psAllUsers.executeQuery());

        } catch (SQLException ex) {
            ex.printStackTrace();


        }

    }

    @Override
    public void greetedUsers(String name) {

        try {
            psGreetsCount.setString(1, name.toString());
            ResultSet rs = psGreetsCount.executeQuery();
            if (rs.next()) {
                System.out.println(rs.getInt("user_count"));

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        System.out.println(0);
    }

        @Override
    public void greeted() {

        try {

            System.out.println(psListOfAll.execute());
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}


