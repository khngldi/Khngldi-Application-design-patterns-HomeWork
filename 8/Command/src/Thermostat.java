public class Thermostat {
    private int temperature;

    public void increaseTemperature() {
        temperature++;
        System.out.println("Температура увеличена до " + temperature + " градусов.");
    }

    public void decreaseTemperature() {
        temperature--;
        System.out.println("Температура уменьшена до " + temperature + " градусов.");
    }
}
