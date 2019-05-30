package org.itstep.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    void getArea() {

        Triangle triangle = new Triangle();
        triangle.setBase(10);
        triangle.setHeigth(16);
        Assertions.assertEquals(80, triangle.getArea());
//        Circle circle = new Circle();
//        circle.setRadius(10);
//        double testData = circle.getArea();
//        Assertions.assertEquals(314.1592, testData, 0.0001);
    }
}