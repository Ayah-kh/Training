package File;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File file = new File("filename.txt");
            //file created in the project folder
            // use ->File file = new File("fC:\\Users\\DELL\\Desktop\\Test\\file1.txt"");
            //file created in the specified path
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
