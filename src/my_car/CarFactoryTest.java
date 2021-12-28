package my_car;

import java.util.Scanner;

public class CarFactoryTest {
    public static void main(String[] args) throws Exception {
        CarFactory CarFactory = new CarFactory();

        System.out.println("Please enter your Car");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        Drivable myCar = CarFactory.getCar(input);
        System.out.println("Your Car is " );
        myCar.drive();

   }
}
