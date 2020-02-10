package ie.tudublin;

public class Animal
{
    private String name;

    //constructor
    //same name as the class
    //no return type
    //if you don't add one you get a default one
    public Animal(String name)
    {
        setName(name);
    }

    public String getName()
    {
        return name; 
    }

    public void setName(String name)
    {
        this.name=name; 
    }
}