package JDBC_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connection {
    public static void main(String[] args) throws SQLException{

        String url ="jdbc:mysql://localhost:3306/university";
        String userName = "root";
        String password = "root";
        String query = "select * from engineeringstudent";


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
           e.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection(
                    url, userName, password);
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()){
                String UniversityData = "";
                for (int i = 1; i <= 3; i++) {
                    UniversityData+=result.getString(i)+":";
                }
                System.out.println(UniversityData);
            }

            result.close();
            statement.close();
            connection.close();

        }catch (SQLException e){
            e.printStackTrace();
        }



    }
}
