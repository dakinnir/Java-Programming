class Car {
    private String name;
    private boolean engine = true;
    private int cylinders;
    private int wheels = 4;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }
    public int getCylinders() {
        return cylinders;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }
    public String startEngine() {
        return "Car --> startEngine()!";
    }
    public String accelerate() {
        return "Car --> accelerate()!";
    }
    public String brake() {
        return "Car --> brake()!";
    }
}

class Toyota extends Car {
    public Toyota(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Engine has been started";
    }

    @Override
    public String accelerate() {
        return "Vehicle is accelerating!";
    }

    @Override
    public String brake() {
        return "The car brake is on";
    }
}

class Honda extends Car {
    public Honda(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Engine has been started";
    }

    @Override
    public String accelerate() {
        return "Vehicle is accelerating!";
    }

    @Override
    public String brake() {
        return "The car brake is on";
    }
}

class Chevy extends Car {
    public Chevy(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Engine has been started";
    }

    @Override
    public String accelerate() {
        return "Vehicle is accelerating!";
    }

    @Override
    public String brake() {
        return "The car brake is on";
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Base class", 8);
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println(car.startEngine());

        Chevy chevy = new Chevy("Malibu", 8);
        System.out.println(chevy.accelerate());
    }

}