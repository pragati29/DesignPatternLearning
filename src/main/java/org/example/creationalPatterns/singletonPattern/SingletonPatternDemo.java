package org.example.creationalPatterns.singletonPattern;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingletonObject s1=SingletonObject.getInstance();
        SingletonObject s2=SingletonObject.getInstance();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
