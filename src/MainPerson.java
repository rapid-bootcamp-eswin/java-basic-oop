public class MainPerson {
    public static void main(String[] args) {
        //class - objectt - instance - constructor
        Person person1 = new Person();
        person1.id = 1;
        person1.name = "Roni";
        person1.address = "Ciamis";
        person1.gender = "Pria";
        person1.age = 30;
        person1.sayHello();

        Person person2 = new Person();
        person2.id = 2;
        person2.name = "LRoni";
        person2.address = "LCiamis";
        person2.gender = "Pria";
        person2.age = 32;
        person2.sayHello();
    }
}