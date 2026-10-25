
import java.util.*;

class Utility {
    static <T> boolean isEqual(T a, T b) {
        return Objects.equals(a, b);
    }

    static <T> T getDefault(Optional<T> value, T defaultValue) {
        return value.orElse(defaultValue);
    }

    static <T extends Comparable<T>> T max(T a, T b) {
        return a.compareTo(b) >= 0 ? a : b;
    }

    static boolean isNull(Object obj) {
        return Objects.isNull(obj);
    }
}

class q5{
    public static void main(String[] args) {
        System.out.println(Utility.isEqual("Java", "Java"));
        System.out.println(Utility.isEqual(10, 20));

        Optional<String> name = Optional.empty();
        System.out.println(Utility.getDefault(name, "Guest"));

        System.out.println(Utility.max(10, 20));
        System.out.println(Utility.max("Apple", "Banana"));

        String s = null;
        System.out.println(Utility.isNull(s));
    }
}
