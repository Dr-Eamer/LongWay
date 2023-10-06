package java_test.DesignPattern.StructuralPatterns.Filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale extends AbstractCriteria{
    @Override
    public List<Person> meetCriteria(List<Person> parsons) {
        List<Person> males = new ArrayList<>();
        for (Person person: parsons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                males.add(person);
            }
        }
        super.printDetail(males);
        return males;
    }
}
