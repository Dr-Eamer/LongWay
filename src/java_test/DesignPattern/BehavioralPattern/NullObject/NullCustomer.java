package java_test.DesignPattern.BehavioralPattern.NullObject;

public class NullCustomer extends AbstractCustomer{

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "null customer";
    }
}
