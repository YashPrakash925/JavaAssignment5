
import java.util.*;

class Result<T extends Number> {
    private T[] marks;
    Result(T[] marks) {
        this.marks = Objects.requireNonNull(marks, "Marks cannot be null");
    }
    double average() {
        if (marks.length == 0) {
            return 0;
        }
        double sum = 0;
        for (T m : marks) {
            sum += Objects.requireNonNull(m).doubleValue();
        }
        return sum / marks.length;
    }

    double percentage(double maxMarksPerSubject) {
        Objects.requireNonNull(marks);
        if (marks.length == 0 || maxMarksPerSubject <= 0) {
            return 0;
        }
        return average() / maxMarksPerSubject * 100;
    }
    boolean passed(double threshold) {
        return average() >= threshold;
    }
    Optional<Double> getAverage() {
        if (marks.length == 0) {
            return Optional.empty();
        }
        return Optional.of(average());
    }
}

class q3{
    public static void main(String[] args) {
        Double[] marks = {80.0, 70.0, 90.0};
        Result<Double> r = new Result<>(marks);
        r.getAverage().ifPresent(
            a -> System.out.println("Average: " + a)
        );
        System.out.println("Percentage: " + r.percentage(100));
        System.out.println("Passed: " + r.passed(40));
    }
}
