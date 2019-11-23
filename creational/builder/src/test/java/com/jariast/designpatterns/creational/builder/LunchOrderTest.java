package com.jariast.designpatterns.creational.builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LunchOrderTest {
    @Test
    public void mustBeDefault(){
        LunchOrder lunchOrder = new LunchOrderBuilder().build();

        String breadExpected = "wheat";
        String meatExpected = "jam";

        assertEquals(breadExpected, lunchOrder.getBread());
        assertEquals(meatExpected, lunchOrder.getMeat());
        assertNull(lunchOrder.getCondiments());
        assertNull(lunchOrder.getDressing());
    }

    @Test
    public void mustChangeTheBread(){
        String breadExpected = "oregano-parmesan";
        String meatExpected = "jam";

        LunchOrder lunchOrder = new LunchOrderBuilder().setBread(breadExpected).build();

        assertEquals(breadExpected, lunchOrder.getBread());
        assertEquals(meatExpected, lunchOrder.getMeat());
        assertNull(lunchOrder.getCondiments());
        assertNull(lunchOrder.getDressing());
    }
}
