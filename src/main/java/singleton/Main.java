package singleton;

public class Main {
    public static void main(String[] args) {
        User user = new User(1, "John", "john@mail.com", 20);
        user.save();
    }
}
