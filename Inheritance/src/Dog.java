// Inherit from the Animal class with the keyword extends
public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // Initialize the base characteristics of an Animal
    public Dog(int size, int weight, String name, int eyes, int tail, int legs, int teeth, String coat) {
        super(1, 1, size, weight, name);
        this.coat = coat;
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    // Overriding methods
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        // Go to the class we inheriting from to execute the move method and not the one below
        super.move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }
    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() is called");
    }
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
