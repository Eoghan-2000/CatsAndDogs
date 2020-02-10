package ie.tudublin;

public class Main
{
public static void main(String[] args) {
    

    //not polymorphism 
    Cat topcat = new Cat("Topcat");

    //polymorphism
    Animal mino = new Cat("Mino");
    
    //virtual method
    //dynamic binding
    mino.speak();

    Animal a = new Cat("a");
    Animal b = new Cat("b");

    System.out.println(a);
    System.out.println(b);

    a = b;

    a.setName("C");

    System.out.println(a);
    System.out.println(b);
}
}