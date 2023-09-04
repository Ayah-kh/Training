import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File {
    public static void main(String[] args) {

        try {
            FileReader fout=new FileReader ("test.txt");
            int c;
            while ((c=fout.read())!=-1){
                System.out.print((char) c);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
