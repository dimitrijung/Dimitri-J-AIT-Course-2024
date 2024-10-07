package homework_18.animals;

// Создайте HouseAppl, в котором есть метод main.
// Поселите в доме 2 собаки и 3 кошки.
// Смоделируйте жизнь в этом доме в течение дня.

import homework_18.animals.model.Cat;
import homework_18.animals.model.Dog;
import homework_18.animals.model.Pet;

public class HouseAppl {
    public static void main(String[] args) {


        Dog dog1 = new Dog("Jack007","Dog",2,"Jack", "Labrador", 1, 5.5);
        Dog dog2 = new Dog("John007","Dog",2,"John", "Labrador", 1, 5.5);
        Dog dog3 = new Dog("Bob007","Dog",2,"Bob", "Labrador", 1, 5.5);
        Cat cat1 = new Cat("Nuri1", "Cat", 3, "Nuri", "Bengal", 0.3, 2.5);
        Cat cat2 = new Cat("Nuri1", "Cat", 3, "Emi", "Bengal", 0.3, 2.5);


        Pet[] pets = {dog1, dog2, dog3, cat1, cat2};
        for (int i = 0; i < pets.length; i++) {
            Pet pet = pets [i];
            pet.voice();
        }





    }// end of main
}// end of class
