public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("");
        person1.setAge(-54);
        System.out.println("Afisam valoarea in metoda main: "+ person1.getName());
        System.out.println("Afisam valoarea in metoda main: " +person1.getAge());

    }
}

class Person{
    private String name;
    private int age;

    public void setName(String username){
        if (username.isEmpty()){
            System.out.println("n-ai introdus numele");
        }else {
        name = username;}
    }

    public String getName(){
        return name;
    }

    public void setAge(int userage){
        if (userage<0){
            System.out.println("ai introdus un numar negativ");
        }else {
        age = userage;}
    }

    public int getAge(){
        return age;
    }

    int calculateYearsToRetirement(){
        int years = 65 - age;
        return years;
    }

//    void setNameAndAge(String username, int userage){
//        name = username;
//        age = userage;
//    }

    void speak(){
        System.out.println("pe mine ma cheama "+name + " am "+ age +" ani");
    }

    void sayHello(){
        System.out.println("Hello");
    }
}