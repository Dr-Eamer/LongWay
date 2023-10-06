package kotlin_test

import jdk.management.resource.internal.inst.SocketRMHooks
import java.net.Socket

class Test(){

    /**
     * 普通の書き方
     */
    fun sum1(a: Int,b: Int): Int{
        return a + b
    }
    /**
     * 戻り値ある場合：
     * 「波括弧 + return」の代わりに「=」で省略式もある
     */
    fun sum2(a: Int,b: Int) = a + b

    fun condition(a: Int,b: Int){
        //普通の書き方
        if (a > b) {
            println("Big")
        } else if(a == b) {
            println("Same")
        } else {
            println("Small")
        }
        //式として利用することもできる
        val c = if (a > b) a else b
    }

    //普通の書き方
    fun whenTest(condition: Int){
        when(condition){
            1 -> println("a")
            2,3 -> println("b")
            in 4..10 -> println("c")
            else -> {
                println("a")
                println("error")
            }
        }
    }

    //式として利用することもできる
    fun whenTest2(condition: Any) =
        when(condition){
            is Int -> 1
            is String -> "b"
            else -> {
                println("a")
                "error"
            }
        }

    //他の書き方
    fun whenTest3(condition: String?){
        when{
            condition.isNullOrEmpty() -> println("null")
            condition.length > 1 -> println("ok")
            condition[2].isUpperCase() -> println("b")
            else -> {
                println("a")
                println("error")
            }
        }
    }

    fun forTest(){
        //配列を定義する
        val collection = listOf(1,2,3,4,5)

        //for文,indexなし
        for (item in collection) {
            println(item)
        }

        //for文,indexあり
        for ((i,v) in collection.withIndex()) {
            println("index:${i},value:${v}")
        }

        //foreach
        collection.forEach {
            println("forEach item:$it")
        }
    }

    fun whileTest(){

        //whileループ
        var x = 0
        while (x <= 10){
            println("whileループ第${x++}回")
        }

        //do-whileループ
        var y = 10
        do {
            println("do-whileループ第${--y}回")
        }while (y > 0)

    }

    fun test(condition: Int?){
        //nullの場合for文実行されず、test()が終了
        condition ?: return
        for (i in 0 until 20){
            //forループ終了
            if (i == condition ) break
            //奇数の場合を跳ばして、次のループ処理を実行する
            if (i % 2 != 0) continue
            println("ループ第${i}回")
        }
    }

    fun threadTest(){
    }
}

//クラスの定義
class Person(private val name: String, private val age: Int) {
    fun print() {
        println("$name ${this.age}")
    }
}

//メインコンストラクタが省略なしの書き方
class Person1 constructor(name: String, age: Int) {
    private var name: String = ""
    private var age: Int = 0

    /**
     * 初期化処理はinit内に書く
     * 処理がなければ省略できる
     */
    init {
        this.name = name
        this.age = age
        println("Person1 called")
    }

    fun print() {
        println("$name $age")
    }
}

//サブコンストラクタの書き方
class Person2(name: String) {
    val message: String
    init {
        println("初期化実行")
        println(name)
        message = "Hello, $name!"
    }
    /**
     * メインコンストラクタを持つ場合、
     * 「this」でメインコンストラクタを呼び出す必要
     */
    constructor(name: String, age: Int) : this(name) {
        println("サブコンストラクタ実行")
        println("年龄: $age")
    }
}

abstract class Derived {
    fun print(){
        println("抽象クラスDerived呼び出された")
    }
    abstract fun foo()
}

class DerivedImpl: Derived() {
    override fun foo() {
        println("foo implemented")
    }
}

//外部クラス
class Outer{
    val porp = "Outer"
    init {
        println("Outer called")
    }
    //ネストクラス
    class Nest{
        init {
            println("Nest called")
        }
        /**
         * ネストクラスは外部クラスのプロパティを呼び出すことができない
         */
        //fun getPorp() = porp
    }
    //内部クラス
    inner class Inner{
        init {
            println("Inner called")
        }
        /**
         * 内部クラスは外部クラスのプロパティを呼び出すことができる
         */
        fun getPorp() = println(porp)
    }
}

interface Options {

    fun input(content: String)
    fun output() = "nothing to output"
}

interface Option2{
    //定数の定義
    companion object{
        const val PORP = 200
    }
    //プロパティの定義
    val porp: Int
    var porp2: Int
}

class Test3: Option2{
    //valプロパティのgetterしかオーバーライドできない
    override val porp: Int
        get() = 2
    //varプロパティのgetter/setterをオーバーライドする
    override var porp2: Int
        get() = 3
        set(value) {}

    fun getConst() = Option2.PORP
}

class Test1: Options{
    override fun input(content: String) {
        println("input:$content")
    }
    //メソッドoutputはオーバーライドしない
}

class Test2: Options{
    override fun input(content: String) {
        println("input:$content")
    }
    //メソッドoutputをオーバーライドする
    override fun output(): String {
        return "output something"
    }
}

//普通のクラス
class KotlinDemo{

}
//シングルトン
object KotlinSingletonDemo{
    //定数
    const val PROP = 1
    fun foo(){}
}

fun main(){
    KotlinSingletonDemo.PROP
    KotlinSingletonDemo.foo()
}

class Demo{
    /**
     * ---companion objectは一つしか定義できない---
     * ---オブジェクト名「ObjName」は省略できる---
     */
    companion object ObjName{
        var prop = 1
        fun foo(){}
    }

    interface View{
        fun onClick()
    }
    fun foo(listener: View){
        listener.onClick()
    }
}

//普通の関数
fun sum1(x: Int,y: Int) = x + y
//関数を式として利用する(無名関数)
val sum2 = fun(x: Int,y: Int) = x + y
//lambda式
val lambda1 = { x: Int,y: Int -> x + y }
//lambda式の型定義
val lambda2: (Int,Int) -> Int = { x,y -> x + y }
//引数、戻り値両方なしの場合
val lambda3: () -> Unit = {}

//関数型の引数を含む
fun highOrderFunc1(x: Int,y: Int,block: (Int,Int) -> Int) {
    println("Func1の結果：${block(x,y)}")
}

//関数型の戻り値を含む
fun highOrderFunc2(x: Int,y: Int) = { z: Int ->
        (x + y + z).apply { println("Func2の結果：${this}") }
    }

//fun main(){
//    //呼出し
//    highOrderFunc1(1,2,{ x,y -> x + y })
//    highOrderFunc2(1,2)(3)
//    //関数型の引数は最後にある場合は以下の省略式が使える
//    highOrderFunc1(3,4){ x,y ->
//        x * y
//    }
//}

fun test(){

    //型の定義は省略できる
    val mDouble = 3.1415926            // 64ビット浮動小数点数
    val mFloat = 3.14f                 // 32ビット浮動小数点数
    val mLong = 1_000_000_000_000L     // 64ビット整数(-2^63～2^63-1)
    val mInt = Int.MAX_VALUE           // 32ビット整数(-2^31～2^31-1)
    val mShort = Short.MAX_VALUE       // 16ビット整数(-2^15～2^15-1)
    val mByte = Byte.MIN_VALUE         //  8ビット整数(-128～127)

    //特定する場合は型を明記しましょう
    val mInt2: Int = 1
    val mByte2: Byte = 1
    val mShort2: Short = 1


    println(mDouble::class.java.simpleName + ":" + mDouble)
    println(mFloat::class.java.simpleName + ":" + mFloat)
    println(mLong::class.java.simpleName + ":" + mLong)
    println(mInt::class.java.simpleName + ":" + mInt)
    println(mShort::class.java.simpleName + ":" + mShort)
    println(mByte::class.java.simpleName + ":" + mByte)
    println(mInt2::class.java.simpleName + ":" + mInt2)
    println(mByte2::class.java.simpleName + ":" + mByte2)
    println(mShort2::class.java.simpleName + ":" + mShort2)

    //    //普通の関数の呼出し
//    sum1(1,2).also {
//        println("sum1:${it}")
//    }
//    println("sum2:${sum2(1,2)}")
//    println("lambda1:${lambda1(1,2)}")
//    println("lambda2:${lambda2(1,2)}")
    lambda3.apply {
        println("lambda3 called")
    }
}

fun test2(){

    //変数の宣言
    val mDouble: Double = 3.1415926
    val mFloat: Float = 3.14f
    val mLong: Long = 1_000_000_000_000L
    val mInt: Int = Int.MAX_VALUE
    val mShort: Short = Short.MAX_VALUE
    val mByte: Byte = Byte.MIN_VALUE

    val bool1: Boolean = true
    //valで定義された変数は再代入できない
    //boo1 = false
    var bool2: Boolean = true
    //varで定義された変数は再代入できる
    bool2 = false

    println(mDouble::class.java.simpleName + ":" + mDouble)
    println(mFloat::class.java.simpleName + ":" + mFloat)
    println(mLong::class.java.simpleName + ":" + mLong)
    println(mInt::class.java.simpleName + ":" + mInt)
    println(mShort::class.java.simpleName + ":" + mShort)
    println(mByte::class.java.simpleName + ":" + mByte)
    println(bool1::class.java.simpleName + ":" + bool1)
    println(bool2::class.java.simpleName + ":" + bool2)

}


