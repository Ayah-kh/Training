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

    private class Node{
        private Student data;
        private Node next;
    }
}
