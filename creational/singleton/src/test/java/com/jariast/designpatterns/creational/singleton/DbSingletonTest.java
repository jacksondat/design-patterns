package com.jariast.designpatterns.creational.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DbSingletonTest {

    @Test
    public void shouldBeTheSameInstanceTest() {

        DbSingleton instance = DbSingleton.getInstance();
        DbSingleton anotherInstance = DbSingleton.getInstance();

        assertEquals(instance,anotherInstance);
    }

}
