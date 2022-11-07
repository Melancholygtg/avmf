package org.avmframework.examples.inputdatageneration.line;

import junit.framework.Test;
import junit.framework.TestSuite;
import org.avmframework.examples.inputdatageneration.triangle.TestCaseDemo;

public class TestSuitDemoLine {
    public static Test suite(){
        // create TestSuite object
        TestSuite testSuite=new TestSuite("All Test From TestCaseExample");
        //Add a test case collection to TestSuite, the parameters are: ClasstestClass
        //You can know through the parameters, in fact, the parameter is a subclass of TestCase
        testSuite.addTestSuite(TestCaseDemoLine.class);
        return testSuite;
    }
}
