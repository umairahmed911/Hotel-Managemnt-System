package TheContinental;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connection {
    Connection connection;
    Statement statement;

    public connection(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "12345abc");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}