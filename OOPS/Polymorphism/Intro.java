package OOPS.Polymorphism;

import java.util.Arrays;

import OOPS.Student;
//defining a blue print
// class Pen{
//     String color;
//     String type;  
//     public void write(){
//         System.out.println("writting something");
//     } 
//     public void printColor(){
//         System.out.println(this.color);
//     }
//     public void printtype(){
//         System.out.println(this.type);
//     }
// }
class Student{
    String name;
    int age;
    public void printName(){
        System.out.println(this.name);
    }
    public void printAge(){
        System.out.println(this.age);
    
}

public class Intro {
    public static void main(String[] args) {

        // Pen pen1= new Pen();
        // pen1.color= "blue";
        // pen1.type ="gel";

        // pen1.write();
        // Pen pen2= new Pen();
        // pen2.color="black";
        // pen2.type= "ball";

        // pen1.printColor();
        // pen2.printColor();
        // pen1.printtype();
        // pen2.printtype();
    {

        }

        Student s1= new Student();
        s1.name= "kunal";
        s1.age=20;

        Student s2= new Student();
        s2.name="nigga";
        s2.age=20;

        s1.printAge();
        s2.printAge();
        s1.printName();
        s2.printName();

        
      
        }
    }
}
    
