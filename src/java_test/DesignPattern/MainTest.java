package java_test.DesignPattern;

import java_test.DesignPattern.CreationalPatterns.Builder.*;
import java_test.DesignPattern.CreationalPatterns.Factory.*;
import java_test.DesignPattern.CreationalPatterns.AbstractFactory.*;
import java_test.DesignPattern.CreationalPatterns.Prototype.*;

import java_test.DesignPattern.StructuralPatterns.Adapter.*;
import java_test.DesignPattern.StructuralPatterns.Bridge.*;
import java_test.DesignPattern.StructuralPatterns.Filter.*;
import java_test.DesignPattern.StructuralPatterns.Composite.Employee;
import java_test.DesignPattern.StructuralPatterns.Decorator.*;
import java_test.DesignPattern.StructuralPatterns.Facade.*;
import java_test.DesignPattern.StructuralPatterns.Flyweight.*;
import java_test.DesignPattern.StructuralPatterns.Proxy.*;

import java_test.DesignPattern.BehavioralPattern.ResponsibilityChain.*;
import java_test.DesignPattern.BehavioralPattern.Command.*;
import java_test.DesignPattern.BehavioralPattern.Interpreter.*;
import java_test.DesignPattern.BehavioralPattern.Iterator.*;
import java_test.DesignPattern.BehavioralPattern.Mediator.User;
import java_test.DesignPattern.BehavioralPattern.Memento.*;
import java_test.DesignPattern.BehavioralPattern.Observer.*;
import java_test.DesignPattern.BehavioralPattern.State.*;
import java_test.DesignPattern.BehavioralPattern.NullObject.*;
import java_test.DesignPattern.BehavioralPattern.Strategy.*;
import java_test.DesignPattern.BehavioralPattern.Template.*;
import java_test.DesignPattern.BehavioralPattern.Visitor.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class MainTest {
    //单例模式　★
    private static final MainTest instance = new MainTest();

    private MainTest(){}

    public static MainTest getInstance(){
        return instance;
    }

    //设计模式验证主函数
    public static void main(String[] args) {
        //获取单例
        MainTest test = MainTest.getInstance();
        //******生成系******
//        test.factoryDemo();
//        test.abstractFactoryDemo();
//        test.builderDemo();
//        test.prototypeDemo();

        //******结构系******
//        test.adapterDemo();
//        test.bridgeDemo();
//        test.filterDemo();
//        test.compositeDemo();
//        test.decoratorDemo();
//        test.facadeDemo();
//        test.flyweightDemo();
//        test.proxyDemo();

        //******行为系******
//        test.responsibilityChainDemo();
//        test.commandDemo();
//        test.interpreterDemo();
//        test.iteratorDemo();
//        test.mediatorDemo();
//        test.mementoDemo();
//        test.observerDemo();
//        test.stateDemo();
//        test.nullObjectDemo();
//        test.strategyDemo();
//        test.templateDemo();
        test.visitorDemo();

    }

    public void runDemo(String key){
        System.out.println("******Run Demo of " + key + "******");
    }

    /**
     * *****生成系******
     */

    //工厂模式demo  ★
    public void factoryDemo(){
        Factory myFactory = new Factory();
        // 获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = myFactory.getShape("CIRCLE");

        // 调用 Circle 的 draw 方法
        shape1.draw();

        // 获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = myFactory.getShape("RECTANGLE");

        // 调用 Rectangle 的 draw 方法
        shape2.draw();

        // 获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = myFactory.getShape("SQUARE");

        // 调用 Square 的 draw 方法
        shape3.draw();
    }

    //抽象工厂模式demo　★
    public void abstractFactoryDemo() {
        // 获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        // 获取形状为 Circle 的对象
        AShape shape1 = shapeFactory.getShape("CIRCLE");

        // 调用 Circle 的 draw 方法
        shape1.draw();

        // 获取形状为 Rectangle 的对象
        AShape shape2 = shapeFactory.getShape("RECTANGLE");

        // 调用 Rectangle 的 draw 方法
        shape2.draw();

        // 获取形状为 Square 的对象
        AShape shape3 = shapeFactory.getShape("SQUARE");

        // 调用 Square 的 draw 方法
        shape3.draw();

        // 获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        // 获取颜色为 Red 的对象
        AColor color1 = colorFactory.getColor("RED");

        // 调用 Red 的 fill 方法
        color1.fill();

        // 获取颜色为 Green 的对象
        AColor color2 = colorFactory.getColor("Green");

        // 调用 Green 的 fill 方法
        color2.fill();

        // 获取颜色为 Blue 的对象
        AColor color3 = colorFactory.getColor("BLUE");

        // 调用 Blue 的 fill 方法
        color3.fill();
    }

    //建造者模式demo　★★
    public void builderDemo(){
        MealBuilder builder = new MealBuilder();

        Meal myVeg = builder.makeVegMeal();
        System.out.println("******Welcome,ordered VegMeal******");
        myVeg.showItems();
        System.out.println("Total:" + myVeg.getCost());

        Meal myMeat = builder.makeMeatMeal();
        System.out.println("******Welcome,ordered meatMeal******");
        myVeg.showItems();
        System.out.println("Total:" + myMeat.getCost());
    }

    //原型模式demo　★★
    public void prototypeDemo(){
        ShapeCache.loadCache();

        ProtoShape clonedShape = ShapeCache.getShape("1");
        System.out.println("shape:" + clonedShape.getType());

        ProtoShape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("shape:" + clonedShape2.getType());

        ProtoShape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("shape:" + clonedShape3.getType());
    }

    /**
     * *****结构系******
     */

    //适配器模式demo　★★
    public void adapterDemo(){
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }

    //桥接模式demo ★★★
    public void bridgeDemo(){
        BridgeShape redCircle = new BridgeCircle(100,10,10,new RedCircle());
        BridgeShape greenCircle = new BridgeCircle(200,20,20,new GreenCircle());
        redCircle.draw();
        greenCircle.draw();
    }

    //过滤器模式demo ★★
    public void filterDemo(){
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("AAA","Male","Single"));
        persons.add(new Person("BBB","Male","Marital"));
        persons.add(new Person("CCC","Female","Marital"));
        persons.add(new Person("EEE","Female","Single"));
        persons.add(new Person("DDD","Male","Single"));
        persons.add(new Person("FFF","Male","Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single,male);
        Criteria singleOrFemale = new OrCriteria(single,female);

        System.out.println("***males***");
        male.meetCriteria(persons);

        System.out.println("***females***");
        female.meetCriteria(persons);

        System.out.println("***singles***");
        single.meetCriteria(persons);

        System.out.println("***single males***");
        singleMale.meetCriteria(persons);

        System.out.println("***singleOrFemale***");
        singleOrFemale.meetCriteria(persons);

    }

    //组合模式demo ★
    public void compositeDemo(){
        Employee ceo = new Employee("AAA","CEO",30000);

        Employee saleLeader = new Employee("BBB","Sales",20000);
        Employee marketingLeader = new Employee("CCC","Marketing",20000);

        Employee clerk1 = new Employee("DDD","Marketing",10000);
        Employee clerk2 = new Employee("EEE","Marketing",10000);

        Employee sales1 = new Employee("FFF","Sales",10000);
        Employee sales2 = new Employee("GGG","Sales",10000);

        ceo.add(saleLeader);
        ceo.add(marketingLeader);

        saleLeader.add(sales1);
        saleLeader.add(sales2);

        marketingLeader.add(clerk1);
        marketingLeader.add(clerk2);

        System.out.println(ceo);
        for (Employee leader : ceo.getSubordinates()){
            System.out.println(leader);
            for (Employee e : leader.getSubordinates()){
                System.out.println(e);
            }
        }
    }

    //装饰器模式demo ★★
    public void decoratorDemo(){
        DecoratorShape circle = new DecoratorCircle();
        DecoratorShape redCircle = new RedShapeDecorator(circle);
        DecoratorShape redRectangle = new RedShapeDecorator(new DecoratorRectangle());
        System.out.println("**normal circle**");
        circle.draw();
        System.out.println("**circle with red border**");
        redCircle.draw();
        System.out.println("**rectangle with red border**");
        redRectangle.draw();

    }

    //外观模式demo ★
    public void facadeDemo(){
        ShapeMaker maker = new ShapeMaker();
        maker.drawCircle();
        maker.drawSquare();
        maker.drawRectangle();
    }

    //享元模式demo ★
    public void flyweightDemo(){
        String[] colors = {"red","green","blue","yellow","white",} ;
        for (int i = 0; i < 20; i++) {
            FlyweightCircle circle = (FlyweightCircle) FlyweightShapeFactory
                .getCircle(
                    colors[(int)(Math.random() * colors.length)]
                );
            circle.setX((int)(Math.random() * 100));
            circle.setY((int)(Math.random() * 100));
            circle.setRadius((int)(Math.random() * 100));
            circle.draw();
        }
    }

    //代理模式demo ★
    public void proxyDemo(){
        Image image = new ProxyImage("image.jpg");
        System.out.println("***第一次调用***");
        image.display();
        //再次调用display方法
        System.out.println("***第二次调用***");
        image.display();
    }

    /**
     * *****行为系******
     */

    //责任链模式demo ★★
    public void responsibilityChainDemo(){
        AbstractLogger debugLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger infoLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

        errorLogger.setNextLogger(infoLogger);
        infoLogger.setNextLogger(debugLogger);

        errorLogger.logMessage(AbstractLogger.DEBUG,"Debug Log");
        errorLogger.logMessage(AbstractLogger.INFO,"Info");
        errorLogger.logMessage(AbstractLogger.ERROR,"Error");

    }

    //命令模式demo ★★
    public void commandDemo(){
        Stock abcStock = new Stock();
        BuyStock buyStock = new BuyStock(abcStock);
        SellStock sellStock = new SellStock(abcStock);

        Broker broker = new Broker();

        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        broker.placeOrder();
    }

    //解释器模式demo ★★
    public void interpreterDemo(){

        Expression isMale = new OrExpression(
                new TerminalExpression("Leo"),
                new TerminalExpression("Tom")
        );

        Expression isMarriedFemale = new AndExpression(
                new TerminalExpression("Lucy"),
                new TerminalExpression("Married")
        );

        System.out.println("Leo is male?" + isMale.interpret("Leo"));
        System.out.println("Lucy is a married female?" + isMarriedFemale.interpret("Married Lucy"));
        System.loadLibrary("test");
    }

    //迭代器模式demo ★★
    public void iteratorDemo(){
        NameRepository nameRepository = new NameRepository();
        for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext();) {
            String name = (String)iterator.next();
            System.out.println("Name:" + name);
        }
    }

    //中介模式demo ★
    public void mediatorDemo(){
        User leo = new User("Leo");
        User lucy = new User("Lucy");
        leo.sendMessage("Hello,I am Leo");
        lucy.sendMessage("Hi,I am Lucy");
    }

    //备忘录模式demo ★★
    public void mementoDemo(){
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.addMemento(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.addMemento(originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("Current State:" + originator.getState());
        originator.getStateFromMemento(careTaker.getMemento(0));
        System.out.println("First saved State:" + originator.getState());
        originator.getStateFromMemento(careTaker.getMemento(1));
        System.out.println("Second saved State:" + originator.getState());

    }

    //观察者模式demo ★★
    public void observerDemo(){
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }

    //状态模式demo ★
    public void stateDemo(){
        Context context = new Context();

        new StartState().doAction(context);
        System.out.println(context.getState().toString());

        new StopState().doAction(context);
        System.out.println(context.getState().toString());
    }

    //空对象模式demo ★
    public void nullObjectDemo(){
        System.out.println(new CustomerFactory().getCustomer("Leo").getName());
        System.out.println(new CustomerFactory().getCustomer("Bill").getName());
        System.out.println(new CustomerFactory().getCustomer("Lucy").getName());
    }

    //策略模式demo ★
    public void strategyDemo(){
        System.out.println(new StrategyContext(new AddOperation()).executeOperation(1,2));
        System.out.println(new StrategyContext(new SubstractOperation()).executeOperation(1,2));
        System.out.println(new StrategyContext(new MultiplyOperation()).executeOperation(1,2));
    }

    //模板模式demo ★
    public void templateDemo(){
        new Gensin().play();
        new Football().play();
    }

    //访问者模式demo ★★★
    public void visitorDemo(){
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }

}
