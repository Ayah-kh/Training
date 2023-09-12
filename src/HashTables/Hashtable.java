package HashTables;

public class Hashtable {
    private StudentList[] arr;
    private int size;
    private int totalStudent;

    public Hashtable() {
        size = 1000;
        arr = new StudentList[size];
    }

    public int toHashCode(String rollNo) {
        int addasciis = 0;
        int codeValue = 0;
        for (int i = 0; i < rollNo.length(); i++) {
            addasciis = addasciis + (int)rollNo.charAt(i);
        }
        codeValue = addasciis% arr.length;
        return codeValue;
    }



}
