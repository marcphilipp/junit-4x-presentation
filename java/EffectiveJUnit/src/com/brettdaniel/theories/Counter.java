package com.brettdaniel.theories;

public class Counter {
    private int value;
 
    public Counter(int init) {
        this.value = init;
    }
 
    public void increment() {
        value = value + 1;
    }
 
    public int getValue() {
        return value;
    }
    
    @Override
    public String toString() {
    	return String.valueOf(value);
    }
}