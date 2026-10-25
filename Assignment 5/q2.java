
import java.util.*;

class q2{
    public static void main(String[] args) {
        Optional<String> email =
            Optional.of("student@gmail.com");
        Optional<String> emptyEmail = Optional.empty();
        email.ifPresent(e -> System.out.println("Email: " + e));
        String e1 = emptyEmail.orElse("default@gmail.com");
        System.out.println("Default email: " + e1);
        try {
            String e2 = emptyEmail.orElseThrow(
                () -> new RuntimeException("Email is missing")
            );
            System.out.println(e2);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
