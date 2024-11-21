public interface NotificationService {
    void sendBookingConfirmation(String user, String hotelName, String roomType);
    void sendReminder(String user, String hotelName, String roomType, String date);
}