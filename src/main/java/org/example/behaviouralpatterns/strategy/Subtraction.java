package org.example.behaviouralpatterns.strategy;

public class Subtraction implements Strategy{
    @Override
    public float calculation(float a, float b) {
        float c= a>b?a-b:b-a;
        return c;
    }
}
