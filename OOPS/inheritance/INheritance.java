package OOPS.inheritance;
import java.util.*;
public class INheritance {
    class Employee{
        int salary=10000;
    }
    class engineer extends Employee{
        int benefits=200;
    }
    class fee{
        public static void main(String args[]){
            engineer e1= new engineer();
            System.out.println("salary: " +e1.salary +"benefits: " + e1.benefits);

        }

    }
}
