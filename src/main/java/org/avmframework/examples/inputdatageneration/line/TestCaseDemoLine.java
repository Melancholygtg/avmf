package org.avmframework.examples.inputdatageneration.line;

import junit.framework.TestCase;
import org.avmframework.examples.inputdatageneration.triangle.Triangle;
import org.junit.Test;

import static org.avmframework.examples.inputdatageneration.triangle.Triangle.TriangleType.NOT_A_TRIANGLE;

public class TestCaseDemoLine extends TestCase {


    //u2 != 0, 0 <= u1, u1 <= 1, 0 <= u02, u02 <= 1
    public void test1(){
        //assertTrue();
    }

    //u2 != 0, 0 > u1, u1 <= 1, 0 <= u02, u02 <= 1
    public void test2(){
        //assertFalse();
    }

    //u2 == 0, u1t == 0
    public void test3(){
        //assertTrue();
    }

    //u2 == 0, u2t == 0
    public void test4(){
        //assertTrue();
    }

    // u2 == 0, u1t != 0, u2t != 0
    public void test5(){
        //assertFalse();
    }

    //Statement coverage is to Select enough test cases so that every executable statement
    //in the program is executed at least once.

    //There are three branches of the intersect method are not covered by your test suite
    //which are listed below.

    //u2 != 0, 0 <= u1, u1 > 1, 0 <= u02, u02 <= 1
    /*
    public void test6(){
        //assertFalse();
    }
    */

    //u2 != 0, 0 <= u1, u1 <= 1, 0 > u02, u02 <= 1
    /*
    public void test7(){
        //assertFalse();
    }
    */

    //u2 != 0, 0 <= u1, u1 <= 1, 0 <= u02, u02 > 1
    /*
    public void test8(){
        //assertFalse();
    }
    */


}
