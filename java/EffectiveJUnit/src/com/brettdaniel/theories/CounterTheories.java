package com.brettdaniel.theories;

import static org.junit.Assert.assertEquals;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class CounterTheories {
 
	@DataPoint
	public static Counter zero() {
	    return new Counter(0);
	}
	@DataPoint
	public static Counter five() {
	    return new Counter(5);
	}
    
    @Theory
    public void incrementTheory(Counter toIncrement) {
        System.out.println("incrementTheory(" + toIncrement + ")");
        int oldValue = toIncrement.getValue();
        toIncrement.increment();
        int newValue = toIncrement.getValue();
        assertEquals(oldValue + 1, newValue);
    }
     
    @Theory
    public void equalIncrementTheory(Counter c1, Counter c2) {
        System.out.println("equalIncrementTheory(" + c1 + ", " + c2 + ")");
        boolean wereEqual = c1.equals(c2);
        c1.increment();		
        c2.increment();
        assertEquals(wereEqual, c1.equals(c2));
    }
 
}