import java.util.List;

public interface HotelService {
    List<String> searchHotels(String location, String hotelClass, double priceRange);
    String getHotelDetails(String hotelName);
}