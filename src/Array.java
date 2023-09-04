import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        String[] name=new String[4];
        name[0]="hussein";
        name[1]="Ahmad";
        name[2]="talib";
        name[3]="alrub";

        System.out.println("name[2] = " + name[2]);

        for (int i = 3; i >=0; i--) {
            System.out.println(name[i]);
        }

        ArrayList<String> names=new ArrayList<>();
        names.add("Hussen");
        names.add("Ahmad");
        names.add("talib");

        System.out.println("names = " + names);

        System.out.println(names.get(1));
        names.remove(0);
        System.out.println("names = " + names);


    }
}
