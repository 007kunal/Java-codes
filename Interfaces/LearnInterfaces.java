package Interfaces;

public class LearnInterfaces {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.eats();
    }
    
}





interface Animal{
    public abstract void eats();

}
class Monkey implements Animal{
    @Override
    public void eats(){
        System.out.println("monkey is eating");
    }
}
