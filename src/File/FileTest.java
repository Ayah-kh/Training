package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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

        System.out.println("myFile.getAbsolutePath() = " + myFile.getAbsolutePath());


        try {
            FileWriter writer = new FileWriter("filename.txt");
            writer.write("Files in java\n");
            writer.write("Files in java");
            writer.write("Files in java");
            writer.write("Files in java");
            writer.close();
            System.out.println("Success");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("test");

        try {
            Scanner reader = new Scanner(myFile);
            while (reader.hasNext()){
                System.out.println(reader.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
