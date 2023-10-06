package java_test.DesignPattern.StructuralPatterns.Filter;

import java.util.List;

public interface Criteria {
    List<Person> meetCriteria(List<Person> parsons);
}
