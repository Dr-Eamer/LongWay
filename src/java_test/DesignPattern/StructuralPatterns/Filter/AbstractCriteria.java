package java_test.DesignPattern.StructuralPatterns.Filter;

import java.util.List;

public abstract class AbstractCriteria implements Criteria{
    public void printDetail(List<Person> persons){
        for (Person person: persons){
            System.out.println("Person:[ name: " + person.getName()
                    + ", gender:" + person.getGender()
                    + ", marital status:" + person.getMaritalStatus()
                    + " ]"
            );
        }
    }

}
