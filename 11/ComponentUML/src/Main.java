import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HotelService hotelService = new HotelServiceImpl();
        BookingService bookingService = new BookingServiceImpl();
        PaymentService paymentService = new PaymentServiceImpl();
        NotificationService notificationService = new NotificationServiceImpl();
        UserManagementService userManagementService = new UserManagementServiceImpl();

        UI ui = new UI(hotelService, bookingService, paymentService, notificationService, userManagementService);

        ui.start();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (userManagementService.registerUser(username, password)) {
            System.out.println("Registration successful!");
        }

        if (userManagementService.login(username, password)) {
            System.out.println("Login successful!");
        }

        System.out.print("Enter location to search hotels: ");
        String location = scanner.nextLine();
        System.out.print("Enter hotel class (e.g. 3 stars, 5 stars): ");
        String hotelClass = scanner.nextLine();
        System.out.print("Enter price range: ");
        double priceRange = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Searching for hotels...");
        hotelService.searchHotels(location, hotelClass, priceRange);

        System.out.print("Enter hotel name to view details: ");
        String hotelName = scanner.nextLine();
        String hotelDetails = hotelService.getHotelDetails(hotelName);
        System.out.println(hotelDetails);

        System.out.print("Enter room type (e.g. single, double): ");
        String roomType = scanner.nextLine();
        System.out.print("Enter start date (yyyy-mm-dd): ");
        String startDate = scanner.nextLine();
        System.out.print("Enter end date (yyyy-mm-dd): ");
        String endDate = scanner.nextLine();

        if (bookingService.checkRoomAvailability(hotelName, roomType)) {
            if (bookingService.bookRoom(hotelName, roomType, username, startDate, endDate)) {
                System.out.println("Room booked successfully!");
            }
        } else {
            System.out.println("Room is not available.");
        }

        System.out.print("Enter payment method (Credit Card/PayPal): ");
        String paymentMethod = scanner.nextLine();
        System.out.print("Enter amount to pay: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        if (paymentService.processPayment(username, amount, paymentMethod)) {
            System.out.println("Payment successful!");
        } else {
            System.out.println("Payment failed.");
        }

        notificationService.sendBookingConfirmation(username, hotelName, roomType);
        System.out.println("Sending reminder for upcoming stay...");
        notificationService.sendReminder(username, hotelName, roomType, startDate);

        scanner.close();
    }
}
