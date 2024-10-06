package homework_17.model;

// Создать класс Cube, описывающий куб cо стороной a.
// Реализовать в нем методы определения периметра p (сумма длин всех ребер), площади s (сумма площадей всех граней) и объема v.
// Создать приложение CubeAppl, в котором создать несколько экземпляров класса Cube.
// Для каждого экземпляра вызвать методы класса Cube и рассчитать p, s и v.

public class Cube {
    // field------------------------------
    private int a;

    // constructor------------------------
    public Cube(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "a=" + a +
                '}';
    }

    // Method for perimeter---------------
    public int perimeter (){
        return 12 * a;
    }

    // Method for area--------------------
    public int area (){
        return 6 * a * a;
    }

    // Method for volume------------------
    public int volume (){
        return a * a * a;
    }



} // end of class
