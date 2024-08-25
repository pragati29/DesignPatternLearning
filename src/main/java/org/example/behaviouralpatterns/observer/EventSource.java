package org.example.behaviouralpatterns.observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Observable;

public class EventSource extends Observable implements Runnable {
    @Override
    public void run() {
        try {
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader bfr = new BufferedReader(isr);
            while(true){
                String response = bfr.readLine();
                setChanged();
                notifyObservers(response);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
