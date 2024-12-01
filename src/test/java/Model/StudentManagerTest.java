
package Model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class StudentManagerTest {
    
    public StudentManagerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addStudent method, of class StudentManager.
     */
    @Test  
    void testAddStudent() {  
        StudentManager manager = new StudentManager();  
        manager.addStudent(new Student("1", "Alice", 8.0, 7.0, 9.0));  
        assertEquals(1, manager.getStudentCount(),"size không đúng");  
    } 

}
