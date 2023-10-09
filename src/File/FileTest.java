package File;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        File myFile = new File("filename.txt");
        try {
            if (myFile.createNewFile()){
                System.out.println("File created: "+myFile.getName());
            }else {
                System.out.println("File already exists");
            }
        }catch (IOException e){
            System.out.println("error");
            e.printStackTrace();
        }


    }
}
