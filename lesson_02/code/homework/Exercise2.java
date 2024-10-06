package homework;

public class Exercise2 {

    public static void main(String[] args) {
        beginning();
        ded();
        babka();
        vnuchka();
        zhuchka();
        koshka();
        mishka();

    } // end of main

    public static void beginning(){
        System.out.println("Посадил дед репку — выросла репка большая, пребольшая.");
        System.out.println("Стал дед репку из земли тащить: тянет-потянет, вытащить не может.");
    }

    public static void ded(){
        System.out.println("Позвал дед на помощь бабку.");
    }

    public static void babka(){
        System.out.println("Бабка за дедку, дедка за репку: тянут-потянут, вытянуть не могут.");
    }

    public static void vnuchka(){
        System.out.println("Позвала бабка внучку. Внучка за бабку, бабка за дедку, дедка за репку: тянут-потянут, вытянуть не могут.");
    }

    public static void zhuchka(){
        System.out.println("Кликнула внучка Жучку. Жучка за внучку, внучка за бабку, бабка за дедку, дедка за репку: тянут-потянут, вытянуть не могут.");
    }

    public static void koshka(){
        System.out.println("Кликнула Жучка кошку. Кошка за Жучку, Жучка за внучку, внучка за бабку, бабка за дедку, дедка за репку: тянут-потянут, вытянуть не могут.");
    }

    public static void mishka(){
        System.out.println("Кликнула кошка мышку. Мышка за кошку, кошка за Жучку, Жучка за внучку, внучка за бабку, бабка за дедку, дедка за репку тянут-потянут — вытащили репку!");
    }

} // end of class
