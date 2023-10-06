package java_test.DesignPattern.BehavioralPattern.NullObject;

public class CustomerFactory {
    public static String[] names = {"Leo","Lucy","Tom"};
    public AbstractCustomer getCustomer(String name){
        for (String s : names) {
            if (s.equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
