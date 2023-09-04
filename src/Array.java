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

    }
}
