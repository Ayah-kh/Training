public class Student {
    String firstName;
    String lastName;

    String getStudentInfo(){
        return (firstName+" "+lastName);
    }

    public static void main(String[] args) {
        Student student=new Student();
        student.firstName="hussin";
        student.lastName="ahmad";
        String studentInfo = student.getStudentInfo();
        System.out.println("studentInfo = " + studentInfo);
    }
}
