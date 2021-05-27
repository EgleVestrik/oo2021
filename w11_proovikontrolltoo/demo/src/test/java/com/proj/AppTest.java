package com.proj;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.BeforeClass;
/**
 * Unit test for simple App.
 */
public class AppTest {
    static App app;
    @BeforeClass
    public static void init(){
        app= new App();
    }

    @Test
    public void JoogiPudeliMassTest(){
        assertEquals(3, app.joogipudelMass(1, 1));
    }

    @Test
    public void omaHindTest(){
        assertEquals(3, app.omaHind(1, 3));
    }


}
