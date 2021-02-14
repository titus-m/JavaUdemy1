public class Lesson20 {
    public static void main(String[] args) {

    }
}


class Human {
    private String name;
    private int age;


    public Human(){
        this("Bob", 12);
    }

    public Human(String name){
        System.out.println("hello from second constructor");
        this.name = name;
    }

    public Human(String name, int age){
        System.out.println("hello from third constructor");
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
}