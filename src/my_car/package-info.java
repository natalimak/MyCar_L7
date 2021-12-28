/*
package my_car;
Using Factory pattern
         Create an interface named Drivable with a void method
        drive()
 Create 3 classes implementing Drivable
        o Fiat
        o BMW
        o Porsche
        Each class will print the following inside drive() method:
        o Fiat – 100
        o BMW – 140
        o Porsche – 180
         Create a CarFactory class
 Create a static method getCar() which will get a String
        argument which can be Fiat / BMW / Porsche and will
        return an instance of an object accordingly.

        ** In case a different String is send throw an exception.
         Create a FactoryTest class which will create a car object
        and call drive() method.*/
package my_car;