public class NotificationServiceImpl implements NotificationService {
    @Override
    public void sendBookingConfirmation(String user, String hotelName, String roomType) {
        System.out.println("Booking confirmed for " + user + " at " + hotelName);
    }

    @Override
    public void sendReminder(String user, String hotelName, String roomType, String date) {
        System.out.println("Reminder for " + user + ": Your stay at " + hotelName + " is coming soon on " + date);
    }
}