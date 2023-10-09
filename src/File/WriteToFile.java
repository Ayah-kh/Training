package File;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {

        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            //Will create the file if it does not exist
            //Will override the file if the file exists
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            //write on the file
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
