package net.greet;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class GreetDB implements Greetings {

    final String INSERT_USER_SQL = "insert into GreetUser (name, user_count) values(?, ?)";

    final String FIND_USER_SQL = "select user_count from GreetUser where name = ?";

    final String UPDATE_USER_SQL = "update GreetUser set user_count = ? where name = ?";

    final String FIND_ALL_SQL = "select count(*) as name from GreetUser ";

    final String FIND_LIST_SQL = "select * from GreetUser ";

    final String DELETE_USER_SQL = "delete from GreetUser where name = ?";

    final String DELETE_ALL_SQL = "delete from GreetUser";

    Connection conn;
    PreparedStatement psCreateNewGreetings;
    PreparedStatement psGreetsCount;
    PreparedStatement psUpdateGreetsCount;
    PreparedStatement psAllUsers;
    PreparedStatement psListOfAll;
    PreparedStatement psDelUser;
    PreparedStatement psDelAll;

    public GreetDB() {
        try {
            conn = DriverManager.
                    getConnection("jdbc:h2:file:./target/GreetUser", "sa", "");

            psCreateNewGreetings = conn.prepareStatement(INSERT_USER_SQL);
            psGreetsCount = conn.prepareStatement(FIND_USER_SQL);
            psUpdateGreetsCount = conn.prepareStatement(UPDATE_USER_SQL);
            psAllUsers = conn.prepareStatement(FIND_ALL_SQL);
            psListOfAll = conn.prepareStatement(FIND_LIST_SQL);
            psDelUser = conn.prepareStatement(DELETE_USER_SQL);
            psDelAll = conn.prepareStatement(DELETE_ALL_SQL);

        } catch (Exception ex) {

            ex.printStackTrace();
        }

    }

    Map<String, Integer> map = new HashMap();

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
    public int counter() {

        try {

            ResultSet rsAll = psListOfAll.executeQuery();
            while (rsAll.next()){

               return map.size();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();

        }

        return 0;
    }

    @Override
    public String greetedUsers(String name) {

        try {
            psGreetsCount.setString(1, name.toString());
            ResultSet rs = psGreetsCount.executeQuery();
            if (rs.next()) {
               return String.valueOf(( name + " is greeted " + rs.getInt("user_count") + " time(s) "));

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return "this user is not greeted!!";
    }

        @Override
    public Map<String, Integer> greeted() {


            try {

                ResultSet rsAll = psListOfAll.executeQuery();
                while (rsAll.next()) {
                    map.put(rsAll.getString("name"), rsAll.getInt("user_count"));

                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            return map;
        }

        public String clear(String name){

            try {
                psDelUser.setString(1, name.toString());
                ResultSet rsDel = psDelUser.executeQuery();

            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
        return name + " cleared ";

        }

        public String clear(){

            try {

                ResultSet rsDel = psDelAll.executeQuery();


            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
            return " List cleared ";

        }


}




