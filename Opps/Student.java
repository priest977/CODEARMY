package Opps;

public class Student {
    String name;
    int rollNo;
    double percentage;
    static int noOfStudent; // Means it is shared all the constructor of same class statically;\
    // This is called default contructor
    public Student(){

    }

    // This is called Constructor
    public Student(String name , int rollNo , double percentage){
        this.name = name;
        this.rollNo = rollNo;
        this.percentage = percentage;
        noOfStudent++;
    }

    //Getter is used to get the value if the entity is private
    public int getRollNo(){
        return rollNo;
    }

    // Setter is used to set the value in private access modifire
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
}
