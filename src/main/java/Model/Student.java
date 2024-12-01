package Model;


public class Student {  
    private String id;  
    private String name;  
    private double mathScore;  
    private double physicsScore;  
    private double chemistryScore;  

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMathScore() {
        return mathScore;
    }

    public double getPhysicsScore() {
        return physicsScore;
    }

    public double getChemistryScore() {
        return chemistryScore;
    }


    public Student(String id, String name, double mathScore, double physicsScore, double chemistryScore) {  
        this.id = id;  
        this.name = name;  
        this.mathScore = mathScore;  
        this.physicsScore = physicsScore;  
        this.chemistryScore = chemistryScore;  
    }  

    public double getAverageScore() {  
        return (mathScore + physicsScore + chemistryScore) / 3;  
    }  

    public String getClassification() {  
        double average = getAverageScore();  
        if (average >= 8) {  
            return "Giỏi";  
        } else if (average >= 6.5) {  
            return "Khá";  
        } else if (average >= 5) {  
            return "Trung bình";  
        } else {  
            return "Yếu";  
        }  
    }  

    @Override  
    public String toString() {  
        return "Mã Học Sinh: " + id +   
               ", Tên: " + name +   
               ", Điểm Toán: " + mathScore +   
               ", Điểm Vật Lý: " + physicsScore +   
               ", Điểm Hóa: " + chemistryScore +   
               ", Điểm Trung Bình: " + getAverageScore() +   
               ", Xếp Loại: " + getClassification();  
    } 
    
    
    
    
    
    
}  

