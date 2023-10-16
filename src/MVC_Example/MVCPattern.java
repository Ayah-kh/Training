package MVC_Example;

public class MVCPattern {
    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase();

    }

    private static Student retriveStudentFromDatabase(){
        Student student=new Student();
        student.setName("Loka Loka");
        student.setRollNo("c1111");
        return student;
    }
}
