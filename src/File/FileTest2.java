package File;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest2 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\DELL\\Desktop\\Test\\file1.txt"));
            bw.write("KAren\n");
            bw.write("shad\n");
            bw.write("sam\n");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
