
package Model;

import org.junit.platform.suite.api.SelectClasses;  
import org.junit.platform.suite.api.Suite;  
import org.junit.platform.suite.api.SuiteDisplayName;  

@Suite
@SelectClasses({Model.StudentManagerTest.class, Model.StudentTest.class})
@SuiteDisplayName("My JUnit 5 Test Suite") 
public class NewTestSuite {
    
}
