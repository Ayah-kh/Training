package Builder;

public class UserBuilderExample {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Ayah", "Mohmoud")
                .age(20).address("sfsd").phone("555").build();
        System.out.println(user);

        User user1= new User.UserBuilder("Hello","world").address("Hello World").build();
        System.out.println("user1 = " + user1);


    }
}
