package java_test.DesignPattern.StructuralPatterns.Filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale extends AbstractCriteria{
    @Override
    public List<Person> meetCriteria(List<Person> parsons) {
        List<Person> females = new ArrayList<>();
        for (Person person: parsons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                females.add(person);
            }
        }
        super.printDetail(females);
        return females;
    }
}
