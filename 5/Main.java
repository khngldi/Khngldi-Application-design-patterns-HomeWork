import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите тип транспорта (Car/Motorcycle/Truck/Bus): ");
        String input = scanner.nextLine();

        VehicleType vehicleType = null;
        try {
            vehicleType = VehicleType.valueOf(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Неизвестный тип транспорта.");
            return;
        }

        IVehicle vehicle = getVehicle(vehicleType);

        if (vehicle != null) {
            vehicle.drive();
            vehicle.zapravka();
        } else {
            System.out.println("Не удалось создать транспортное средство.");
        }
    }

    public static IVehicle getVehicle(VehicleType vehicleType) {
        VehicleFactory factory = null;

        switch (vehicleType) {
            case Car:
                factory = new CarFactory("Toyota", "Camry", "Petrol");
                break;
            case Motorcycle:
                factory = new MotorCycleFactory("Sport", 1000);
                break;
            case Truck:
                factory = new TruckFactory(10, 4);
                break;
            case Bus:
                factory = new BusFactory(50);
                break;
            default:
                System.out.println("Неизвестный тип транспорта.");
        }

        return factory != null ? factory.createVehicle() : null;
    }
}
