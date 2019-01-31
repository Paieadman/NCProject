package com.company;

import java.sql.*;

//import com.mysql.fabric.jdbc.FabricMySQLDriver;

public class DBConnection {


    public void dbConnection(String URL, String user, String pass){
        Connection connection;

        try{
            Driver driver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);

            connection = DriverManager.getConnection(URL, user, pass);
            Statement statement = connection.createStatement();
            if(!connection.isClosed()){
                System.out.println("connection opens");
            } else {
                System.out.println("shit");
            }
            connection.close();
        }   catch (SQLException e){
            e.printStackTrace();
        }
    }
}
