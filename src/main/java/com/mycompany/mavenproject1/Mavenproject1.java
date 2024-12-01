package com.mycompany.mavenproject1;

import DAO.studentDAO;
import Model.Student;
import java.sql.SQLException;  

public class Mavenproject1 {

    public static void main(String[] args) throws SQLException {
       Student student = new Student("4","hung",7,7,7);
       studentDAO studentdao =  new studentDAO();    
       studentdao.addStudent(student);
     
    }
}
