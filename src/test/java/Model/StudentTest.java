/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Admin
 */
public class StudentTest {
    
    public StudentTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    


    /**
     * Test of getClassification method, of class Student.
     */
    @Test  
       void testAverageScore() {  
        Student student = new Student("001", "Nguyen Van A", 8, 7, 6);  
        assertEquals(7, student.getAverageScore(), "Điểm trung bình không đúng");  
        
        
    } 
   @Test  
       void testAverageScore1() {               
        Student student = new Student("002", "Tran Thi B", 5, 4, 6);  
        assertEquals(5, student.getAverageScore(), "Điểm trung bình không đúng");  
    } 
    
}
