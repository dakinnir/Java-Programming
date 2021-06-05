public class Main {
    public static void main(String[] arguments) {
        Animal animal = new Animal(1,1,5,5, "Animal");
        Dog dog = new Dog(5,5,"Yorkie",2,1,4,20, "long silky");
        dog.eat();
        dog.walk();
//        dog.run();
    }
}
