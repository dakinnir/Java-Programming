public class Main {
    public static void main(String[] arguments) {
        // initial balance set to 20$
//        BankAccount defaultAccount = new BankAccount();
//        System.out.println(defaultAccount.getCustomerName());
//        BankAccount danielAccount = new BankAccount("12345", "myemail@daniel.com", "Daniel", "777-232-2323", 20.0);
//        System.out.print("Hello " + danielAccount.getCustomerName() + ". ");
//        danielAccount.deposit(100.00);
//        danielAccount.withdraw(120);


//        VipPerson oldPerson = new VipPerson();
//        System.out.println(oldPerson.getCreditLimit());

//        VipPerson newPerson = new VipPerson("Daniel", 2500.0);
//        System.out.println(newPerson.getEmailAddress());


//        Wall wall = new Wall(5,4);
//        System.out.println("Area = " + wall.getArea());
//        wall.setHeight(-1.5);
//        System.out.println("Width = " + wall.getWidth());
//        System.out.println("Height = " + wall.getHeight());
//        System.out.println("Area = " + wall.getArea());

//        Point first = new Point(6,5);
//        Point second = new Point(3,1);
//        System.out.println(first.distance(second));
//        System.out.println(first.distance(2,2));
//        Point point = new Point();
//        System.out.println(point.distance());

        ComplexNumber one = new ComplexNumber(1.0,1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("One real = " + one.getReal());
        System.out.println("One imaginary = " + one.getImaginary());
        one.subtract(number);
        System.out.println("One real = " + one.getReal());

    }

}
