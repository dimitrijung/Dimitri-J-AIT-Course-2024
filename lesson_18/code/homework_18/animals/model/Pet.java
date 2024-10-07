package homework_18.animals.model;

// В классе Pet имеются поля:
//   - id
//   - вид
//   - возраст
//   - кличка

public class Pet {

    private String id;
    private String kind;
    private int age;
    public String name;

    public Pet(String id, String kind, int age, String name) {
        this.id = id;
        this.kind = kind;
        this.age = age;
        this.name = name;
    }

    public void voice (){

    }
}// end of class
