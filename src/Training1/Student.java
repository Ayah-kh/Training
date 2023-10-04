package Training1;

public class Student {
    public static int studentNo=5;
    String firstName;
    String lastName;
//    Training1.Student(){
//        System.out.println("class started");
//    }

    public static void staticMethod(){
        System.out.println("this is static method");
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getStudentInfo(){
        return (firstName+" "+lastName);
    }



    public static void main(String[] args) {
        Student student=new Student("hussin","ahmad");

        String studentInfo = student.getStudentInfo();
        System.out.println("studentInfo = " + studentInfo);

        MathStudent mathStudent = new MathStudent("Ayah","Mahmoud");
        Student.staticMethod();
        MathStudent.staticMethod();

        System.out.println("Training1.Student.studentNo = " + Student.studentNo);
        System.out.println("Training1.MathStudent.studentNo = " + MathStudent.studentNo);
        MathStudent.studentNo++;
        System.out.println("Training1.Student.studentNo = " + Student.studentNo);
        System.out.println("Training1.MathStudent.studentNo = " + MathStudent.studentNo);
    }
}

class MathStudent extends Student{

    public MathStudent(String firstName, String lastName) {
        super(firstName, lastName);
    }

        public static void staticMethod(){
            System.out.println("this is Training1.MathStudent static method");
        }

}
