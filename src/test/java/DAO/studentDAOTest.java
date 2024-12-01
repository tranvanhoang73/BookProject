package DAO;

import Model.Student;
import database.accessData;
import java.sql.Connection;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.sql.Statement; 
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class studentDAOTest {
     private studentDAO studentDao;  
    public studentDAOTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
      @BeforeEach  
    public void setUp() {  
        studentDao = new studentDAO();  
    } 
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addStudent method, of class studentDAO.
     */
    @Test  
    public void testAddStudent() {  
        // Arrange  
        Student newStudent = new Student("25", "Test Student", 8, 7, 6);       
        // Act  
        boolean isAdded = studentDao.addStudent(newStudent);        
        // Assert  
        assertTrue(isAdded, "Student should be added successfully.");  
        
      boolean studentExists = false;  
        try (Connection connection = new accessData().getConnection();  
             Statement statement = connection.createStatement()) {  
            String querySQL = "SELECT * FROM students.student WHERE id='25'";  
            ResultSet resultSet = statement.executeQuery(querySQL);  
            studentExists = resultSet.next(); // This will be true if student is found  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  

        assertTrue(studentExists, "The added student should exist in the database.");     

       
    }  
    
}
