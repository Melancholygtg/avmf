package org.avmframework.examples.inputdatageneration.triangle;

import junit.framework.Test;
import junit.framework.TestSuite;

public class TestSuitDemo{

    public static Test suite(){
        // create TestSuite object
        TestSuite testSuite=new TestSuite("All Test From TestCaseExample");
        //Add a test case collection to TestSuite, the parameters are: ClasstestClass
        //You can know through the parameters, in fact, the parameter is a subclass of TestCase
        testSuite.addTestSuite(TestCaseDemo.class);
        return testSuite;
    }
}