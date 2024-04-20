package Hotel_Management_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Cons {
    Connection connection;
    Statement statement;

    public Cons(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelms", "root", "1bh21cs010");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}