public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Roman";
        person1.age = 50;
        person1.speak();
        Person person2 = new Person();
        person2.name = "Vova";
        person2.age = 20;
        person2.speak();

    }
}

class Person{
    String name;
    int age;

    void speak(){
        System.out.println("pe mine ma cheama "+name + " am "+ age +" ani");
    }

    void sayHello(){
        System.out.println("Hello");
    }
}