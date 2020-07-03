package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void period() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(2, 0.001));
    }

    @Test
    public void whenExist() {
        Point ap = new Point(0, 0);
        Point bp = new Point(0, 2);
        Point cp = new Point(2, 0);
        Triangle triangle = new Triangle(ap, bp, cp);
        double result = triangle.area();
        double expected = 2;
        Assert.assertEquals(expected, result,0.01);
    }

    @Test
    public void whenNotExist() {
        Point ap = new Point(0, 0);
        Point bp = new Point(0, 2);
        Point cp = new Point(0, 1);
        Triangle triangle = new Triangle(ap, bp, cp);
        double result = triangle.area();
        double expected = -1;
        Assert.assertEquals(expected, result,0.01);
    }
}