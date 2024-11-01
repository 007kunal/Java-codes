package OOPS.Polymorphism;

class Student{
    String name;
    int age;
    public void printInfo(String name){
        System.out.println(name);

    }
    public void printInfo(String age){
        System.out.println(age);
    }

}

public class overload {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name="kunal";
        s1.age= 20;
    }
    
}
