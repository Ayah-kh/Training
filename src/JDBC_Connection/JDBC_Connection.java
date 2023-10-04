package JDBC_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connection {
    public static void main(String[] args) throws SQLException{

        String uName = "root";
        String password = "root";
        String query = "select * from engineeringstudent";
        String url ="jdbc:mysql://localhost:3306/university";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
           e.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection(
                    url, uName, password);
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()){
                String UniversityData = "";
                for (int i = 1; i <= 3; i++) {
                    UniversityData+=result.getString(i)+":";
                }
                System.out.println(UniversityData);
            }


        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
