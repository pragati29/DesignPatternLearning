package org.example.creationalPatterns.singletonPattern;

public class SingletonObject {

    public static SingletonObject singletonObject=null;
    private SingletonObject(){}

    public static SingletonObject getInstance(){
        if(singletonObject == null){
            singletonObject = new SingletonObject();
        }
        return singletonObject;
    }
}
