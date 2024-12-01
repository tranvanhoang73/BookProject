package DAO;

import database.accessData;
import Model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class studentDAO {
    
accessData accData = new accessData();

public boolean addStudent(Student newStudent) {  
        boolean isAdded = false;   
        String insertSQL = "INSERT INTO `students`.`student` (`id`, `name`, `math`, `physic`, `chemistry`) VALUES (?, ?, ?, ?, ?)";  
                           // "INSERT INTO `students`.`student` (`id`, `name`, `math`, `physic`, `chemistry`) VALUES ('1', 'hung', '8', '8', '8');"
        try (Connection connection = accData.getConnection();  
                
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {  
            preparedStatement.setString(1, newStudent.getId());  
            preparedStatement.setString(2, newStudent.getName());  
            preparedStatement.setDouble(3, newStudent.getMathScore());  
            preparedStatement.setDouble(4, newStudent.getPhysicsScore());  
            preparedStatement.setDouble(5, newStudent.getChemistryScore());  

            int rowsAffected = preparedStatement.executeUpdate();  
            isAdded = (rowsAffected > 0);  
            
        } catch (SQLException e) {  
            System.out.println("Error adding student: " + e.getMessage());  
        }  
        
        return isAdded;  
    }  
      
}

