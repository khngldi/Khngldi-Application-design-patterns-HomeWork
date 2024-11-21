public interface BookingService {
    boolean bookRoom(String hotelName, String roomType, String user, String startDate, String endDate);
    boolean checkRoomAvailability(String hotelName, String roomType);
}