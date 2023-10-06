package java_test.DesignPattern.StructuralPatterns.Filter;

import java.util.List;

public class AndCriteria extends AbstractCriteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> parsons) {
        List<Person> firstCriteria = criteria.meetCriteria(parsons);
        return otherCriteria.meetCriteria(firstCriteria);
    }

}
