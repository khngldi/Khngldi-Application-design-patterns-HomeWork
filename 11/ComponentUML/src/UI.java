public class UI {
    private HotelService hotelService;
    private BookingService bookingService;
    private PaymentService paymentService;
    private NotificationService notificationService;
    private UserManagementService userManagementService;

    public UI(HotelService hotelService, BookingService bookingService, PaymentService paymentService,
              NotificationService notificationService, UserManagementService userManagementService) {
        this.hotelService = hotelService;
        this.bookingService = bookingService;
        this.paymentService = paymentService;
        this.notificationService = notificationService;
        this.userManagementService = userManagementService;
    }

    public void start() {
        System.out.println("Welcome to the hotel booking system.");
    }
}
