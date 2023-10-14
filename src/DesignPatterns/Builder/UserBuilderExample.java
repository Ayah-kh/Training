package DesignPatterns.Builder;


public class UserBuilderExample {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Ayah", "Mohmoud")
                .age(20)
                .address("place")
                .phone("555")
                .build();

        User user1 = new User.UserBuilder("Ahmad","Ali")
                .address("somewhere")
                .build();
    }
}
