/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.SQLException;
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
public class accessDataTest {
    
    private accessData accessData;  
    private Connection connection;  
    
    public accessDataTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        accessData = new accessData();  
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getConnection method, of class accessData.
     */
    @Test  
    public void testGetConnection() {  
        try {  
            connection = accessData.getConnection();  
            assertNotNull(connection, "Connection should not be null");  
        } catch (SQLException e) {  
            e.printStackTrace();  
            // Bạn có thể có thêm assertions ở đây để xử lý các loại SQLException cụ thể nếu cần   
        }  
    } 

    
}
