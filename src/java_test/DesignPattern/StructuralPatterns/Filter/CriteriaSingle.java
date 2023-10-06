package java_test.DesignPattern.StructuralPatterns.Filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle extends AbstractCriteria{
    @Override
    public List<Person> meetCriteria(List<Person> parsons) {
        List<Person> singles = new ArrayList<>();
        for (Person person: parsons) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singles.add(person);
            }
        }
        super.printDetail(singles);
        return singles;
    }
}
