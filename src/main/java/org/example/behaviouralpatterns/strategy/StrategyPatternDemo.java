package org.example.behaviouralpatterns.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrategyPatternDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter value a ");
        float v1= Float.parseFloat(bfr.readLine());
        System.out.println("Enter value b ");
        float v2= Float.parseFloat(bfr.readLine());
        Context context= new Context(new Addition());
        System.out.println("strategy addition " +context.executeStrategy(v1,v2));
        context = new Context(new Subtraction());
        System.out.println("strategy Subtraction " +context.executeStrategy(v1,v2));
    }
}
