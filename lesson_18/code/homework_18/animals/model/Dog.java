package homework_18.animals.model;

public class Dog extends Pet {

    private String breed;
    private double height;
    private double weight;


    public Dog(String id, String kind, int age, String name, String breed, double height, double weight) {
        super(id, kind, age, name);
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }

    public void voice (){
        System.out.println(name + " says: Woof-Woof!");
    }
} // end of class
