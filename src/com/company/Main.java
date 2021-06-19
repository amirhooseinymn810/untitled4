package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/tamrin1";
        String user = "root";
        String pass = "123456a@S";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, pass);
            System.out.println("Successfully");
            //String query = "insert into table_name (id) values (20)";
            String query = "select * from table_name";
            Statement statement = connection.createStatement();
            ResultSet set = statement.executeQuery(query);

            while (set.next()) {
                int id = set.getInt("id");
                System.out.println(id);
            }


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
