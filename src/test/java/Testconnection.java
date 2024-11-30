
import com.mycompany.bookproject.dao.BookDAO;
import com.mycompany.bookproject.dataconnection.dbconnection;
import com.mycompany.bookproject.dto.Book;
import java.sql.Connection;
import java.sql.SQLException;


public class Testconnection {  
 public static void main(String[] args) throws SQLException { 
     BookDAO bookDAO = new BookDAO();
     bookDAO.addBook(new Book("12345","new boook"));
    // System.out.println( bookDAO.getABook());  
  
     
     /*
     
    dbconnection dataAccess = new dbconnection();  
    Connection connection = null;  

    try {  
       connection = dataAccess.getConnection();  
       System.out.println("connected to mysql ");
       
    } catch (SQLException e) {  
        System.err.println("can not connect to mysql " + e.getMessage());  
    } finally {  
        
        dataAccess.closeConnection(connection);  
        System.out.println("connection is closed.");  
    } 
    */
     
    }
   
}