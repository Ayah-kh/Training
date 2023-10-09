package File;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File file = new File("filename.txt");
        try {
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

        //To get file information
        if (file.exists()){
            System.out.println("file.getName() = " + file.getName());
            System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
            System.out.println("file.canWrite() = " + file.canWrite());
            System.out.println("file.canRead() = " + file.canRead());
            System.out.println("file.length() = " + file.length());
        }
        else {
            System.out.println("file does not exist");
        }
    }
}
