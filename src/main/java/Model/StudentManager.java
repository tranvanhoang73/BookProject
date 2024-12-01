
package Model;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {  
    private List<Student> students;  

    public StudentManager() {  
        students = new ArrayList<>();  
    }  

    public void addStudent(Student student) {  
        students.add(student);  
    }  

    public void displayStudents() {  
        for (Student student : students) {  
            System.out.println(student);  
        }  
    }  
    
    public int getStudentCount() {  
        return students.size();  
    } 
}  
