package studentpackage;

public class Student2 {
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



    public static void main(String[] args) {

    }
}

