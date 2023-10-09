package File;

import java.io.*;

public class FileTest2 {
    public static void main(String[] args) {

        try {
            BufferedWriter bw =
                    new BufferedWriter(
                            new FileWriter("C:\\Users\\DELL\\Desktop\\Test\\file2.txt"));
            BufferedReader bufferedReader =
                    new BufferedReader(
                            new FileReader("C:\\Users\\DELL\\Desktop\\Test\\file1.txt"));
            String s;
            while ((s=bufferedReader.readLine())!=null){
                System.out.println(s);

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
