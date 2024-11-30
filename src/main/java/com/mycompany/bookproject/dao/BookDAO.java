
package com.mycompany.bookproject.dao;

import com.mycompany.bookproject.dataconnection.dbconnection;
import com.mycompany.bookproject.dto.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class BookDAO {
    
dbconnection accData = new dbconnection();

public Book getABook(){
   //List<Book> list = new ArrayList<>();
    Book mybook =null;
   try{
        Connection connection = accData.getConnection();
        Statement statement = connection.createStatement();           
        ResultSet rs = statement.executeQuery("SELECT * FROM students.book");
        //studentid,name,major,GPA,rank
        while (rs.next()) {      
          mybook =  new Book(rs.getString(1), rs.getString(2));                                    
        }
        
        accData.closeConnection(connection);
    
   }catch(Exception e){
     System.out.println("error access.");
   }   
    return mybook;
}

public boolean addBook(Book newBook) { 
    
        boolean isAdded = false;  
        String insertSQL = "INSERT INTO `students`.`book` (`isbn`, `title`) VALUES (?, ?)";  
 
        try (Connection connection = accData.getConnection();  
                
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {  
            preparedStatement.setString(1, newBook.getIsbn());           
            preparedStatement.setString(2, newBook.getTitle());  

            int rowsAffected = preparedStatement.executeUpdate();  
            isAdded = (rowsAffected > 0);  
            
        } catch (SQLException e) {  
            System.out.println("Error adding student: " + e.getMessage());  
        }  
        
        return isAdded;  
    }  
        
}

