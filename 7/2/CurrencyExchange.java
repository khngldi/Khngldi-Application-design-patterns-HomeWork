import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class CurrencyExchange implements Subject {
    private Map<String, Double> exchangeRates = new HashMap<>();
    private List<Observer> observers = new ArrayList<>();
    public void setRate(String valuta, double rating) {
        exchangeRates.put(valuta, rating);
    }
    public double getRate(String valuta) {
        return exchangeRates.getOrDefault(valuta, 0.0);
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers(Observer observer) {
        observers.notify();
    }
}