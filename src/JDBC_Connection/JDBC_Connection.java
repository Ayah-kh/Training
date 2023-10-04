package JDBC_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connection {
    public static void main(String[] args) {

        String url ="jdbc:mysql://localhost:3306/MyDataBase";
        // Database url -> "jdbc:mysql://<database_url>:3306/<database_name>";
        String userName = "root"; //Database User Name
        String password = "root"; //Database Password



        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
           e.printStackTrace();
        }

        // Step 5: Establish a Database Connection
        try {
            Connection connection = DriverManager.getConnection(
                    url, userName, password);

            //Step 6: Execute SQL Queries
            Statement statement = connection.createStatement();
            String query = "select * from myTable";
            ResultSet result = statement.executeQuery(query);

            while (result.next()){
                String UniversityData = "";
                for (int i = 1; i <= 3; i++) {
                    UniversityData+=result.getString(i)+":";
                }
                System.out.println(UniversityData);
            }

            //Step 7: Close the Connection
            result.close();
            statement.close();
            connection.close();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
