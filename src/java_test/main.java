package java_test;

import java.util.ArrayList;
import java.util.List;

class Main {

    //戻り値あり
    public static int sum1(int a,int b){
        return a + b;
    }

    //戻り値なし
    public static void sum2(int a,int b){
        System.out.println(a + b);
    }

    public void switchTest(int condition){
        switch (condition){
            case 1:
                System.out.println("a");
                break;
            case 2:
                System.out.println("b");
                break;
            case 3:
                System.out.println("c");
                break;
            default:
                System.out.println("error");
                break;
        }
    }

    public void forTest(){
        //配列を用意する
        ArrayList<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(5);
        collection.add(6);

        //for文、indexなし
        for (Integer integer : collection) {
            System.out.println(integer);
        }

        //for文、indexあり
        for (int i = 0; i < collection.size(); i++) {
            System.out.println("index:" + i + ",value:" + collection.get(i));
        }

        collection.forEach(System.out::println);
    }

    //public static void main(String[] args) {
//        Animal cat = new Cat();
//        cat.move();
//        cat.eat();
//        Option optDog = new Dog();
//        Dog myDog = (Dog)optDog;
//        myDog.eat();

        Duck duck = new Duck();
        //Animal duck2 = new Duck();
        //Duck duck3 = (Duck)duck2;

    }

    //        /**
//         * interfaceはインスタンス化できなので、
//         * 「onclick」をコールするには、無名クラスを利用する
//         */
//        new Demo().foo(new Demo.View() {
//            @Override
//            public void onClick() {
//                System.out.println("view clicked");
//            }
//        });

    //        for (int i = 0; i < 10; i++) {
//            SingletonDemo demo = SingletonDemo.getInstance();
//            System.out.println(demo.hashCode());
//        }

    //        //インスタンスを用意する
//        Test1 t1 = new Test1();
//        Test2 t2 = new Test2();
//
//        //それぞれのinput/outputメソッドをコールする
//        t1.input("t1");
//        System.out.println(t1.output());
//        t2.input("t2");
//        System.out.println(t2.output());
//        Person person = new Person("Yamada", 26);
//        person.print();
//        Integer a1 = 200;
//        Integer a2 = 200;
//        System.out.println(a1==a2); //output false!
//        System.out.println(a1.equals(a2)); //output true

        //Java10までは型の定義は省略できない
//        double mDouble = 3.1415926      ;
//        float mFloat = 3.14f            ;
//        long mLong = 1_000_000_000_000L ;
//        int mInt = Integer.MAX_VALUE    ;
//        short mShort = Short.MAX_VALUE  ;
//        byte mByte = Byte.MIN_VALUE     ;

        //Java10以降、「var」で型の定義は省略できる
        //var test = "abc";

//        System.out.println(mDouble);
//        System.out.println(mFloat);
//        System.out.println(mLong);
//        System.out.println(mInt);
//        System.out.println(mShort);
//        System.out.println(mByte);
//        System.out.println(sum1(1,2));




//}

/**
 * java person クラス
 */
class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println(name + "," + age);
    }
}

interface Option{
    void input(String content);
    default String output(){
        return "nothing";
    }
}

interface Option2 {
    //定数のみ定義できる
    public static final int PORP = 1;
    //プロパティは定義できない
    //int porp;
}

class Test1 implements Option{
    @Override
    public void input(String content) {
        System.out.println("input:" + content);
    }
}

class Test2 implements Option{
    @Override
    public void input(String content) {
        System.out.println("input:" + content);
    }

    @Override
    public String output() {
        return "output something";
    }
}

//シングルトンクラスを定義する
class SingletonDemo{
    //staticのインスタンスを用意する
    private static final SingletonDemo instance = new SingletonDemo();
    //コンストラクタをプライベートにする
    private SingletonDemo(){}
    //インスタンス取得用のパブリックメソッドを用意する
    public static SingletonDemo getInstance() {
        return instance;
    }
    //プロパティ
    public final int prop = 1;
    //メソッド
    public void foo(){}
}

class Test{
    public static void main(String[] args) {
        System.out.println(SingletonDemo.getInstance().prop);
        SingletonDemo.getInstance().foo();
    }
}

class Demo{
    interface View{
        void onClick();
    }
    public void foo(View listener){
        listener.onClick();
    }
}

//    //staticプロパティ
//    public static int prop = 1;
//    //staticメソッド
//    public static int getProp(){
//        return prop;
//    }
//    public static void setProp(int newProp){
//        prop = newProp;
//    }

class Animal{

    int weight = 10;

    public void eat(){
        System.out.println("Animal eat");
    }

    public void move(){
        System.out.println("Animal move");
    }

    public Animal(){
        print();
    }

    public void print(){
        System.out.println("Animal init:" + weight);
    }
}

class Cat extends Animal{

    @Override
    public void eat(){
        System.out.println("cat eat fish");
    }

    public void sleep() {
        System.out.println("cat sleep");
    }
}

class Dog extends Animal implements Option{
    @Override
    public void eat(){
        System.out.println("cat eat fish");
    }

    @Override
    public void input(String content) {

    }

    @Override
    public String output() {
        return Option.super.output();
    }
}

class Duck extends Animal{
    int weight = 5;
    @Override
    public void print() {
        System.out.println("Duck init:" + weight);
    }

    public Duck(){
        print();
    }
}



