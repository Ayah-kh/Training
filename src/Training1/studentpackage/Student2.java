package Training1.studentpackage;

public class Student2 implements info{
    public static int studentNo=5;
    String firstName;
    String lastName;
    Gender genderType;


    public Student2(String firstName, String lastName, Gender genderType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.genderType = genderType;
    }

    String getStudentInfo(){
        return (firstName+" "+lastName);
    }

    @Override
    public String toString() {
        return "Student2{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", genderType=" + genderType +
                '}';
    }

    public static void main(String[] args) {
        Student2 student2=new Student2("Ahmad","Ahmad",Gender.FEMALE);

    }

    @Override
    public String getName() {
        return firstName+" "+lastName;
    }
}

