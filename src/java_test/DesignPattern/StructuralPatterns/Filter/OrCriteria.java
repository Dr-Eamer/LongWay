package java_test.DesignPattern.StructuralPatterns.Filter;

import java.util.List;

public class OrCriteria extends AbstractCriteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> parsons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(parsons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(parsons);
        for (Person parson: otherCriteriaItems){
            if (!firstCriteriaItems.contains(parson)) {
                firstCriteriaItems.add(parson);
            }
        }
        super.printDetail(firstCriteriaItems);
        return firstCriteriaItems;
    }
}
