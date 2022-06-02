package com.example.demo.function;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * 函数式接口
 */
public class MyFunctionTest {
    //java.util.function.Function
    public static int handleFunction(int a, Function<Integer, Integer> function) {
        return function.apply(a);
    }

    //java.util.function.Consumer
    public static void handleConsumer(int a, Consumer<Integer> consumer) {
       consumer.accept(a);
    }

    //java.util.function.Predicate
    public static boolean handlePredicate(int a, Predicate<Integer> predicate) {
        return predicate.test(a);
    }

    //java.util.function.Supplier
    public static int handleSupplier(Supplier<Integer> supplier) {
        return supplier.get();
    }

    public static MyBean obtainMyBean(Supplier<MyBean> supplier) {
        return supplier.get();
    }

    public static int handleSelfFuntion(int a, MyFunction<Integer> myFunction) {
        return myFunction.handle(a);
    }

    public static int selfHandle(int a) {
        return a*a;
    }

    public int selfHandle_1(int a) {
        return a*a;
    }

    //自定义函数式接口
    @FunctionalInterface
    interface MyFunction<T> {
        T handle(T t);

        default void showDefault(T t) {
        }

        static void showStatic() {
        }
    }

    static class MyBean {

    }

    public static void main(String[] args) {
        //lambda expressions
        System.out.println(MyFunctionTest.handleFunction(1, a -> a * 2));
        System.out.println(MyFunctionTest.handlePredicate(1, a -> a > 2));
        System.out.println(MyFunctionTest.handleSupplier(() -> 1));
        System.out.println(MyFunctionTest.handleSelfFuntion(1, a -> a * a));

        //method references
        MyFunctionTest.handleConsumer(1, System.out::println);
        System.out.println(MyFunctionTest.handleSelfFuntion(1, MyFunctionTest::selfHandle));
        System.out.println(MyFunctionTest.handleSelfFuntion(1, new MyFunctionTest()::selfHandle_1));

        //constructor references
        //MyFunctionTest.obtainMyBean(() -> new MyBean());
        MyFunctionTest.obtainMyBean(MyBean::new);
    }
}
