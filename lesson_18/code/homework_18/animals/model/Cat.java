package homework_18.animals.model;

// Создайте дочерние от класса Pet класс Cat c дополнительными полями:
//   - порода
//   - рост
//   - вес

public class Cat extends Pet {

    private String breed;
    private double height;
    private double weight;

    public Cat(String id, String kind, int age, String name, String breed, double height, double weight) {
        super(id, kind, age, name);
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }


    public void voice (){
        System.out.println(name + " says: Meow!");
    }
} // end of class
