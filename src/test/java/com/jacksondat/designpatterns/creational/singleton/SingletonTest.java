package com.jacksondat.designpatterns.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingletonTest {

    @Test
    public void shouldBeTheSameInstanceTest() {

        DbSingleton instance = DbSingleton.getInstance();
        DbSingleton anotherInstance = DbSingleton.getInstance();

        assertEquals(instance,anotherInstance);
    }

}
