package classwork_18.computer_shop;

// Создать несколько экземпляров каждого класса.

// Какой общий объем памяти у всех устройств на складе?
// Какова общая стоимость всех устройств на складе?

import classwork_18.computer_shop.model.Computer;
import classwork_18.computer_shop.model.Laptop;
import classwork_18.computer_shop.model.Smartphone;

public class ShopAppl {
    public static void main(String[] args) {

        Computer computer1 = new Computer("i7", 8, 256, "Acer", 1200 );
        System.out.println(computer1);

        Laptop laptop1 = new Laptop("M2", 8, 256, "Apple AirBook", 2200, 13.3,1.5, 10, "Gold");
        System.out.println(laptop1);

        Computer[] computers = new Computer[6];
        computers[0] = new Computer("i7", 8, 256, "Acer", 1200);
        computers[1] = new Computer("i5", 16, 256, "HP", 1500);
        computers[2] = new Computer("AMD", 8, 256, "Asus", 2000);
        computers[3] = new Laptop("Apple", 8, 256, "MacBook", 2000, 14, 1.5,10, "Silver");
        computers[4] = new Laptop("Apple", 16, 512, "MacBook Air", 2500,14.2, 1.8,12, "Gold");
        computers[5] = new Smartphone("A1",128, 256, "Samsung", 1300, 9,1.45,12,"pink",123L);

        // Каковв общий вес всех мобильных устройств на складе?

        double totalWeight = 0;

        for (int i = 0; i < computers.length; i++) {
            if (computers[i] instanceof Laptop){
                Laptop myLaptop =(Laptop) computers[i];
                totalWeight = totalWeight + myLaptop.getWeight();
            }
        }
        System.out.println("Total weight = " + totalWeight);

        System.out.println("=================================");
        int totalSsd = 0;
        for (int i = 0; i < computers.length; i++) {
            totalSsd = totalSsd + computers[i].getSsd();
        }
        System.out.println("Total ssd: " + totalSsd);


        double totalPrice = 0;
        for (int i = 0; i < computers.length ; i++) {
            totalPrice = totalPrice + computers[i].getPrice();
        }
        System.out.println("Total price: " + totalPrice);

        System.out.println("---------------------------------");
        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i]);
        }

        System.out.println("---------------------------------");
        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i].getBrand());
        }

    } // end of main
} // end of class
