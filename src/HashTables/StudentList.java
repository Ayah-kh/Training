package HashTables;

public class StudentList {

    private Node h;

    public StudentList() {
        h=new Node();
        h.next=null;
        h.data=null;
    }

    public boolean insertStd (Student std){
        Node n =new Node();
        n.data=std;
        n.next=h.next;
        h.next=n;
        return true;
    }

    public boolean haveRollno(String rollno){
        Node a =h.next;
        boolean have = false;
        while (a != null){
            if (rollno.equals(a.data.getRoll_no()))
                have=true;
            a=a.next;
        }
        return have;
    }






    private class Node{
        private Student data;
        private Node next;
    }
}
