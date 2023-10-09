package File;

import java.io.*;

public class FileTest2 {
    public static void main(String[] args) {
//        try {
//            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\DELL\\Desktop\\Test\\file1.txt"));
//            bw.write("KAren\n");
//            bw.write("shad\n");
//            bw.write("sam\n");
//            bw.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
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
