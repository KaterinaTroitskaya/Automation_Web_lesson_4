package org.example;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TriangleTest {

    @BeforeAll

    public static void positive_test1(){
        Triangle triangle = new Triangle(1,2,3);

        Assertions.assertTrue(triangle.getArea()>0);

    }

    @Test

    public static void negative_test1(){
        Triangle triangle = new Triangle(20,2,3);
        assertNotNull(triangle.getArea());

        Assertions.fail();

    }
    @Test

    public static void negative_test2(){
        Triangle triangle = new Triangle(0,0,0);
        assertNotNull(triangle.getArea());
        Assertions.assertTrue(false);
    }
    @Test

    public static void negative_test3(){
        Triangle triangle = new Triangle(20,30,-15);
        assertNotNull(triangle.getArea());
        Assertions.assertTrue(false);
    }

}
