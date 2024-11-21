import java.util.ArrayList;
import java.util.List;

public class HotelServiceImpl implements HotelService {
    @Override
    public List<String> searchHotels(String location, String hotelClass, double priceRange) {
        return new ArrayList<>();
    }

    @Override
    public String getHotelDetails(String hotelName) {
        return "Details about " + hotelName;
    }
}