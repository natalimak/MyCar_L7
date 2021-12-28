package my_car;

public class CarFactory {
    public Drivable getCar(String carName) throws Exception {
        if (!carName.equalsIgnoreCase("BMW")&& !carName.equalsIgnoreCase("Fiat") && !carName.equalsIgnoreCase("Porsche")) {
            throw new Exception("Wrong input");
        }
        if (carName.equalsIgnoreCase("BMW")) {
            return new BMW();
        } else if (carName.equalsIgnoreCase("Fiat")) {
            return new Fiat();
        } else if (carName.equalsIgnoreCase("Porsche")) {
            return new Porsche();
        }
        return null;
    }
}

