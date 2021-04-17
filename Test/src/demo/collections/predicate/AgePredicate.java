package demo.collections.predicate;

import java.util.function.Predicate;

public class AgePredicate implements Predicate<Student> {

    @Override
    public boolean test(Student student) {
        return student.getAge()>22;
    }
}
