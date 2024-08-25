package org.example.behaviouralpatterns.observer;


/*
It is one to one dependency so that one object states changes , all its dependents will get notified and updated automatically

 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        System.out.println("Enter Text >");
        EventSource eventSource= new EventSource();
        ResponseHandler1 responseHandler1=new ResponseHandler1();
        eventSource.addObserver(responseHandler1);
        ResponseHandler2 responseHandler2=new ResponseHandler2();
        eventSource.addObserver(responseHandler2);
        Thread t=new Thread(eventSource);
        t.start();
    }
}
