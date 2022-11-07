package org.avmframework.examples.inputdatageneration.triangle;

import junit.framework.TestCase;

import static org.avmframework.examples.inputdatageneration.triangle.Triangle.TriangleType.*;

public class TestCaseDemo extends TestCase {
    //id = 4T num1 + num2 = num3
    public void test_NOT_A_TRIANGLE_EQUAL(){
        assertEquals(NOT_A_TRIANGLE, Triangle.classify(1,2,3));
    }
    //id = 4T num1 + num2 < num3
    public void test_NOT_A_TRIANGLE_SMALLER(){
        assertEquals(NOT_A_TRIANGLE, Triangle.classify(1,2,4));
    }
    //id = 6F num1 == num2 != num3
    public void test_SCALENE_num1num2(){
        assertEquals(SCALENE, Triangle.classify(4,4,5));
    }
    //id = 6T num1 == num2 == num3
    public void test_EQUILATERAL(){
        assertEquals(EQUILATERAL, Triangle.classify(2,2,2));
    }
    //id =
    public void test_SCALENE(){assertEquals(SCALENE, Triangle.classify(6,8,10));}

    public void test_ISOSCELES_num2num3(){
        assertEquals(ISOSCELES, Triangle.classify(4,5,5));
    }

    public void test_ISOSCELES_num1num3(){
        assertEquals(ISOSCELES, Triangle.classify(5,4,5));
    }


}