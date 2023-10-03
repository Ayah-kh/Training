package JDBC_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connection {
    public static void main(String[] args) throws SQLException{

        System.out.println("111111");

        String uName = "root";
        String password = "root";
        String query = "select * from engineeringstudent";
        String url ="jdbc:mysql://localhost:3306/university";

        System.out.println("22222");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
           e.printStackTrace();
        }

        System.out.println("3333");

        try {
            Connection connection = DriverManager.getConnection(
                    url, uName, password);
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()){
                System.out.println("44444");
                String UniversityData = "";
                for (int i = 1; i <= 3; i++) {
                    UniversityData+=result.getString(i)+":";
                }
                System.out.println(UniversityData);
            }


        }catch (SQLException e){

        }

        System.out.println("5555");


    }
}
